(ns open-ai-api.specs.chat-completion-request-message-content-part-audio-input-audio
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-audio-input-audio-data
  {
   (ds/req :data) string?
   (ds/req :format) string?
   })

(def chat-completion-request-message-content-part-audio-input-audio-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-audio-input-audio
     :spec chat-completion-request-message-content-part-audio-input-audio-data}))
