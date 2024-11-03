(ns open-ai-api.specs.fine-tuning-job-hyperparameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job-hyperparameters-n-epochs :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-job-hyperparameters-data
  {
   (ds/req :n_epochs) fine-tuning-job-hyperparameters-n-epochs-spec
   })

(def fine-tuning-job-hyperparameters-spec
  (ds/spec
    {:name ::fine-tuning-job-hyperparameters
     :spec fine-tuning-job-hyperparameters-data}))
