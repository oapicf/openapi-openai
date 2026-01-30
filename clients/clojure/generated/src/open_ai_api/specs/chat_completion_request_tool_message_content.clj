(ns open-ai-api.specs.chat-completion-request-tool-message-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-tool-message-content-data
  {
   })

(def chat-completion-request-tool-message-content-spec
  (ds/spec
    {:name ::chat-completion-request-tool-message-content
     :spec chat-completion-request-tool-message-content-data}))
