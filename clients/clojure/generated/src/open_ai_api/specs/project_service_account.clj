(ns open-ai-api.specs.project-service-account
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-service-account-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :role) string?
   (ds/req :created_at) int?
   })

(def project-service-account-spec
  (ds/spec
    {:name ::project-service-account
     :spec project-service-account-data}))
