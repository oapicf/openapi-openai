(ns open-ai-api.specs.chat-completion-request-tool-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-tool-message-data
  {
   (ds/req :role) string?
   (ds/req :content) string?
   (ds/req :tool_call_id) string?
   })

(def chat-completion-request-tool-message-spec
  (ds/spec
    {:name ::chat-completion-request-tool-message
     :spec chat-completion-request-tool-message-data}))
