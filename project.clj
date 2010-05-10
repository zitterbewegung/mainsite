(defproject compojureongae "0.1.0"
  :description "Example app for deployoing Compojure on Google App Engine"
  :namespaces [compojureongae.core]
  :dependencies [[compojure "0.4.0-SNAPSHOT"]
                 [ring/ring-servlet "0.2.1"]]
  :dev-dependencies [[leiningen/lein-swank "1.2.0-SNAPSHOT"]
                     [uk.org.alienscience/leiningen-war "0.0.2"]])