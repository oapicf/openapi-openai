(ns open-ai-api.specs.chat-completion-request-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-assistant-message-audio :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-function-call :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-message-data
  {
   (ds/req :content) string?
   (ds/req :role) string?
   (ds/req :name) string?
   (ds/opt :refusal) string?
   (ds/opt :audio) chat-completion-request-assistant-message-audio-spec
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-spec)
   (ds/opt :function_call) chat-completion-request-assistant-message-function-call-spec
   (ds/req :tool_call_id) string?
   })

(def chat-completion-request-message-spec
  (ds/spec
    {:name ::chat-completion-request-message
     :spec chat-completion-request-message-data}))
