(ns open-ai-api.specs.create-embedding-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-embedding-request-input :refer :all]
            [open-ai-api.specs.create-embedding-request-model :refer :all]
            )
  (:import (java.io File)))


(def create-embedding-request-data
  {
   (ds/req :input) create-embedding-request-input-spec
   (ds/req :model) create-embedding-request-model-spec
   (ds/opt :encoding_format) string?
   (ds/opt :dimensions) int?
   (ds/opt :user) string?
   })

(def create-embedding-request-spec
  (ds/spec
    {:name ::create-embedding-request
     :spec create-embedding-request-data}))
