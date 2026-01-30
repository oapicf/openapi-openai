(ns open-ai-api.specs.project-api-key-delete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-api-key-delete-response-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :deleted) boolean?
   })

(def project-api-key-delete-response-spec
  (ds/spec
    {:name ::project-api-key-delete-response
     :spec project-api-key-delete-response-data}))
