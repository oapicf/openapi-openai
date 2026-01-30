(ns open-ai-api.specs.audit-log-user-deleted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-user-deleted-data
  {
   (ds/opt :id) string?
   })

(def audit-log-user-deleted-spec
  (ds/spec
    {:name ::audit-log-user-deleted
     :spec audit-log-user-deleted-data}))
