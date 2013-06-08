(ns imagecomparison.core)

(defn- load-image [filename]
  (try
    (net.avh4.util.imagerender.ImageRenderer/getImage filename)
    (catch net.avh4.util.imagerender.UnrenderableException e
      nil)))

(defn looks-like [imagename]
  (fn [actual]
    (let [path "./"
          filename (str path imagename)
          reference-image (load-image filename)
          result (net.avh4.util.imagecomparison.ImageComparison/compare actual reference-image)]
      (.isEqual result))))
