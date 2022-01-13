(ns just-dance-clj.query
  (:require [just-dance-clj.db]
            [korma.core :refer :all]))

(defentity songs)

(defn get-songs []
  (select songs))

(defn add-song [title artist game unlimited]
  (insert songs
          (values {:title title :artist artist :game game :unlimited unlimited})))

(defn delete-song [id]
  (delete songs
          (where {:id [= id]})))

(defn get-song [id]
  (first
   (select songs
           (where {:id [= id]}))))

