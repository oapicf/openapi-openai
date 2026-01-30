(ns open-ai-api.specs.audit-log-project-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-project-updated-changes-requested :refer :all]
            )
  (:import (java.io File)))


(def audit-log-project-updated-data
  {
   (ds/opt :id) string?
   (ds/opt :changes_requested) audit-log-project-updated-changes-requested-spec
   })

(def audit-log-project-updated-spec
  (ds/spec
    {:name ::audit-log-project-updated
     :spec audit-log-project-updated-data}))
