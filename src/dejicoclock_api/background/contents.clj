(ns dejicoclock-api.background.contents
  (:use dejicoclock-api.background.datasource.fileddatasource)
  (:require  [cheshire.core :refer :all]
             ))

(defn contents []
  {:headers {"Content-Type" "application/json; charset=utf-8"}
   :body (generate-string (datasource))
   }
  )

