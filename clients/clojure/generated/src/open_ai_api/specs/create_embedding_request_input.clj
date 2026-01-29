(ns open-ai-api.specs.create-embedding-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-embedding-request-input-data
  {
   })

(def create-embedding-request-input-spec
  (ds/spec
    {:name ::create-embedding-request-input
     :spec create-embedding-request-input-data}))
