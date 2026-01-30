(ns open-ai-api.specs.vector-store-file-batch-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-file-batch-object-file-counts :refer :all]
            )
  (:import (java.io File)))


(def vector-store-file-batch-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :vector_store_id) string?
   (ds/req :status) string?
   (ds/req :file_counts) vector-store-file-batch-object-file-counts-spec
   })

(def vector-store-file-batch-object-spec
  (ds/spec
    {:name ::vector-store-file-batch-object
     :spec vector-store-file-batch-object-data}))
