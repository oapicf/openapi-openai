(ns open-ai-api.specs.list-batches-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.batch :refer :all]
            )
  (:import (java.io File)))


(def list-batches-response-data
  {
   (ds/req :data) (s/coll-of batch-spec)
   (ds/opt :first_id) string?
   (ds/opt :last_id) string?
   (ds/req :has_more) boolean?
   (ds/req :object) string?
   })

(def list-batches-response-spec
  (ds/spec
    {:name ::list-batches-response
     :spec list-batches-response-data}))
