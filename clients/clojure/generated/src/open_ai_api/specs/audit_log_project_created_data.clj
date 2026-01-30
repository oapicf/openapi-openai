(ns open-ai-api.specs.audit-log-project-created-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-project-created-data-data
  {
   (ds/opt :name) string?
   (ds/opt :title) string?
   })

(def audit-log-project-created-data-spec
  (ds/spec
    {:name ::audit-log-project-created-data
     :spec audit-log-project-created-data-data}))
