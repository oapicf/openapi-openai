(ns open-ai-api.specs.chat-completion-request-message-content-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message-content-part-image-image-url :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   (ds/req :image_url) chat-completion-request-message-content-part-image-image-url-spec
   })

(def chat-completion-request-message-content-part-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part
     :spec chat-completion-request-message-content-part-data}))
