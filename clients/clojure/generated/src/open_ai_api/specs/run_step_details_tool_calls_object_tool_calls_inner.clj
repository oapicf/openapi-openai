(ns open-ai-api.specs.run-step-details-tool-calls-object-tool-calls-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-function-object-function :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-object-tool-calls-inner-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :code_interpreter) run-step-details-tool-calls-code-object-code-interpreter-spec
   (ds/req :retrieval) any?
   (ds/req :function) run-step-details-tool-calls-function-object-function-spec
   })

(def run-step-details-tool-calls-object-tool-calls-inner-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-object-tool-calls-inner
     :spec run-step-details-tool-calls-object-tool-calls-inner-data}))
