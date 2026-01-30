(ns open-ai-api.specs.response-format-text
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def response-format-text-data
  {
   (ds/req :type) string?
   })

(def response-format-text-spec
  (ds/spec
    {:name ::response-format-text
     :spec response-format-text-data}))
