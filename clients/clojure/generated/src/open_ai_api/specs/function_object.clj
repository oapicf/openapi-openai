(ns open-ai-api.specs.function-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def function-object-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :parameters) (s/map-of string? s/any?)
   (ds/opt :strict) boolean?
   })

(def function-object-spec
  (ds/spec
    {:name ::function-object
     :spec function-object-data}))
