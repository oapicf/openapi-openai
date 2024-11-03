(ns open-ai-api.specs.chat-completion-request-function-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-function-message-data
  {
   (ds/req :role) string?
   (ds/req :content) string?
   (ds/req :name) string?
   })

(def chat-completion-request-function-message-spec
  (ds/spec
    {:name ::chat-completion-request-function-message
     :spec chat-completion-request-function-message-data}))
