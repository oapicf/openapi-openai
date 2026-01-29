(ns open-ai-api.specs.create-thread-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-message-request :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-thread-request-data
  {
   (ds/opt :messages) (s/coll-of create-message-request-spec)
   (ds/opt :metadata) any?
   })

(def create-thread-request-spec
  (ds/spec
    {:name ::create-thread-request
     :spec create-thread-request-data}))
