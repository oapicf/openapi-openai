(ns open-ai-api.specs.message-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-object-incomplete-details :refer :all]
            [open-ai-api.specs.message-object-content-inner :refer :all]
            [open-ai-api.specs.create-message-request-attachments-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def message-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :thread_id) string?
   (ds/req :status) string?
   (ds/req :incomplete_details) message-object-incomplete-details-spec
   (ds/req :completed_at) int?
   (ds/req :incomplete_at) int?
   (ds/req :role) string?
   (ds/req :content) (s/coll-of message-object-content-inner-spec)
   (ds/req :assistant_id) string?
   (ds/req :run_id) string?
   (ds/req :attachments) (s/coll-of create-message-request-attachments-inner-spec)
   (ds/req :metadata) any?
   })

(def message-object-spec
  (ds/spec
    {:name ::message-object
     :spec message-object-data}))
