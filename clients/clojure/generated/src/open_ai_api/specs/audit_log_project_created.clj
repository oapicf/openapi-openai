(ns open-ai-api.specs.audit-log-project-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-project-created-data :refer :all]
            )
  (:import (java.io File)))


(def audit-log-project-created-data
  {
   (ds/opt :id) string?
   (ds/opt :data) audit-log-project-created-data-spec
   })

(def audit-log-project-created-spec
  (ds/spec
    {:name ::audit-log-project-created
     :spec audit-log-project-created-data}))
