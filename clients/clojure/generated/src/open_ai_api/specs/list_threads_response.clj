(ns open-ai-api.specs.list-threads-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.thread-object :refer :all]
            )
  (:import (java.io File)))


(def list-threads-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of thread-object-spec)
   (ds/req :first_id) string?
   (ds/req :last_id) string?
   (ds/req :has_more) boolean?
   })

(def list-threads-response-spec
  (ds/spec
    {:name ::list-threads-response
     :spec list-threads-response-data}))
