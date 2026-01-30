(ns open-ai-api.specs.audit-log-invite-sent
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-invite-sent-data :refer :all]
            )
  (:import (java.io File)))


(def audit-log-invite-sent-data
  {
   (ds/opt :id) string?
   (ds/opt :data) audit-log-invite-sent-data-spec
   })

(def audit-log-invite-sent-spec
  (ds/spec
    {:name ::audit-log-invite-sent
     :spec audit-log-invite-sent-data}))
