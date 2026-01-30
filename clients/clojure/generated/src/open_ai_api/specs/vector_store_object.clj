(ns open-ai-api.specs.vector-store-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-object-file-counts :refer :all]
            [open-ai-api.specs.vector-store-expiration-after :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def vector-store-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :name) string?
   (ds/req :usage_bytes) int?
   (ds/req :file_counts) vector-store-object-file-counts-spec
   (ds/req :status) string?
   (ds/opt :expires_after) vector-store-expiration-after-spec
   (ds/opt :expires_at) int?
   (ds/req :last_active_at) int?
   (ds/req :metadata) any?
   })

(def vector-store-object-spec
  (ds/spec
    {:name ::vector-store-object
     :spec vector-store-object-data}))
