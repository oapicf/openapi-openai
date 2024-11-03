(ns open-ai-api.specs.fine-tuning-job-checkpoint
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job-checkpoint-metrics :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-job-checkpoint-data
  {
   (ds/req :id) string?
   (ds/req :created_at) int?
   (ds/req :fine_tuned_model_checkpoint) string?
   (ds/req :step_number) int?
   (ds/req :metrics) fine-tuning-job-checkpoint-metrics-spec
   (ds/req :fine_tuning_job_id) string?
   (ds/req :object) string?
   })

(def fine-tuning-job-checkpoint-spec
  (ds/spec
    {:name ::fine-tuning-job-checkpoint
     :spec fine-tuning-job-checkpoint-data}))
