(ns open-ai-api.specs.fine-tune-dpo-method-hyperparameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-dpo-method-hyperparameters-beta :refer :all]
            [open-ai-api.specs.fine-tune-dpo-method-hyperparameters-batch-size :refer :all]
            [open-ai-api.specs.fine-tune-dpo-method-hyperparameters-learning-rate-multiplier :refer :all]
            [open-ai-api.specs.fine-tune-dpo-method-hyperparameters-n-epochs :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-hyperparameters-data
  {
   (ds/opt :beta) fine-tune-dpo-method-hyperparameters-beta-spec
   (ds/opt :batch_size) fine-tune-dpo-method-hyperparameters-batch-size-spec
   (ds/opt :learning_rate_multiplier) fine-tune-dpo-method-hyperparameters-learning-rate-multiplier-spec
   (ds/opt :n_epochs) fine-tune-dpo-method-hyperparameters-n-epochs-spec
   })

(def fine-tune-dpo-method-hyperparameters-spec
  (ds/spec
    {:name ::fine-tune-dpo-method-hyperparameters
     :spec fine-tune-dpo-method-hyperparameters-data}))
