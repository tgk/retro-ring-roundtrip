(ns retro-ring.step-5
  (:require [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "Hello world")
  (GET "/foo" [] "bar")
  (route/not-found "404 :-("))

(def handler
  (wrap-reload app))
