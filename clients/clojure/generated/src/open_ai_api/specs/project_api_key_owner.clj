(ns open-ai-api.specs.project-api-key-owner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-user :refer :all]
            [open-ai-api.specs.project-service-account :refer :all]
            )
  (:import (java.io File)))


(def project-api-key-owner-data
  {
   (ds/opt :type) string?
   (ds/opt :user) project-user-spec
   (ds/opt :service_account) project-service-account-spec
   })

(def project-api-key-owner-spec
  (ds/spec
    {:name ::project-api-key-owner
     :spec project-api-key-owner-data}))
