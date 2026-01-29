(ns open-ai-api.specs.create-chat-completion-request-stop
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-request-stop-data
  {
   })

(def create-chat-completion-request-stop-spec
  (ds/spec
    {:name ::create-chat-completion-request-stop
     :spec create-chat-completion-request-stop-data}))
