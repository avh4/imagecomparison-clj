(defproject net.avh4.clj/imagecomparison "1.0.1-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "Tools for comparing images and writing image-based approval tests"
  :url "http://github.com/avh4/imagecomparison-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.avh4.util/imagecomparison "0.3.0"]]
  :profiles {
    :dev {
      :plugins [[lein-midje "3.0.0"]]
      :dependencies [[midje "1.5.0"]] }}

  :deploy-repositories {"releases" {:url "https://oss.sonatype.org/service/local/staging/deploy/maven2/"}
                        "snapshots" {:url "https://oss.sonatype.org/content/repositories/snapshots/"}}
  :scm {:url "git@github.com:avh4/imagecomparison-clj.git"}
  :pom-addition [:developers [:developer
                              [:name "Aaron VonderHaar"]
                              [:email "gruen0aermel@gmail.com"]]] )
