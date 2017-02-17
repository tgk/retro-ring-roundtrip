(ns retro-ring.step-4
  (:require [ring.middleware.reload :refer [wrap-reload]]))

(defn app
  [req]
  {:status 200
   :body (if (= (:uri req) "/foo")
           "baz"
           "Hello world")})

(def handler
  (wrap-reload app))
