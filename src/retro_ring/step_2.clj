(ns retro-ring.step-2
  (:require [clojure.pprint :refer [pprint]]))

(defn handler
  [req]
  {:status 200
   :body (with-out-str (pprint req))})
