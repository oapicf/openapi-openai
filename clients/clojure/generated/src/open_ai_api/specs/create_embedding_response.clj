(ns open-ai-api.specs.create-embedding-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.embedding :refer :all]
            [open-ai-api.specs.create-embedding-response-usage :refer :all]
            )
  (:import (java.io File)))


(def create-embedding-response-data
  {
   (ds/req :data) (s/coll-of embedding-spec)
   (ds/req :model) string?
   (ds/req :object) string?
   (ds/req :usage) create-embedding-response-usage-spec
   })

(def create-embedding-response-spec
  (ds/spec
    {:name ::create-embedding-response
     :spec create-embedding-response-data}))
