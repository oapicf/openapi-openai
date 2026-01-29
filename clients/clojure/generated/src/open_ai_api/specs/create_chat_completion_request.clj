(ns open-ai-api.specs.create-chat-completion-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message :refer :all]
            [open-ai-api.specs.create-chat-completion-request-model :refer :all]
            [open-ai-api.specs.create-chat-completion-request-response-format :refer :all]
            [open-ai-api.specs.create-chat-completion-request-stop :refer :all]
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
   (ds/opt :frequency_penalty) float?
   (ds/opt :logit_bias) (s/map-of string? int?)
   (ds/opt :logprobs) boolean?
   (ds/opt :top_logprobs) int?
   (ds/opt :max_tokens) int?
   (ds/opt :n) int?
   (ds/opt :presence_penalty) float?
   (ds/opt :response_format) create-chat-completion-request-response-format-spec
   (ds/opt :seed) int?
   (ds/opt :stop) create-chat-completion-request-stop-spec
   (ds/opt :stream) boolean?
   (ds/opt :temperature) float?
   (ds/opt :top_p) float?
   (ds/opt :tools) (s/coll-of chat-completion-tool-spec)
   (ds/opt :tool_choice) chat-completion-tool-choice-option-spec
   (ds/opt :user) string?
   (ds/opt :function_call) create-chat-completion-request-function-call-spec
   (ds/opt :functions) (s/coll-of chat-completion-functions-spec)
   })

(def create-chat-completion-request-spec
  (ds/spec
    {:name ::create-chat-completion-request
     :spec create-chat-completion-request-data}))
