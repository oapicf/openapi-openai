(ns open-ai-api.specs.chat-completion-request-message-content-part-refusal
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def chat-completion-request-message-content-part-refusal-data
  {
   (ds/req :type) string?
   (ds/req :refusal) string?
   })

(def chat-completion-request-message-content-part-refusal-spec
  (ds/spec
    {:name ::chat-completion-request-message-content-part-refusal
     :spec chat-completion-request-message-content-part-refusal-data}))
