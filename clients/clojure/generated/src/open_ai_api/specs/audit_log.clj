(ns open-ai-api.specs.audit-log
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.audit-log-event-type :refer :all]
            [open-ai-api.specs.audit-log-project :refer :all]
            [open-ai-api.specs.audit-log-actor :refer :all]
            [open-ai-api.specs.audit-log-api-key-created :refer :all]
            [open-ai-api.specs.audit-log-api-key-updated :refer :all]
            [open-ai-api.specs.audit-log-api-key-deleted :refer :all]
            [open-ai-api.specs.audit-log-invite-sent :refer :all]
            [open-ai-api.specs.audit-log-invite-accepted :refer :all]
            [open-ai-api.specs.audit-log-invite-accepted :refer :all]
            [open-ai-api.specs.audit-log-login-failed :refer :all]
            [open-ai-api.specs.audit-log-login-failed :refer :all]
            [open-ai-api.specs.audit-log-organization-updated :refer :all]
            [open-ai-api.specs.audit-log-project-created :refer :all]
            [open-ai-api.specs.audit-log-project-updated :refer :all]
            [open-ai-api.specs.audit-log-project-archived :refer :all]
            [open-ai-api.specs.audit-log-rate-limit-updated :refer :all]
            [open-ai-api.specs.audit-log-rate-limit-deleted :refer :all]
            [open-ai-api.specs.audit-log-service-account-created :refer :all]
            [open-ai-api.specs.audit-log-service-account-updated :refer :all]
            [open-ai-api.specs.audit-log-service-account-deleted :refer :all]
            [open-ai-api.specs.audit-log-user-added :refer :all]
            [open-ai-api.specs.audit-log-user-updated :refer :all]
            [open-ai-api.specs.audit-log-user-deleted :refer :all]
            )
  (:import (java.io File)))


(def audit-log-data
  {
   (ds/req :id) string?
   (ds/req :type) audit-log-event-type-spec
   (ds/req :effective_at) int?
   (ds/opt :project) audit-log-project-spec
   (ds/req :actor) audit-log-actor-spec
   (ds/opt :api_keycreated) audit-log-api-key-created-spec
   (ds/opt :api_keyupdated) audit-log-api-key-updated-spec
   (ds/opt :api_keydeleted) audit-log-api-key-deleted-spec
   (ds/opt :invitesent) audit-log-invite-sent-spec
   (ds/opt :inviteaccepted) audit-log-invite-accepted-spec
   (ds/opt :invitedeleted) audit-log-invite-accepted-spec
   (ds/opt :loginfailed) audit-log-login-failed-spec
   (ds/opt :logoutfailed) audit-log-login-failed-spec
   (ds/opt :organizationupdated) audit-log-organization-updated-spec
   (ds/opt :projectcreated) audit-log-project-created-spec
   (ds/opt :projectupdated) audit-log-project-updated-spec
   (ds/opt :projectarchived) audit-log-project-archived-spec
   (ds/opt :rate_limitupdated) audit-log-rate-limit-updated-spec
   (ds/opt :rate_limitdeleted) audit-log-rate-limit-deleted-spec
   (ds/opt :service_accountcreated) audit-log-service-account-created-spec
   (ds/opt :service_accountupdated) audit-log-service-account-updated-spec
   (ds/opt :service_accountdeleted) audit-log-service-account-deleted-spec
   (ds/opt :useradded) audit-log-user-added-spec
   (ds/opt :userupdated) audit-log-user-updated-spec
   (ds/opt :userdeleted) audit-log-user-deleted-spec
   })

(def audit-log-spec
  (ds/spec
    {:name ::audit-log
     :spec audit-log-data}))
