(ns open-ai-api.specs.invite-request-projects-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-request-projects-inner-data
  {
   (ds/req :id) string?
   (ds/req :role) string?
   })

(def invite-request-projects-inner-spec
  (ds/spec
    {:name ::invite-request-projects-inner
     :spec invite-request-projects-inner-data}))
