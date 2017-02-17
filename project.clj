(defproject retro-ring "0.1.0-SNAPSHOT"
  :description "A demo of the ring library"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.1"]
                 [compojure "1.5.2"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.11.0"]]
  :ring {:handler retro-ring.step-6/handler})
