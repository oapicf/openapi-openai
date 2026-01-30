(ns open-ai-api.specs.audit-log-actor-session
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-actor-user :refer :all]
            )
  (:import (java.io File)))


(def audit-log-actor-session-data
  {
   (ds/opt :user) audit-log-actor-user-spec
   (ds/opt :ip_address) string?
   })

(def audit-log-actor-session-spec
  (ds/spec
    {:name ::audit-log-actor-session
     :spec audit-log-actor-session-data}))
