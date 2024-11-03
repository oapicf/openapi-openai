(ns open-ai-api.specs.chat-completion-request-assistant-message-function-call
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-assistant-message-function-call-data
  {
   (ds/req :arguments) string?
   (ds/req :name) string?
   })

(def chat-completion-request-assistant-message-function-call-spec
  (ds/spec
    {:name ::chat-completion-request-assistant-message-function-call
     :spec chat-completion-request-assistant-message-function-call-data}))
