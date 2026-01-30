(ns open-ai-api.specs.user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :email) string?
   (ds/req :role) string?
   (ds/req :added_at) int?
   })

(def user-spec
  (ds/spec
    {:name ::user
     :spec user-data}))
