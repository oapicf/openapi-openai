(ns open-ai-api.specs.invite-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.invite-request-projects-inner :refer :all]
            )
  (:import (java.io File)))


(def invite-request-data
  {
   (ds/req :email) string?
   (ds/req :role) string?
   (ds/opt :projects) (s/coll-of invite-request-projects-inner-spec)
   })

(def invite-request-spec
  (ds/spec
    {:name ::invite-request
     :spec invite-request-data}))
