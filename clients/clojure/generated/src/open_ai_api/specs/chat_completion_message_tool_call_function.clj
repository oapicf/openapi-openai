(ns open-ai-api.specs.chat-completion-message-tool-call-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-message-tool-call-function-data
  {
   (ds/req :name) string?
   (ds/req :arguments) string?
   })

(def chat-completion-message-tool-call-function-spec
  (ds/spec
    {:name ::chat-completion-message-tool-call-function
     :spec chat-completion-message-tool-call-function-data}))
