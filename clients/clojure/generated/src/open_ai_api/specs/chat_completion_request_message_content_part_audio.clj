(ns open-ai-api.specs.chat-completion-request-message-content-part-audio
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message-content-part-audio-input-audio :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-audio-data
  {
   (ds/req :type) string?
   (ds/req :input_audio) chat-completion-request-message-content-part-audio-input-audio-spec
   })

(def chat-completion-request-message-content-part-audio-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-audio
     :spec chat-completion-request-message-content-part-audio-data}))
