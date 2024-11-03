(ns open-ai-api.specs.create-assistant-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-assistant-request-model :refer :all]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-assistant-request-data
  {
   (ds/req :model) create-assistant-request-model-spec
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :instructions) string?
   (ds/opt :tools) (s/coll-of assistant-object-tools-inner-spec)
   (ds/opt :file_ids) (s/coll-of string?)
   (ds/opt :metadata) any?
   })

(def create-assistant-request-spec
  (ds/spec
    {:name ::create-assistant-request
     :spec create-assistant-request-data}))
