(ns open-ai-api.specs.assistants-api-response-format-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.response-format-json-schema-json-schema :refer :all]
            )
  (:import (java.io File)))


(def assistants-api-response-format-option-data
  {
   (ds/req :type) string?
   (ds/req :json_schema) response-format-json-schema-json-schema-spec
   })

(def assistants-api-response-format-option-spec
  (ds/spec
    {:name ::assistants-api-response-format-option
     :spec assistants-api-response-format-option-data}))
