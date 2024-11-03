(ns open-ai-api.specs.list-run-steps-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-object :refer :all]
            )
  (:import (java.io File)))


(def list-run-steps-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of run-step-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-run-steps-response-spec
  (ds/spec
    {:name ::list-run-steps-response
     :spec list-run-steps-response-data}))
