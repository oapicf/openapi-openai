(ns open-ai-api.specs.fine-tune-supervised-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tune-supervised-method-hyperparameters :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-supervised-method-data
  {
   (ds/opt :hyperparameters) fine-tune-supervised-method-hyperparameters-spec
   })

(def fine-tune-supervised-method-spec
  (ds/spec
    {:name ::fine-tune-supervised-method
     :spec fine-tune-supervised-method-data}))
