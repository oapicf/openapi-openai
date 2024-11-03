(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-object-code-interpreter-data
  {
   (ds/opt :input) string?
   (ds/opt :outputs) (s/coll-of run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner-spec)
   })

(def run-step-delta-step-details-tool-calls-code-object-code-interpreter-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-object-code-interpreter
     :spec run-step-delta-step-details-tool-calls-code-object-code-interpreter-data}))
