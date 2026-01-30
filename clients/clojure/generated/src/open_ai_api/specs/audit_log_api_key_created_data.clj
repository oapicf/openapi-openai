(ns open-ai-api.specs.audit-log-api-key-created-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-api-key-created-data-data
  {
   (ds/opt :scopes) (s/coll-of string?)
   })

(def audit-log-api-key-created-data-spec
  (ds/spec
    {:name ::audit-log-api-key-created-data
     :spec audit-log-api-key-created-data-data}))
