(ns open-ai-api.specs.audit-log-api-key-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-api-key-updated-changes-requested :refer :all]
            )
  (:import (java.io File)))


(def audit-log-api-key-updated-data
  {
   (ds/opt :id) string?
   (ds/opt :changes_requested) audit-log-api-key-updated-changes-requested-spec
   })

(def audit-log-api-key-updated-spec
  (ds/spec
    {:name ::audit-log-api-key-updated
     :spec audit-log-api-key-updated-data}))
