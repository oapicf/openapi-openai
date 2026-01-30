(ns open-ai-api.specs.fine-tune-dpo-method-hyperparameters-n-epochs
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-hyperparameters-n-epochs-data
  {
   })

(def fine-tune-dpo-method-hyperparameters-n-epochs-spec
  (ds/spec
    {:name ::fine-tune-dpo-method-hyperparameters-n-epochs
     :spec fine-tune-dpo-method-hyperparameters-n-epochs-data}))
