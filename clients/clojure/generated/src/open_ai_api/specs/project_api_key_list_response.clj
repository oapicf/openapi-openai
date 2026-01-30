(ns open-ai-api.specs.project-api-key-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-api-key :refer :all]
            )
  (:import (java.io File)))


(def project-api-key-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of project-api-key-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def project-api-key-list-response-spec
  (ds/spec
    {:name ::project-api-key-list-response
     :spec project-api-key-list-response-data}))
