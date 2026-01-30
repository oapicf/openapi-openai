(ns open-ai-api.specs.audit-log-invite-sent-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-invite-sent-data-data
  {
   (ds/opt :email) string?
   (ds/opt :role) string?
   })

(def audit-log-invite-sent-data-spec
  (ds/spec
    {:name ::audit-log-invite-sent-data
     :spec audit-log-invite-sent-data-data}))
