(ns open-ai-api.specs.list-runs-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-object :refer :all]
            )
  (:import (java.io File)))


(def list-runs-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of run-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-runs-response-spec
  (ds/spec
    {:name ::list-runs-response
     :spec list-runs-response-data}))
