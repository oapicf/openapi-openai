(ns open-ai-api.specs.create-embedding-response-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-embedding-response-usage-data
  {
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   })

(def create-embedding-response-usage-spec
  (ds/spec
    {:name ::create-embedding-response-usage
     :spec create-embedding-response-usage-data}))
