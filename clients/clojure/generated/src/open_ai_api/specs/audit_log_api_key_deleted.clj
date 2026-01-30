(ns open-ai-api.specs.audit-log-api-key-deleted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-api-key-deleted-data
  {
   (ds/opt :id) string?
   })

(def audit-log-api-key-deleted-spec
  (ds/spec
    {:name ::audit-log-api-key-deleted
     :spec audit-log-api-key-deleted-data}))
