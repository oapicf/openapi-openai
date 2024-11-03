(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-object-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/req :type) string?
   (ds/opt :code_interpreter) run-step-delta-step-details-tool-calls-code-object-code-interpreter-spec
   })

(def run-step-delta-step-details-tool-calls-code-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-object
     :spec run-step-delta-step-details-tool-calls-code-object-data}))
