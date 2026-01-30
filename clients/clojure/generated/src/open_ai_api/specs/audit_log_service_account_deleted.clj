(ns open-ai-api.specs.audit-log-service-account-deleted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-service-account-deleted-data
  {
   (ds/opt :id) string?
   })

(def audit-log-service-account-deleted-spec
  (ds/spec
    {:name ::audit-log-service-account-deleted
     :spec audit-log-service-account-deleted-data}))
