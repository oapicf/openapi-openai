(ns open-ai-api.specs.project-service-account-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-service-account :refer :all]
            )
  (:import (java.io File)))


(def project-service-account-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of project-service-account-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def project-service-account-list-response-spec
  (ds/spec
    {:name ::project-service-account-list-response
     :spec project-service-account-list-response-data}))
