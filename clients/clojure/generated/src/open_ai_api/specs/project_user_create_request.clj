(ns open-ai-api.specs.project-user-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-user-create-request-data
  {
   (ds/req :user_id) string?
   (ds/req :role) string?
   })

(def project-user-create-request-spec
  (ds/spec
    {:name ::project-user-create-request
     :spec project-user-create-request-data}))
