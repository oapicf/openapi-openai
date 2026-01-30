(ns open-ai-api.specs.create-vector-store-request-chunking-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy :refer :all]
            )
  (:import (java.io File)))


(def create-vector-store-request-chunking-strategy-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-spec
   })

(def create-vector-store-request-chunking-strategy-spec
  (ds/spec
    {:name ::create-vector-store-request-chunking-strategy
     :spec create-vector-store-request-chunking-strategy-data}))
