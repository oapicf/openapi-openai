(ns open-ai-api.specs.assistants-api-response-format-option
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistants-api-response-format-option-data
  {
   (ds/opt :type) string?
   })

(def assistants-api-response-format-option-spec
  (ds/spec
    {:name ::assistants-api-response-format-option
     :spec assistants-api-response-format-option-data}))
