(ns open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-wandb
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-integrations-inner-wandb-data
  {
   (ds/req :project) string?
   (ds/opt :name) string?
   (ds/opt :entity) string?
   (ds/opt :tags) (s/coll-of string?)
   })

(def create-fine-tuning-job-request-integrations-inner-wandb-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-integrations-inner-wandb
     :spec create-fine-tuning-job-request-integrations-inner-wandb-data}))
