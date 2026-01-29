(ns open-ai-api.specs.create-chat-completion-request-function-call
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-request-function-call-data
  {
   (ds/req :name) string?
   })

(def create-chat-completion-request-function-call-spec
  (ds/spec
    {:name ::create-chat-completion-request-function-call
     :spec create-chat-completion-request-function-call-data}))
