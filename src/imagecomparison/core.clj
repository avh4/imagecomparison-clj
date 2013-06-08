(ns imagecomparison.core)
(require '[midje.checking.core :as checking])

(defn- load-image [filename]
  (try
    (net.avh4.util.imagerender.ImageRenderer/getImage filename)
    (catch net.avh4.util.imagerender.UnrenderableException e
      nil)))

(defn looks-like [imagename]
  (fn [actual]
    (try
      (let [path "./"
            filename (str path imagename)
            actual-filename (str path "actual-" imagename)
            reference-image (load-image filename)
            result (net.avh4.util.imagecomparison.ImageComparison/compare actual reference-image)]
        (if (.isEqual result)
          true
          (do
            (.writeActualImageToFile result actual-filename)
            (checking/as-data-laden-falsehood
              {:notes [(.getFailureMessage result)
                       (str "actual image saved as " actual-filename)]}))))
      (catch Throwable e
        (.printStackTrace e)
        (checking/as-data-laden-falsehood
          {:notes [e]})))))
