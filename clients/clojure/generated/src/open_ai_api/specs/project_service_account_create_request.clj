(ns open-ai-api.specs.project-service-account-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-service-account-create-request-data
  {
   (ds/req :name) string?
   })

(def project-service-account-create-request-spec
  (ds/spec
    {:name ::project-service-account-create-request
     :spec project-service-account-create-request-data}))
