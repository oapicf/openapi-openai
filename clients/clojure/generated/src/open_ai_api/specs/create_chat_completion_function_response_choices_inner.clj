(ns open-ai-api.specs.create-chat-completion-function-response-choices-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.chat-completion-response-message :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-function-response-choices-inner-data
  {
   (ds/req :finish_reason) string?
   (ds/req :index) int?
   (ds/req :message) chat-completion-response-message-spec
   })

(def create-chat-completion-function-response-choices-inner-spec
  (ds/spec
    {:name ::create-chat-completion-function-response-choices-inner
     :spec create-chat-completion-function-response-choices-inner-data}))
