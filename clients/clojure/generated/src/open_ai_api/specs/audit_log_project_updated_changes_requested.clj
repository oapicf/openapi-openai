(ns open-ai-api.specs.audit-log-project-updated-changes-requested
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-project-updated-changes-requested-data
  {
   (ds/opt :title) string?
   })

(def audit-log-project-updated-changes-requested-spec
  (ds/spec
    {:name ::audit-log-project-updated-changes-requested
     :spec audit-log-project-updated-changes-requested-data}))
