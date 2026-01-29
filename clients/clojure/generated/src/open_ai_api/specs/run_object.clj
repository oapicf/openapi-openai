(ns open-ai-api.specs.run-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-object-required-action :refer :all]
            [open-ai-api.specs.run-object-last-error :refer :all]
            [open-ai-api.specs.run-object-incomplete-details :refer :all]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.run-completion-usage :refer :all]
            [open-ai-api.specs.truncation-object :refer :all]
            [open-ai-api.specs.assistants-api-tool-choice-option :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
            )
  (:import (java.io File)))


(def run-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :thread_id) string?
   (ds/req :assistant_id) string?
   (ds/req :status) string?
   (ds/req :required_action) run-object-required-action-spec
   (ds/req :last_error) run-object-last-error-spec
   (ds/req :expires_at) int?
   (ds/req :started_at) int?
   (ds/req :cancelled_at) int?
   (ds/req :failed_at) int?
   (ds/req :completed_at) int?
   (ds/req :incomplete_details) run-object-incomplete-details-spec
   (ds/req :model) string?
   (ds/req :instructions) string?
   (ds/req :tools) (s/coll-of assistant-object-tools-inner-spec)
   (ds/req :file_ids) (s/coll-of string?)
   (ds/req :metadata) any?
   (ds/req :usage) run-completion-usage-spec
   (ds/opt :temperature) float?
   (ds/req :max_prompt_tokens) int?
   (ds/req :max_completion_tokens) int?
   (ds/req :truncation_strategy) truncation-object-spec
   (ds/req :tool_choice) assistants-api-tool-choice-option-spec
   (ds/req :response_format) assistants-api-response-format-option-spec
   })

(def run-object-spec
  (ds/spec
    {:name ::run-object
     :spec run-object-data}))
