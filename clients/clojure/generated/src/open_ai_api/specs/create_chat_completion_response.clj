(ns open-ai-api.specs.create-chat-completion-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-chat-completion-response-choices-inner :refer :all]
            [open-ai-api.specs.completion-usage :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-response-data
  {
   (ds/req :id) string?
   (ds/req :choices) (s/coll-of create-chat-completion-response-choices-inner-spec)
   (ds/req :created) int?
   (ds/req :model) string?
   (ds/opt :system_fingerprint) string?
   (ds/req :object) string?
   (ds/opt :usage) completion-usage-spec
   })

(def create-chat-completion-response-spec
  (ds/spec
    {:name ::create-chat-completion-response
     :spec create-chat-completion-response-data}))
