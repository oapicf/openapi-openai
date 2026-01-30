(ns open-ai-api.specs.project-service-account-api-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-service-account-api-key-data
  {
   (ds/req :object) string?
   (ds/req :value) string?
   (ds/req :name) string?
   (ds/req :created_at) int?
   (ds/req :id) string?
   })

(def project-service-account-api-key-spec
  (ds/spec
    {:name ::project-service-account-api-key
     :spec project-service-account-api-key-data}))
