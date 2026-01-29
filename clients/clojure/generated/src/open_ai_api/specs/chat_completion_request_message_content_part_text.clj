(ns open-ai-api.specs.chat-completion-request-message-content-part-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-text-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   })

(def chat-completion-request-message-content-part-text-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-text
     :spec chat-completion-request-message-content-part-text-data}))
