(ns open-ai-api.specs.run-step-details-tool-calls-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-object-tool-calls-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-object-data
  {
   (ds/req :type) string?
   (ds/req :tool_calls) (s/coll-of run-step-details-tool-calls-object-tool-calls-inner-spec)
   })

(def run-step-details-tool-calls-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-object
     :spec run-step-details-tool-calls-object-data}))
