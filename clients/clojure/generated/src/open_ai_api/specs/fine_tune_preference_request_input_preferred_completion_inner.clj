(ns open-ai-api.specs.fine-tune-preference-request-input-preferred-completion-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-assistant-message-content :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-audio :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-function-call :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-preference-request-input-preferred-completion-inner-data
  {
   (ds/opt :content) chat-completion-request-assistant-message-content-spec
   (ds/opt :refusal) string?
   (ds/req :role) string?
   (ds/opt :name) string?
   (ds/opt :audio) chat-completion-request-assistant-message-audio-spec
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-spec)
   (ds/opt :function_call) chat-completion-request-assistant-message-function-call-spec
   })

(def fine-tune-preference-request-input-preferred-completion-inner-spec
  (ds/spec
    {:name ::fine-tune-preference-request-input-preferred-completion-inner
     :spec fine-tune-preference-request-input-preferred-completion-inner-data}))
