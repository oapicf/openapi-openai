(ns open-ai-api.specs.chat-completion-request-user-message-content-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message-content-part-image-image-url :refer :all]
            [open-ai-api.specs.chat-completion-request-message-content-part-audio-input-audio :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-user-message-content-part-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :image_url) chat-completion-request-message-content-part-image-image-url-spec
   (ds/req :input_audio) chat-completion-request-message-content-part-audio-input-audio-spec
   })

(def chat-completion-request-user-message-content-part-spec
  (ds/spec
    {:name ::chat-completion-request-user-message-content-part
     :spec chat-completion-request-user-message-content-part-data}))
