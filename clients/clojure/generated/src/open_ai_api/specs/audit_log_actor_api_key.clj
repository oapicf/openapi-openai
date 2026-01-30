(ns open-ai-api.specs.audit-log-actor-api-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-actor-user :refer :all]
            [open-ai-api.specs.audit-log-actor-service-account :refer :all]
            )
  (:import (java.io File)))


(def audit-log-actor-api-key-data
  {
   (ds/opt :id) string?
   (ds/opt :type) string?
   (ds/opt :user) audit-log-actor-user-spec
   (ds/opt :service_account) audit-log-actor-service-account-spec
   })

(def audit-log-actor-api-key-spec
  (ds/spec
    {:name ::audit-log-actor-api-key
     :spec audit-log-actor-api-key-data}))
