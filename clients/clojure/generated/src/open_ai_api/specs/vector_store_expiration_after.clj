(ns open-ai-api.specs.vector-store-expiration-after
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vector-store-expiration-after-data
  {
   (ds/req :anchor) string?
   (ds/req :days) int?
   })

(def vector-store-expiration-after-spec
  (ds/spec
    {:name ::vector-store-expiration-after
     :spec vector-store-expiration-after-data}))
