(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-object-tool-calls-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-object-data
  {
   (ds/req :type) string?
   (ds/opt :tool_calls) (s/coll-of run-step-delta-step-details-tool-calls-object-tool-calls-inner-spec)
   })

(def run-step-delta-step-details-tool-calls-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-object
     :spec run-step-delta-step-details-tool-calls-object-data}))
