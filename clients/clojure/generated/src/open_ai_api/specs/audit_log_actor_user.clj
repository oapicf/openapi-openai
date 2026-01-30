(ns open-ai-api.specs.audit-log-actor-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-actor-user-data
  {
   (ds/opt :id) string?
   (ds/opt :email) string?
   })

(def audit-log-actor-user-spec
  (ds/spec
    {:name ::audit-log-actor-user
     :spec audit-log-actor-user-data}))
