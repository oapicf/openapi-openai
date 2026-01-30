(ns open-ai-api.specs.audit-log-rate-limit-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-rate-limit-updated-changes-requested :refer :all]
            )
  (:import (java.io File)))


(def audit-log-rate-limit-updated-data
  {
   (ds/opt :id) string?
   (ds/opt :changes_requested) audit-log-rate-limit-updated-changes-requested-spec
   })

(def audit-log-rate-limit-updated-spec
  (ds/spec
    {:name ::audit-log-rate-limit-updated
     :spec audit-log-rate-limit-updated-data}))
