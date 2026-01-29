(ns open-ai-api.specs.run-step-delta-object-delta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-object-delta-step-details :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-object-delta-data
  {
   (ds/opt :step_details) run-step-delta-object-delta-step-details-spec
   })

(def run-step-delta-object-delta-spec
  (ds/spec
    {:name ::run-step-delta-object-delta
     :spec run-step-delta-object-delta-data}))
