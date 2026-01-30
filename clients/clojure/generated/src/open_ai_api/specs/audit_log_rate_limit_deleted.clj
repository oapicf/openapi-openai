(ns open-ai-api.specs.audit-log-rate-limit-deleted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-rate-limit-deleted-data
  {
   (ds/opt :id) string?
   })

(def audit-log-rate-limit-deleted-spec
  (ds/spec
    {:name ::audit-log-rate-limit-deleted
     :spec audit-log-rate-limit-deleted-data}))
