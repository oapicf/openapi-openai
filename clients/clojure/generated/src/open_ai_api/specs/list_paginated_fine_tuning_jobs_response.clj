(ns open-ai-api.specs.list-paginated-fine-tuning-jobs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.fine-tuning-job :refer :all]
            )
  (:import (java.io File)))


(def list-paginated-fine-tuning-jobs-response-data
  {
   (ds/req :data) (s/coll-of fine-tuning-job-spec)
   (ds/req :has_more) boolean?
   (ds/req :object) string?
   })

(def list-paginated-fine-tuning-jobs-response-spec
  (ds/spec
    {:name ::list-paginated-fine-tuning-jobs-response
     :spec list-paginated-fine-tuning-jobs-response-data}))
