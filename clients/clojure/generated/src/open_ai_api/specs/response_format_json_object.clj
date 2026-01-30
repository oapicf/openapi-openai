(ns open-ai-api.specs.response-format-json-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def response-format-json-object-data
  {
   (ds/req :type) string?
   })

(def response-format-json-object-spec
  (ds/spec
    {:name ::response-format-json-object
     :spec response-format-json-object-data}))
