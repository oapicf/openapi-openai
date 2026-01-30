(ns open-ai-api.specs.chat-completion-request-developer-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-developer-message-content :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-developer-message-data
  {
   (ds/req :content) chat-completion-request-developer-message-content-spec
   (ds/req :role) string?
   (ds/opt :name) string?
   })

(def chat-completion-request-developer-message-spec
  (ds/spec
    {:name ::chat-completion-request-developer-message
     :spec chat-completion-request-developer-message-data}))
