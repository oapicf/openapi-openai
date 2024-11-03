(ns open-ai-api.specs.run-step-delta-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-object-delta :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :delta) run-step-delta-object-delta-spec
   })

(def run-step-delta-object-spec
  (ds/spec
    {:name ::run-step-delta-object
     :spec run-step-delta-object-data}))
