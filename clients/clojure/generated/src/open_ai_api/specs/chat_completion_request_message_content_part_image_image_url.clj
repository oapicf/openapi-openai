(ns open-ai-api.specs.chat-completion-request-message-content-part-image-image-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-image-image-url-data
  {
   (ds/req :url) string?
   (ds/opt :detail) string?
   })

(def chat-completion-request-message-content-part-image-image-url-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-image-image-url
     :spec chat-completion-request-message-content-part-image-image-url-data}))
