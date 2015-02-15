(ns dejicoclock-api.handler
  (:use
    dejicoclock-api.background.contents)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/contents" [] (contents))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
