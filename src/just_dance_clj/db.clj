(ns just-dance-clj.db
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/postgres {:host "motty.db.elephantsql.com"
                   :port "5432"
                   :db "gbszohaw"
                   :user "gbszohaw"
                   :password "2C5tDDJiQy8MohdIc03qt3s2uoHDysq6"}))

(korma/defdb db db-connection-info)