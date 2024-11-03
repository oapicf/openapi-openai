(ns open-ai-api.specs.create-fine-tuning-job-request-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-model-data
  {
   })

(def create-fine-tuning-job-request-model-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-model
     :spec create-fine-tuning-job-request-model-data}))
