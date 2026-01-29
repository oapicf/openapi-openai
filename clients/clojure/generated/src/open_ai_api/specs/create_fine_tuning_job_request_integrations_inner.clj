(ns open-ai-api.specs.create-fine-tuning-job-request-integrations-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-wandb :refer :all]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-integrations-inner-data
  {
   (ds/req :type) string?
   (ds/req :wandb) create-fine-tuning-job-request-integrations-inner-wandb-spec
   })

(def create-fine-tuning-job-request-integrations-inner-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-integrations-inner
     :spec create-fine-tuning-job-request-integrations-inner-data}))
