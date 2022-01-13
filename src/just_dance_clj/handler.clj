(ns just-dance-clj.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as json]
            [ring.util.response :refer [response]]
            [just-dance-clj.query :refer :all]))

(defroutes app-routes
  (GET "/api/songs" [] (response (get-songs)))
  (GET "/api/songs/:id" [id] (response (get-song (Integer/parseInt id))))
  (POST "/api/songs" {:keys [params]} (let [{:keys [title artist game unlimited]} params] (response (add-song title artist game unlimited))))
  (DELETE "/api/songs/:id" [id] (response (delete-song (Integer/parseInt id))))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (json/wrap-json-params)
      (json/wrap-json-response)))
