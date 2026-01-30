(ns open-ai-api.specs.audit-log-api-key-updated-changes-requested
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-api-key-updated-changes-requested-data
  {
   (ds/opt :scopes) (s/coll-of string?)
   })

(def audit-log-api-key-updated-changes-requested-spec
  (ds/spec
    {:name ::audit-log-api-key-updated-changes-requested
     :spec audit-log-api-key-updated-changes-requested-data}))
