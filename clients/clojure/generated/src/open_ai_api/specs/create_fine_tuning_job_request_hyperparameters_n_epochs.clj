(ns open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-n-epochs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-hyperparameters-n-epochs-data
  {
   })

(def create-fine-tuning-job-request-hyperparameters-n-epochs-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-hyperparameters-n-epochs
     :spec create-fine-tuning-job-request-hyperparameters-n-epochs-data}))
