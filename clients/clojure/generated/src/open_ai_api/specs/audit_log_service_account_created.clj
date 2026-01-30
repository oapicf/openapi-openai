(ns open-ai-api.specs.audit-log-service-account-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-service-account-created-data :refer :all]
            )
  (:import (java.io File)))


(def audit-log-service-account-created-data
  {
   (ds/opt :id) string?
   (ds/opt :data) audit-log-service-account-created-data-spec
   })

(def audit-log-service-account-created-spec
  (ds/spec
    {:name ::audit-log-service-account-created
     :spec audit-log-service-account-created-data}))
