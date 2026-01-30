(ns open-ai-api.specs.realtime-response-create-params-tools-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def realtime-response-create-params-tools-inner-data
  {
   (ds/opt :type) string?
   (ds/opt :name) string?
   (ds/opt :description) string?
   (ds/opt :parameters) any?
   })

(def realtime-response-create-params-tools-inner-spec
  (ds/spec
    {:name ::realtime-response-create-params-tools-inner
     :spec realtime-response-create-params-tools-inner-data}))
