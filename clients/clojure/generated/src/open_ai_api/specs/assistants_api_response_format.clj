(ns open-ai-api.specs.assistants-api-response-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistants-api-response-format-data
  {
   (ds/opt :type) string?
   })

(def assistants-api-response-format-spec
  (ds/spec
    {:name ::assistants-api-response-format
     :spec assistants-api-response-format-data}))
