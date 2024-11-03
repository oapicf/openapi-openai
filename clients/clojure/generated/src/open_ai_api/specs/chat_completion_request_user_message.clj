(ns open-ai-api.specs.chat-completion-request-user-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-user-message-content :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-user-message-data
  {
   (ds/req :content) chat-completion-request-user-message-content-spec
   (ds/req :role) string?
   (ds/opt :name) string?
   })

(def chat-completion-request-user-message-spec
  (ds/spec
    {:name ::chat-completion-request-user-message
     :spec chat-completion-request-user-message-data}))
