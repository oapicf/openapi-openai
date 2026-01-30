(ns open-ai-api.specs.create-thread-and-run-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-thread-request :refer :all]
            [open-ai-api.specs.create-run-request-model :refer :all]
            [open-ai-api.specs.create-thread-and-run-request-tools-inner :refer :all]
            [open-ai-api.specs.create-thread-and-run-request-tool-resources :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.truncation-object :refer :all]
            [open-ai-api.specs.assistants-api-tool-choice-option :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
            )
  (:import (java.io File)))


(def create-thread-and-run-request-data
  {
   (ds/req :assistant_id) string?
   (ds/opt :thread) create-thread-request-spec
   (ds/opt :model) create-run-request-model-spec
   (ds/opt :instructions) string?
   (ds/opt :tools) (s/coll-of create-thread-and-run-request-tools-inner-spec)
   (ds/opt :tool_resources) create-thread-and-run-request-tool-resources-spec
   (ds/opt :metadata) any?
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :stream) boolean?
   (ds/opt :max_prompt_tokens) int?
   (ds/opt :max_completion_tokens) int?
   (ds/opt :truncation_strategy) truncation-object-spec
   (ds/opt :tool_choice) assistants-api-tool-choice-option-spec
   (ds/opt :parallel_tool_calls) boolean?
   (ds/opt :response_format) assistants-api-response-format-option-spec
   })

(def create-thread-and-run-request-spec
  (ds/spec
    {:name ::create-thread-and-run-request
     :spec create-thread-and-run-request-data}))
