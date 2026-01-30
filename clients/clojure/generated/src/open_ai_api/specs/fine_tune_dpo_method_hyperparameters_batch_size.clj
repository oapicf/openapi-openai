(ns open-ai-api.specs.fine-tune-dpo-method-hyperparameters-batch-size
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-hyperparameters-batch-size-data
  {
   })

(def fine-tune-dpo-method-hyperparameters-batch-size-spec
  (ds/spec
    {:name ::fine-tune-dpo-method-hyperparameters-batch-size
     :spec fine-tune-dpo-method-hyperparameters-batch-size-data}))
