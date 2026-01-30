(ns open-ai-api.specs.fine-tuning-job-hyperparameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-batch-size :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-n-epochs :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-job-hyperparameters-data
  {
   (ds/opt :batch_size) create-fine-tuning-job-request-hyperparameters-batch-size-spec
   (ds/opt :learning_rate_multiplier) create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier-spec
   (ds/opt :n_epochs) create-fine-tuning-job-request-hyperparameters-n-epochs-spec
   })

(def fine-tuning-job-hyperparameters-spec
  (ds/spec
    {:name ::fine-tuning-job-hyperparameters
     :spec fine-tuning-job-hyperparameters-data}))
