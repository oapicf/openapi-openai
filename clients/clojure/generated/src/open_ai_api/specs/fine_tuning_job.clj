(ns open-ai-api.specs.fine-tuning-job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job-error :refer :all]
            [open-ai-api.specs.fine-tuning-job-hyperparameters :refer :all]
            [open-ai-api.specs.fine-tuning-job-integrations-inner :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-job-data
  {
   (ds/req :id) string?
   (ds/req :created_at) int?
   (ds/req :error) fine-tuning-job-error-spec
   (ds/req :fine_tuned_model) string?
   (ds/req :finished_at) int?
   (ds/req :hyperparameters) fine-tuning-job-hyperparameters-spec
   (ds/req :model) string?
   (ds/req :object) string?
   (ds/req :organization_id) string?
   (ds/req :result_files) (s/coll-of string?)
   (ds/req :status) string?
   (ds/req :trained_tokens) int?
   (ds/req :training_file) string?
   (ds/req :validation_file) string?
   (ds/opt :integrations) (s/coll-of fine-tuning-job-integrations-inner-spec)
   (ds/req :seed) int?
   })

(def fine-tuning-job-spec
  (ds/spec
    {:name ::fine-tuning-job
     :spec fine-tuning-job-data}))
