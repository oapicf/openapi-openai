(ns open-ai-api.specs.list-fine-tuning-job-checkpoints-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job-checkpoint :refer :all]
            )
  (:import (java.io File)))


(def list-fine-tuning-job-checkpoints-response-data
  {
   (ds/req :data) (s/coll-of fine-tuning-job-checkpoint-spec)
   (ds/req :object) string?
   (ds/opt :first_id) string?
   (ds/opt :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-fine-tuning-job-checkpoints-response-spec
  (ds/spec
    {:name ::list-fine-tuning-job-checkpoints-response
     :spec list-fine-tuning-job-checkpoints-response-data}))
