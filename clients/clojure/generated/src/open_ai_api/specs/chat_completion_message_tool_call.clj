(ns open-ai-api.specs.chat-completion-message-tool-call
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-message-tool-call-function :refer :all]
            )
  (:import (java.io File)))


(def chat-completion-message-tool-call-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :function) chat-completion-message-tool-call-function-spec
   })

(def chat-completion-message-tool-call-spec
  (ds/spec
    {:name ::chat-completion-message-tool-call
     :spec chat-completion-message-tool-call-data}))
