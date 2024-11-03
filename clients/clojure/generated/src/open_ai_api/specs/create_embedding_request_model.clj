(ns open-ai-api.specs.create-embedding-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-embedding-request-model-data
  {
   })

(def create-embedding-request-model-spec
  (ds/spec
    {:name ::create-embedding-request-model
     :spec create-embedding-request-model-data}))
