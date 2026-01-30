(ns open-ai-api.specs.create-chat-completion-stream-response-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-stream-response-usage-data
  {
   (ds/req :completion_tokens) int?
   (ds/req :prompt_tokens) int?
   (ds/req :total_tokens) int?
   })

(def create-chat-completion-stream-response-usage-spec
  (ds/spec
    {:name ::create-chat-completion-stream-response-usage
     :spec create-chat-completion-stream-response-usage-data}))
