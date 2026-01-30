(ns open-ai-api.specs.audit-log-service-account-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-service-account-updated-changes-requested :refer :all]
            )
  (:import (java.io File)))


(def audit-log-service-account-updated-data
  {
   (ds/opt :id) string?
   (ds/opt :changes_requested) audit-log-service-account-updated-changes-requested-spec
   })

(def audit-log-service-account-updated-spec
  (ds/spec
    {:name ::audit-log-service-account-updated
     :spec audit-log-service-account-updated-data}))
