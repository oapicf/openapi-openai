(ns open-ai-api.specs.project-user-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-user :refer :all]
            )
  (:import (java.io File)))


(def project-user-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of project-user-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def project-user-list-response-spec
  (ds/spec
    {:name ::project-user-list-response
     :spec project-user-list-response-data}))
