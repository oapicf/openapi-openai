(ns open-ai-api.specs.project-api-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-api-key-owner :refer :all]
            )
  (:import (java.io File)))


(def project-api-key-data
  {
   (ds/req :object) string?
   (ds/req :redacted_value) string?
   (ds/req :name) string?
   (ds/req :created_at) int?
   (ds/req :id) string?
   (ds/req :owner) project-api-key-owner-spec
   })

(def project-api-key-spec
  (ds/spec
    {:name ::project-api-key
     :spec project-api-key-data}))
