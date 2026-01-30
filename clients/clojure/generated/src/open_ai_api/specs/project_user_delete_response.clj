(ns open-ai-api.specs.project-user-delete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-user-delete-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   })

(def project-user-delete-response-spec
  (ds/spec
    {:name ::project-user-delete-response
     :spec project-user-delete-response-data}))
