(ns open-ai-api.specs.error-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.error :refer :all]
            )
  (:import (java.io File)))


(def error-response-data
  {
   (ds/req :error) error-spec
   })

(def error-response-spec
  (ds/spec
    {:name ::error-response
     :spec error-response-data}))
