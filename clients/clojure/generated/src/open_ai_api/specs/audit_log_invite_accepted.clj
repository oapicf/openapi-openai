(ns open-ai-api.specs.audit-log-invite-accepted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-invite-accepted-data
  {
   (ds/opt :id) string?
   })

(def audit-log-invite-accepted-spec
  (ds/spec
    {:name ::audit-log-invite-accepted
     :spec audit-log-invite-accepted-data}))
