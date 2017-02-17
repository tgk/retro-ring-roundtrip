(ns retro-ring.step-3)

(defn handler
  [req]
  {:status 200
   :body (if (= (:uri req) "/foo")
           "bar"
           "Hello world")})
