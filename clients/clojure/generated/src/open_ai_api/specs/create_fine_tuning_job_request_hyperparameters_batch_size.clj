(ns open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-batch-size
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-hyperparameters-batch-size-data
  {
   })

(def create-fine-tuning-job-request-hyperparameters-batch-size-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-hyperparameters-batch-size
     :spec create-fine-tuning-job-request-hyperparameters-batch-size-data}))
