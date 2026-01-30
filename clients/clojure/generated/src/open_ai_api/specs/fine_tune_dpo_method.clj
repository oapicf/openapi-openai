(ns open-ai-api.specs.fine-tune-dpo-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-dpo-method-hyperparameters :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-dpo-method-data
  {
   (ds/opt :hyperparameters) fine-tune-dpo-method-hyperparameters-spec
   })

(def fine-tune-dpo-method-spec
  (ds/spec
    {:name ::fine-tune-dpo-method
     :spec fine-tune-dpo-method-data}))
