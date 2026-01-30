(ns open-ai-api.specs.invite
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.invite-projects-inner :refer :all]
            )
  (:import (java.io File)))


(def invite-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :email) string?
   (ds/req :role) string?
   (ds/req :status) string?
   (ds/req :invited_at) int?
   (ds/req :expires_at) int?
   (ds/opt :accepted_at) int?
   (ds/opt :projects) (s/coll-of invite-projects-inner-spec)
   })

(def invite-spec
  (ds/spec
    {:name ::invite
     :spec invite-data}))
