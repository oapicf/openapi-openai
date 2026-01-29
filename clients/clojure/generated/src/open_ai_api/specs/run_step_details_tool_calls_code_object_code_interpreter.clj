(ns open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter-outputs-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-code-object-code-interpreter-data
  {
   (ds/req :input) string?
   (ds/req :outputs) (s/coll-of run-step-details-tool-calls-code-object-code-interpreter-outputs-inner-spec)
   })

(def run-step-details-tool-calls-code-object-code-interpreter-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-code-object-code-interpreter
     :spec run-step-details-tool-calls-code-object-code-interpreter-data}))
