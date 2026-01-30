(ns open-ai-api.specs.modify-assistant-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs.modify-assistant-request-tool-resources :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
            )
  (:import (java.io File)))


(def modify-assistant-request-data
  {
   (ds/opt :model) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :instructions) string?
   (ds/opt :tools) (s/coll-of assistant-object-tools-inner-spec)
   (ds/opt :tool_resources) modify-assistant-request-tool-resources-spec
   (ds/opt :metadata) any?
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :response_format) assistants-api-response-format-option-spec
   })

(def modify-assistant-request-spec
  (ds/spec
    {:name ::modify-assistant-request
     :spec modify-assistant-request-data}))
