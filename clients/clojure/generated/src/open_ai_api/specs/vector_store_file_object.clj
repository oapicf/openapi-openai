(ns open-ai-api.specs.vector-store-file-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-file-object-last-error :refer :all]
            [open-ai-api.specs.vector-store-file-object-chunking-strategy :refer :all]
            )
  (:import (java.io File)))


(def vector-store-file-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :usage_bytes) int?
   (ds/req :created_at) int?
   (ds/req :vector_store_id) string?
   (ds/req :status) string?
   (ds/req :last_error) vector-store-file-object-last-error-spec
   (ds/opt :chunking_strategy) vector-store-file-object-chunking-strategy-spec
   })

(def vector-store-file-object-spec
  (ds/spec
    {:name ::vector-store-file-object
     :spec vector-store-file-object-data}))
