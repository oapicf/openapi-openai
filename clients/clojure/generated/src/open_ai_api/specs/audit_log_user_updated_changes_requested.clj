(ns open-ai-api.specs.audit-log-user-updated-changes-requested
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-user-updated-changes-requested-data
  {
   (ds/opt :role) string?
   })

(def audit-log-user-updated-changes-requested-spec
  (ds/spec
    {:name ::audit-log-user-updated-changes-requested
     :spec audit-log-user-updated-changes-requested-data}))
