(ns open-ai-api.specs.create-vector-store-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-expiration-after :refer :all]
            [open-ai-api.specs.create-vector-store-request-chunking-strategy :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-vector-store-request-data
  {
   (ds/opt :file_ids) (s/coll-of string?)
   (ds/opt :name) string?
   (ds/opt :expires_after) vector-store-expiration-after-spec
   (ds/opt :chunking_strategy) create-vector-store-request-chunking-strategy-spec
   (ds/opt :metadata) any?
   })

(def create-vector-store-request-spec
  (ds/spec
    {:name ::create-vector-store-request
     :spec create-vector-store-request-data}))
