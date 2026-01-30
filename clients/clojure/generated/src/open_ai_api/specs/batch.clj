(ns open-ai-api.specs.batch
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.batch-errors :refer :all]
            [open-ai-api.specs.batch-request-counts :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def batch-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :endpoint) string?
   (ds/opt :errors) batch-errors-spec
   (ds/req :input_file_id) string?
   (ds/req :completion_window) string?
   (ds/req :status) string?
   (ds/opt :output_file_id) string?
   (ds/opt :error_file_id) string?
   (ds/req :created_at) int?
   (ds/opt :in_progress_at) int?
   (ds/opt :expires_at) int?
   (ds/opt :finalizing_at) int?
   (ds/opt :completed_at) int?
   (ds/opt :failed_at) int?
   (ds/opt :expired_at) int?
   (ds/opt :cancelling_at) int?
   (ds/opt :cancelled_at) int?
   (ds/opt :request_counts) batch-request-counts-spec
   (ds/opt :metadata) any?
   })

(def batch-spec
  (ds/spec
    {:name ::batch
     :spec batch-data}))
