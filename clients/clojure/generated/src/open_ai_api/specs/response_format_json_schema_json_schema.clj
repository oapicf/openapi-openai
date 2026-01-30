(ns open-ai-api.specs.response-format-json-schema-json-schema
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def response-format-json-schema-json-schema-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :schema) (s/map-of string? s/any?)
   (ds/opt :strict) boolean?
   })

(def response-format-json-schema-json-schema-spec
  (ds/spec
    {:name ::response-format-json-schema-json-schema
     :spec response-format-json-schema-json-schema-data}))
