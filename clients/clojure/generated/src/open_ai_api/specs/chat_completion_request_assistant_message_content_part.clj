(ns open-ai-api.specs.chat-completion-request-assistant-message-content-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-assistant-message-content-part-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :refusal) string?
   })

(def chat-completion-request-assistant-message-content-part-spec
  (ds/spec
    {:name ::chat-completion-request-assistant-message-content-part
     :spec chat-completion-request-assistant-message-content-part-data}))
