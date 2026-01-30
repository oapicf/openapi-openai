(ns open-ai-api.specs.project-service-account-create-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-service-account-api-key :refer :all]
            )
  (:import (java.io File)))


(def project-service-account-create-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :role) string?
   (ds/req :created_at) int?
   (ds/req :api_key) project-service-account-api-key-spec
   })

(def project-service-account-create-response-spec
  (ds/spec
    {:name ::project-service-account-create-response
     :spec project-service-account-create-response-data}))
