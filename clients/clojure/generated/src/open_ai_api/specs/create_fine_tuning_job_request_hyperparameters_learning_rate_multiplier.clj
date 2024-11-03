(ns open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier-data
  {
   })

(def create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier
     :spec create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier-data}))
