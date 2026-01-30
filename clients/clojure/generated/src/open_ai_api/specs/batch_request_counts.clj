(ns open-ai-api.specs.batch-request-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-request-counts-data
  {
   (ds/req :total) int?
   (ds/req :completed) int?
   (ds/req :failed) int?
   })

(def batch-request-counts-spec
  (ds/spec
    {:name ::batch-request-counts
     :spec batch-request-counts-data}))
