(defproject net.avh4.clj/imagecomparison "0.3.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.avh4.util/imagecomparison "0.3.0"]]
  :profiles {
    :dev {
      :plugins [[lein-midje "3.0.0"]]
      :dependencies [[midje "1.5.0"]] }} )
