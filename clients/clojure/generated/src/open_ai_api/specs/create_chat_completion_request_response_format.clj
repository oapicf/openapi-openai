(ns open-ai-api.specs.create-chat-completion-request-response-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-chat-completion-request-response-format-data
  {
   (ds/opt :type) string?
   })

(def create-chat-completion-request-response-format-spec
  (ds/spec
    {:name ::create-chat-completion-request-response-format
     :spec create-chat-completion-request-response-format-data}))
