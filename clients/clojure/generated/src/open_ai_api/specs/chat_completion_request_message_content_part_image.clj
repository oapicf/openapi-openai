(ns open-ai-api.specs.chat-completion-request-message-content-part-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-message-content-part-image-image-url :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-image-data
  {
   (ds/req :type) string?
   (ds/req :image_url) chat-completion-request-message-content-part-image-image-url-spec
   })

(def chat-completion-request-message-content-part-image-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-image
     :spec chat-completion-request-message-content-part-image-data}))
