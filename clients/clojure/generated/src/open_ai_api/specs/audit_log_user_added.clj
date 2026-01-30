(ns open-ai-api.specs.audit-log-user-added
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-user-added-data :refer :all]
            )
  (:import (java.io File)))


(def audit-log-user-added-data
  {
   (ds/opt :id) string?
   (ds/opt :data) audit-log-user-added-data-spec
   })

(def audit-log-user-added-spec
  (ds/spec
    {:name ::audit-log-user-added
     :spec audit-log-user-added-data}))
