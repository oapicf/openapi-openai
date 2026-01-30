(ns open-ai-api.specs.admin-api-key-owner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def admin-api-key-owner-data
  {
   (ds/opt :type) string?
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :created_at) int?
   (ds/opt :role) string?
   })

(def admin-api-key-owner-spec
  (ds/spec
    {:name ::admin-api-key-owner
     :spec admin-api-key-owner-data}))
