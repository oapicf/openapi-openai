(ns open-ai-api.specs.update-vector-store-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.vector-store-expiration-after :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def update-vector-store-request-data
  {
   (ds/opt :name) string?
   (ds/opt :expires_after) vector-store-expiration-after-spec
   (ds/opt :metadata) any?
   })

(def update-vector-store-request-spec
  (ds/spec
    {:name ::update-vector-store-request
     :spec update-vector-store-request-data}))
