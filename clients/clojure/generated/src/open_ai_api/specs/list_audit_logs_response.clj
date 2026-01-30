(ns open-ai-api.specs.list-audit-logs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log :refer :all]
            )
  (:import (java.io File)))


(def list-audit-logs-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of audit-log-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-audit-logs-response-spec
  (ds/spec
    {:name ::list-audit-logs-response
     :spec list-audit-logs-response-data}))
