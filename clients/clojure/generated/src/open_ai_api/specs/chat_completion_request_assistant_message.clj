(ns open-ai-api.specs.chat-completion-request-assistant-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-function-call :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-assistant-message-data
  {
   (ds/opt :content) string?
   (ds/req :role) string?
   (ds/opt :name) string?
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-spec)
   (ds/opt :function_call) chat-completion-request-assistant-message-function-call-spec
   })

(def chat-completion-request-assistant-message-spec
  (ds/spec
    {:name ::chat-completion-request-assistant-message
     :spec chat-completion-request-assistant-message-data}))
