(ns open-ai-api.specs.chat-completion-request-assistant-message-audio
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-assistant-message-audio-data
  {
   (ds/req :id) string?
   })

(def chat-completion-request-assistant-message-audio-spec
  (ds/spec
    {:name ::chat-completion-request-assistant-message-audio
     :spec chat-completion-request-assistant-message-audio-data}))
