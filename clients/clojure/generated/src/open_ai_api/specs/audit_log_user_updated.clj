(ns open-ai-api.specs.audit-log-user-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-user-updated-changes-requested :refer :all]
            )
  (:import (java.io File)))


(def audit-log-user-updated-data
  {
   (ds/opt :id) string?
   (ds/opt :changes_requested) audit-log-user-updated-changes-requested-spec
   })

(def audit-log-user-updated-spec
  (ds/spec
    {:name ::audit-log-user-updated
     :spec audit-log-user-updated-data}))
