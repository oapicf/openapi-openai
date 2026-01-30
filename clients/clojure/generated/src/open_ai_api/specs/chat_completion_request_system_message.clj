(ns open-ai-api.specs.chat-completion-request-system-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-request-system-message-content :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-request-system-message-data
  {
   (ds/req :content) chat-completion-request-system-message-content-spec
   (ds/req :role) string?
   (ds/opt :name) string?
   })

(def chat-completion-request-system-message-spec
  (ds/spec
    {:name ::chat-completion-request-system-message
     :spec chat-completion-request-system-message-data}))
