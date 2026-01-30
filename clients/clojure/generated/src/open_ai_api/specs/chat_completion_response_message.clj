(ns open-ai-api.specs.chat-completion-response-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-response-message-function-call :refer :all]
            [open-ai-api.specs.chat-completion-response-message-audio :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-response-message-data
  {
   (ds/req :content) string?
   (ds/req :refusal) string?
   (ds/opt :tool_calls) (s/coll-of chat-completion-message-tool-call-spec)
   (ds/req :role) string?
   (ds/opt :function_call) chat-completion-response-message-function-call-spec
   (ds/opt :audio) chat-completion-response-message-audio-spec
   })

(def chat-completion-response-message-spec
  (ds/spec
    {:name ::chat-completion-response-message
     :spec chat-completion-response-message-data}))
