(ns open-ai-api.specs.audit-log-user-added-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-user-added-data-data
  {
   (ds/opt :role) string?
   })

(def audit-log-user-added-data-spec
  (ds/spec
    {:name ::audit-log-user-added-data
     :spec audit-log-user-added-data-data}))
