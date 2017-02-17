(ns retro-ring.step-6
  (:require [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [hiccup.core :refer [html]]))

(defroutes app
  (GET "/" [] (html [:h1 {:style "color:red"} "Hello world"]))
  (GET "/foo" [] "bar")
  (route/not-found "404 :-("))

(def handler
  (wrap-reload app))
