(ns open-ai-api.specs.chat-completion-response-message-audio
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-response-message-audio-data
  {
   (ds/req :id) string?
   (ds/req :expires_at) int?
   (ds/req :data) string?
   (ds/req :transcript) string?
   })

(def chat-completion-response-message-audio-spec
  (ds/spec
    {:name ::chat-completion-response-message-audio
     :spec chat-completion-response-message-audio-data}))
