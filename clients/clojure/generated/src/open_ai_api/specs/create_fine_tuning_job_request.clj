(ns open-ai-api.specs.create-fine-tuning-job-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-model :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner :refer :all]
            [open-ai-api.specs.fine-tune-method :refer :all]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-data
  {
   (ds/req :model) create-fine-tuning-job-request-model-spec
   (ds/req :training_file) string?
   (ds/opt :hyperparameters) create-fine-tuning-job-request-hyperparameters-spec
   (ds/opt :suffix) string?
   (ds/opt :validation_file) string?
   (ds/opt :integrations) (s/coll-of create-fine-tuning-job-request-integrations-inner-spec)
   (ds/opt :seed) int?
   (ds/opt :method) fine-tune-method-spec
   })

(def create-fine-tuning-job-request-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request
     :spec create-fine-tuning-job-request-data}))
