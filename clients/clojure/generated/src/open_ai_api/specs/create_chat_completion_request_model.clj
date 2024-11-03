(ns open-ai-api.specs.create-chat-completion-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-request-model-data
  {
   })

(def create-chat-completion-request-model-spec
  (ds/spec
    {:name ::create-chat-completion-request-model
     :spec create-chat-completion-request-model-data}))
