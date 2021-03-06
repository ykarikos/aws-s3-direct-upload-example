(defproject clojure-getting-started "1.0.0-SNAPSHOT"
  :description "Demo Clojure web app"
  :url "http://clojure-getting-started.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [environ "1.0.0"]
                 [amazonica "0.3.95"]
                 [ring/ring-json "0.4.0"]
                 [cheshire "5.6.3"]] ; explicit cheshire dependency added to fix java.lang.NoSuchMethodError: com.fasterxml.jackson.databind.JavaType.isReferenceType()
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]
            [lein-ring "0.11.0"]]
  :main ^:skip-aot clojure-getting-started.web
  :ring {:handler clojure-getting-started.web/app}
  :hooks [environ.leiningen.hooks]
  :uberjar-name "clojure-getting-started-standalone.jar"
  :profiles {:production {:env {:production true}}})
