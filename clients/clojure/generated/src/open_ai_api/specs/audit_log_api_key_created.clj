(ns open-ai-api.specs.audit-log-api-key-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-api-key-created-data :refer :all]
            )
  (:import (java.io File)))


(def audit-log-api-key-created-data
  {
   (ds/opt :id) string?
   (ds/opt :data) audit-log-api-key-created-data-spec
   })

(def audit-log-api-key-created-spec
  (ds/spec
    {:name ::audit-log-api-key-created
     :spec audit-log-api-key-created-data}))
