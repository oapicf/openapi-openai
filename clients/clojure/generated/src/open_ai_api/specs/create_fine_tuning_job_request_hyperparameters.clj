(ns open-ai-api.specs.create-fine-tuning-job-request-hyperparameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-batch-size :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-n-epochs :refer :all]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-hyperparameters-data
  {
   (ds/opt :batch_size) create-fine-tuning-job-request-hyperparameters-batch-size-spec
   (ds/opt :learning_rate_multiplier) create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier-spec
   (ds/opt :n_epochs) create-fine-tuning-job-request-hyperparameters-n-epochs-spec
   })

(def create-fine-tuning-job-request-hyperparameters-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-hyperparameters
     :spec create-fine-tuning-job-request-hyperparameters-data}))
