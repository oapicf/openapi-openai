(ns open-ai-api.specs.audit-log-project
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-project-data
  {
   (ds/opt :id) string?
   (ds/opt :name) string?
   })

(def audit-log-project-spec
  (ds/spec
    {:name ::audit-log-project
     :spec audit-log-project-data}))
