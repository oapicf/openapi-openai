(ns open-ai-api.specs.run-step-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-object-step-details :refer :all]
            [open-ai-api.specs.run-step-object-last-error :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.run-step-completion-usage :refer :all]
            )
  (:import (java.io File)))


(def run-step-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :assistant_id) string?
   (ds/req :thread_id) string?
   (ds/req :run_id) string?
   (ds/req :type) string?
   (ds/req :status) string?
   (ds/req :step_details) run-step-object-step-details-spec
   (ds/req :last_error) run-step-object-last-error-spec
   (ds/req :expired_at) int?
   (ds/req :cancelled_at) int?
   (ds/req :failed_at) int?
   (ds/req :completed_at) int?
   (ds/req :metadata) any?
   (ds/req :usage) run-step-completion-usage-spec
   })

(def run-step-object-spec
  (ds/spec
    {:name ::run-step-object
     :spec run-step-object-data}))
