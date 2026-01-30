(ns open-ai-api.specs.audit-log-organization-updated-changes-requested
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-organization-updated-changes-requested-settings :refer :all]
            )
  (:import (java.io File)))


(def audit-log-organization-updated-changes-requested-data
  {
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :settings) audit-log-organization-updated-changes-requested-settings-spec
   })

(def audit-log-organization-updated-changes-requested-spec
  (ds/spec
    {:name ::audit-log-organization-updated-changes-requested
     :spec audit-log-organization-updated-changes-requested-data}))
