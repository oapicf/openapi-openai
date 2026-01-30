(ns open-ai-api.specs.create-chat-completion-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message :refer :all]
            [open-ai-api.specs.create-chat-completion-request-model :refer :all]
            [open-ai-api.specs.prediction-content :refer :all]
            [open-ai-api.specs.create-chat-completion-request-audio :refer :all]
            [open-ai-api.specs.create-chat-completion-request-response-format :refer :all]
            [open-ai-api.specs.create-chat-completion-request-stop :refer :all]
            [open-ai-api.specs.chat-completion-stream-options :refer :all]
            [open-ai-api.specs.chat-completion-tool :refer :all]
            [open-ai-api.specs.chat-completion-tool-choice-option :refer :all]
            [open-ai-api.specs.create-chat-completion-request-function-call :refer :all]
            [open-ai-api.specs.chat-completion-functions :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-request-data
  {
   (ds/req :messages) (s/coll-of chat-completion-request-message-spec)
   (ds/req :model) create-chat-completion-request-model-spec
   (ds/opt :store) boolean?
   (ds/opt :reasoning_effort) string?
   (ds/opt :metadata) (s/map-of string? string?)
   (ds/opt :frequency_penalty) float?
   (ds/opt :logit_bias) (s/map-of string? int?)
   (ds/opt :logprobs) boolean?
   (ds/opt :top_logprobs) int?
   (ds/opt :max_tokens) int?
   (ds/opt :max_completion_tokens) int?
   (ds/opt :n) int?
   (ds/opt :modalities) (s/coll-of string?)
   (ds/opt :prediction) prediction-content-spec
   (ds/opt :audio) create-chat-completion-request-audio-spec
   (ds/opt :presence_penalty) float?
   (ds/opt :response_format) create-chat-completion-request-response-format-spec
   (ds/opt :seed) int?
   (ds/opt :service_tier) string?
   (ds/opt :stop) create-chat-completion-request-stop-spec
   (ds/opt :stream) boolean?
   (ds/opt :stream_options) chat-completion-stream-options-spec
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :tools) (s/coll-of chat-completion-tool-spec)
   (ds/opt :tool_choice) chat-completion-tool-choice-option-spec
   (ds/opt :parallel_tool_calls) boolean?
   (ds/opt :user) string?
   (ds/opt :function_call) create-chat-completion-request-function-call-spec
   (ds/opt :functions) (s/coll-of chat-completion-functions-spec)
   })

(def create-chat-completion-request-spec
  (ds/spec
    {:name ::create-chat-completion-request
     :spec create-chat-completion-request-data}))
