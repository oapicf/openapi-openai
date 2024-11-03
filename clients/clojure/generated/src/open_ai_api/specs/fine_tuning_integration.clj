(ns open-ai-api.specs.fine-tuning-integration
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-wandb :refer :all]
            )
  (:import (java.io File)))


(def fine-tuning-integration-data
  {
   (ds/req :type) string?
   (ds/req :wandb) create-fine-tuning-job-request-integrations-inner-wandb-spec
   })

(def fine-tuning-integration-spec
  (ds/spec
    {:name ::fine-tuning-integration
     :spec fine-tuning-integration-data}))
