(ns open-ai-api.specs.project-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project :refer :all]
            )
  (:import (java.io File)))


(def project-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of project-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def project-list-response-spec
  (ds/spec
    {:name ::project-list-response
     :spec project-list-response-data}))
