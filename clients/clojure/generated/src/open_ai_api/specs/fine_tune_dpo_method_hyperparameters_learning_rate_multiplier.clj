(ns open-ai-api.specs.fine-tune-dpo-method-hyperparameters-learning-rate-multiplier
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-hyperparameters-learning-rate-multiplier-data
  {
   })

(def fine-tune-dpo-method-hyperparameters-learning-rate-multiplier-spec
  (ds/spec
    {:name ::fine-tune-dpo-method-hyperparameters-learning-rate-multiplier
     :spec fine-tune-dpo-method-hyperparameters-learning-rate-multiplier-data}))
