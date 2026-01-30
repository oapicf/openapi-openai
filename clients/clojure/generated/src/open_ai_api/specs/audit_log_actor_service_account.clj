(ns open-ai-api.specs.audit-log-actor-service-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-actor-service-account-data
  {
   (ds/opt :id) string?
   })

(def audit-log-actor-service-account-spec
  (ds/spec
    {:name ::audit-log-actor-service-account
     :spec audit-log-actor-service-account-data}))
