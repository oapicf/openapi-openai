(ns open-ai-api.specs.list-fine-tuning-job-events-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job-event :refer :all]
            )
  (:import (java.io File)))


(def list-fine-tuning-job-events-response-data
  {
   (ds/req :data) (s/coll-of fine-tuning-job-event-spec)
   (ds/req :object) string?
   })

(def list-fine-tuning-job-events-response-spec
  (ds/spec
    {:name ::list-fine-tuning-job-events-response
     :spec list-fine-tuning-job-events-response-data}))
