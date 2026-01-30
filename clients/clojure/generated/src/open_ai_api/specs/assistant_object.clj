(ns open-ai-api.specs.assistant-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs.assistant-object-tool-resources :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
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
   (ds/opt :tool_resources) assistant-object-tool-resources-spec
   (ds/req :metadata) any?
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :response_format) assistants-api-response-format-option-spec
   })

(def assistant-object-spec
  (ds/spec
    {:name ::assistant-object
     :spec assistant-object-data}))
