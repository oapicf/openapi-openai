(ns open-ai-api.specs.fine-tuning-job-checkpoint-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tuning-job-checkpoint-metrics-data
  {
   (ds/opt :step) float?
   (ds/opt :train_loss) float?
   (ds/opt :train_mean_token_accuracy) float?
   (ds/opt :valid_loss) float?
   (ds/opt :valid_mean_token_accuracy) float?
   (ds/opt :full_valid_loss) float?
   (ds/opt :full_valid_mean_token_accuracy) float?
   })

(def fine-tuning-job-checkpoint-metrics-spec
  (ds/spec
    {:name ::fine-tuning-job-checkpoint-metrics
     :spec fine-tuning-job-checkpoint-metrics-data}))
