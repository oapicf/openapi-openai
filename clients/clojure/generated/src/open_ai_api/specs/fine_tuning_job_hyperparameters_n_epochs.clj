(ns open-ai-api.specs.fine-tuning-job-hyperparameters-n-epochs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tuning-job-hyperparameters-n-epochs-data
  {
   })

(def fine-tuning-job-hyperparameters-n-epochs-spec
  (ds/spec
    {:name ::fine-tuning-job-hyperparameters-n-epochs
     :spec fine-tuning-job-hyperparameters-n-epochs-data}))
