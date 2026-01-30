(ns open-ai-api.specs.audit-log-service-account-created-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-service-account-created-data-data
  {
   (ds/opt :role) string?
   })

(def audit-log-service-account-created-data-spec
  (ds/spec
    {:name ::audit-log-service-account-created-data
     :spec audit-log-service-account-created-data-data}))
