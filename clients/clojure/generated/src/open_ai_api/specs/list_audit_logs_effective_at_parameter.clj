(ns open-ai-api.specs.list-audit-logs-effective-at-parameter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def list-audit-logs-effective-at-parameter-data
  {
   (ds/opt :gt) int?
   (ds/opt :gte) int?
   (ds/opt :lt) int?
   (ds/opt :lte) int?
   })

(def list-audit-logs-effective-at-parameter-spec
  (ds/spec
    {:name ::list-audit-logs-effective-at-parameter
     :spec list-audit-logs-effective-at-parameter-data}))
