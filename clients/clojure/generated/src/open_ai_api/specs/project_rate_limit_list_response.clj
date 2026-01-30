(ns open-ai-api.specs.project-rate-limit-list-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.project-rate-limit :refer :all]
            )
  (:import (java.io File)))


(def project-rate-limit-list-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of project-rate-limit-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def project-rate-limit-list-response-spec
  (ds/spec
    {:name ::project-rate-limit-list-response
     :spec project-rate-limit-list-response-data}))
