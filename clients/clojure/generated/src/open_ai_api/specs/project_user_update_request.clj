(ns open-ai-api.specs.project-user-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-user-update-request-data
  {
   (ds/req :role) string?
   })

(def project-user-update-request-spec
  (ds/spec
    {:name ::project-user-update-request
     :spec project-user-update-request-data}))
