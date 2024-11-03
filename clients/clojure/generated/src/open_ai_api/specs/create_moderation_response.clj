(ns open-ai-api.specs.create-moderation-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-moderation-response-results-inner :refer :all]
            )
  (:import (java.io File)))


(def create-moderation-response-data
  {
   (ds/req :id) string?
   (ds/req :model) string?
   (ds/req :results) (s/coll-of create-moderation-response-results-inner-spec)
   })

(def create-moderation-response-spec
  (ds/spec
    {:name ::create-moderation-response
     :spec create-moderation-response-data}))
