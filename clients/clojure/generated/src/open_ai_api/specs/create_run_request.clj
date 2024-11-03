(ns open-ai-api.specs.create-run-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-run-request-model :refer :all]
            [open-ai-api.specs.create-message-request :refer :all]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.truncation-object :refer :all]
            [open-ai-api.specs.assistants-api-tool-choice-option :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
            )
  (:import (java.io File)))


(def create-run-request-data
  {
   (ds/req :assistant_id) string?
   (ds/opt :model) create-run-request-model-spec
   (ds/opt :instructions) string?
   (ds/opt :additional_instructions) string?
   (ds/opt :additional_messages) (s/coll-of create-message-request-spec)
   (ds/opt :tools) (s/coll-of assistant-object-tools-inner-spec)
   (ds/opt :metadata) any?
   (ds/opt :temperature) float?
   (ds/opt :stream) boolean?
   (ds/opt :max_prompt_tokens) int?
   (ds/opt :max_completion_tokens) int?
   (ds/opt :truncation_strategy) truncation-object-spec
   (ds/opt :tool_choice) assistants-api-tool-choice-option-spec
   (ds/opt :response_format) assistants-api-response-format-option-spec
   })

(def create-run-request-spec
  (ds/spec
    {:name ::create-run-request
     :spec create-run-request-data}))
