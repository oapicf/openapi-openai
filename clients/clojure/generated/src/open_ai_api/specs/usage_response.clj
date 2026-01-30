(ns open-ai-api.specs.usage-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.usage-time-bucket :refer :all]
            )
  (:import (java.io File)))


(def usage-response-data
  {
   (ds/req :object) string?
   (ds/req :data) (s/coll-of usage-time-bucket-spec)
   (ds/req :has_more) boolean?
   (ds/req :next_page) string?
   })

(def usage-response-spec
  (ds/spec
    {:name ::usage-response
     :spec usage-response-data}))
