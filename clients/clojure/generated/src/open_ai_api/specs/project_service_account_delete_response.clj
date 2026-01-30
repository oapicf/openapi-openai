(ns open-ai-api.specs.project-service-account-delete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-service-account-delete-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   })

(def project-service-account-delete-response-spec
  (ds/spec
    {:name ::project-service-account-delete-response
     :spec project-service-account-delete-response-data}))
