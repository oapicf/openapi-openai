(ns open-ai-api.specs.list-vector-store-files-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-file-object :refer :all]
            )
  (:import (java.io File)))


(def list-vector-store-files-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of vector-store-file-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-vector-store-files-response-spec
  (ds/spec
    {:name ::list-vector-store-files-response
     :spec list-vector-store-files-response-data}))
