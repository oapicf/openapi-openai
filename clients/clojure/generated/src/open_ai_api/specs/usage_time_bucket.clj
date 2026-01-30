(ns open-ai-api.specs.usage-time-bucket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.usage-time-bucket-result-inner :refer :all]
            )
  (:import (java.io File)))


(def usage-time-bucket-data
  {
   (ds/req :object) string?
   (ds/req :start_time) int?
   (ds/req :end_time) int?
   (ds/req :result) (s/coll-of usage-time-bucket-result-inner-spec)
   })

(def usage-time-bucket-spec
  (ds/spec
    {:name ::usage-time-bucket
     :spec usage-time-bucket-data}))
