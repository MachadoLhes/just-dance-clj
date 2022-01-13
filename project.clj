(defproject just-dance-clj "0.1.0-SNAPSHOT"
  :description "just-dance-clj: A remake of the Just Dance API"
  :url "https://github.com/MachadoLhes/just-dance-clj"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.9.4"]
                 [ring/ring-json "0.5.1"]
                 [ring/ring-defaults "0.3.2"]
                 [korma "0.4.3"]
                 [org.postgresql/postgresql "42.1.4"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler just-dance-clj.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
