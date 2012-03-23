(defproject compojure-spike "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.1"]]
  :dev-dependencies [[ring-serve "0.1.2"]]
  :ring {:handler compojure-spike.core/app})
