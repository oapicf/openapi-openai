(ns open-ai-api.specs.create-vector-store-file-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chunking-strategy-request-param :refer :all]
            )
  (:import (java.io File)))


(def create-vector-store-file-request-data
  {
   (ds/req :file_id) string?
   (ds/opt :chunking_strategy) chunking-strategy-request-param-spec
   })

(def create-vector-store-file-request-spec
  (ds/spec
    {:name ::create-vector-store-file-request
     :spec create-vector-store-file-request-data}))
