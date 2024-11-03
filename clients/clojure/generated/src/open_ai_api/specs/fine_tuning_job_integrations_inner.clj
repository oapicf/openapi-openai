(ns open-ai-api.specs.fine-tuning-job-integrations-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-wandb :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-job-integrations-inner-data
  {
   (ds/req :type) string?
   (ds/req :wandb) create-fine-tuning-job-request-integrations-inner-wandb-spec
   })

(def fine-tuning-job-integrations-inner-spec
  (ds/spec
    {:name ::fine-tuning-job-integrations-inner
     :spec fine-tuning-job-integrations-inner-data}))
