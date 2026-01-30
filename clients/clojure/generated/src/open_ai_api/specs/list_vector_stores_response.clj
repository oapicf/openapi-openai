(ns open-ai-api.specs.list-vector-stores-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-object :refer :all]
            )
  (:import (java.io File)))


(def list-vector-stores-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of vector-store-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-vector-stores-response-spec
  (ds/spec
    {:name ::list-vector-stores-response
     :spec list-vector-stores-response-data}))
