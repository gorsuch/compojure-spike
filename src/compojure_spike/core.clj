(ns compojure-spike.core
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]))

(defroutes main-routes
  (GET "/" [] "<p>Neato.</p>")
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))

(def app (handler/site main-routes))
