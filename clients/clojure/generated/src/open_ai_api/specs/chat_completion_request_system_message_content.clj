(ns open-ai-api.specs.chat-completion-request-system-message-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-system-message-content-data
  {
   })

(def chat-completion-request-system-message-content-spec
  (ds/spec
    {:name ::chat-completion-request-system-message-content
     :spec chat-completion-request-system-message-content-data}))
