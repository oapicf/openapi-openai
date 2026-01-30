(ns open-ai-api.specs.fine-tune-dpo-method-hyperparameters-beta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-hyperparameters-beta-data
  {
   })

(def fine-tune-dpo-method-hyperparameters-beta-spec
  (ds/spec
    {:name ::fine-tune-dpo-method-hyperparameters-beta
     :spec fine-tune-dpo-method-hyperparameters-beta-data}))
