(ns open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-fine-tuning-job-request-integrations-inner-type-data
  {
   })

(def create-fine-tuning-job-request-integrations-inner-type-spec
  (ds/spec
    {:name ::create-fine-tuning-job-request-integrations-inner-type
     :spec create-fine-tuning-job-request-integrations-inner-type-data}))
