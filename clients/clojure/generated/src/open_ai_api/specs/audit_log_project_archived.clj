(ns open-ai-api.specs.audit-log-project-archived
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-project-archived-data
  {
   (ds/opt :id) string?
   })

(def audit-log-project-archived-spec
  (ds/spec
    {:name ::audit-log-project-archived
     :spec audit-log-project-archived-data}))
