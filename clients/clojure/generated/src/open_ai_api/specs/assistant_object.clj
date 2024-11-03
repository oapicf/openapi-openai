(ns open-ai-api.specs.assistant-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def assistant-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :name) string?
   (ds/req :description) string?
   (ds/req :model) string?
   (ds/req :instructions) string?
   (ds/req :tools) (s/coll-of assistant-object-tools-inner-spec)
   (ds/req :file_ids) (s/coll-of string?)
   (ds/req :metadata) any?
   })

(def assistant-object-spec
  (ds/spec
    {:name ::assistant-object
     :spec assistant-object-data}))
