(ns open-ai-api.specs.chat-completion-response-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-function-call :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-response-message-data
  {
   (ds/req :content) string?
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-spec)
   (ds/req :role) string?
   (ds/opt :function_call) chat-completion-request-assistant-message-function-call-spec
   })

(def chat-completion-response-message-spec
  (ds/spec
    {:name ::chat-completion-response-message
     :spec chat-completion-response-message-data}))
