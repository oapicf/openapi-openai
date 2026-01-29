(ns open-ai-api.specs.fine-tuning-job-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tuning-job-event-data
  {
   (ds/req :id) string?
   (ds/req :created_at) int?
   (ds/req :level) string?
   (ds/req :message) string?
   (ds/req :object) string?
   })

(def fine-tuning-job-event-spec
  (ds/spec
    {:name ::fine-tuning-job-event
     :spec fine-tuning-job-event-data}))
