(ns open-ai-api.specs.audit-log-organization-updated-changes-requested-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-organization-updated-changes-requested-settings-data
  {
   (ds/opt :threads_ui_visibility) string?
   (ds/opt :usage_dashboard_visibility) string?
   })

(def audit-log-organization-updated-changes-requested-settings-spec
  (ds/spec
    {:name ::audit-log-organization-updated-changes-requested-settings
     :spec audit-log-organization-updated-changes-requested-settings-data}))
