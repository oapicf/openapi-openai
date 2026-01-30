(ns open-ai-api.specs.response-format-json-schema
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.response-format-json-schema-json-schema :refer :all]
            )
  (:import (java.io File)))


(def response-format-json-schema-data
  {
   (ds/req :type) string?
   (ds/req :json_schema) response-format-json-schema-json-schema-spec
   })

(def response-format-json-schema-spec
  (ds/spec
    {:name ::response-format-json-schema
     :spec response-format-json-schema-data}))
