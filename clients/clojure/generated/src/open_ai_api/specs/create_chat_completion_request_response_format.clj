(ns open-ai-api.specs.create-chat-completion-request-response-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.response-format-json-schema-json-schema :refer :all]
            )
  (:import (java.io File)))


(def create-chat-completion-request-response-format-data
  {
   (ds/req :type) string?
   (ds/req :json_schema) response-format-json-schema-json-schema-spec
   })

(def create-chat-completion-request-response-format-spec
  (ds/spec
    {:name ::create-chat-completion-request-response-format
     :spec create-chat-completion-request-response-format-data}))
