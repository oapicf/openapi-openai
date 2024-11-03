(ns open-ai-api.specs.create-chat-completion-stream-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-chat-completion-stream-response-choices-inner :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-stream-response-data
  {
   (ds/req :id) string?
   (ds/req :choices) (s/coll-of create-chat-completion-stream-response-choices-inner-spec)
   (ds/req :created) int?
   (ds/req :model) string?
   (ds/opt :system_fingerprint) string?
   (ds/req :object) string?
   })

(def create-chat-completion-stream-response-spec
  (ds/spec
    {:name ::create-chat-completion-stream-response
     :spec create-chat-completion-stream-response-data}))
