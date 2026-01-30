(ns open-ai-api.specs.admin-api-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.admin-api-key-owner :refer :all]
            )
  (:import (java.io File)))


(def admin-api-key-data
  {
   (ds/opt :object) string?
   (ds/opt :id) string?
   (ds/opt :name) string?
   (ds/opt :redacted_value) string?
   (ds/opt :value) string?
   (ds/opt :created_at) int?
   (ds/opt :owner) admin-api-key-owner-spec
   })

(def admin-api-key-spec
  (ds/spec
    {:name ::admin-api-key
     :spec admin-api-key-data}))
