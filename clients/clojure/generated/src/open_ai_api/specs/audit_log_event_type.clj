(ns open-ai-api.specs.audit-log-event-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-event-type-data
  {
   })

(def audit-log-event-type-spec
  (ds/spec
    {:name ::audit-log-event-type
     :spec audit-log-event-type-data}))
