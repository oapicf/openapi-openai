(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-object-tool-calls-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object-function :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-object-tool-calls-inner-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/req :type) string?
   (ds/opt :code_interpreter) run-step-delta-step-details-tool-calls-code-object-code-interpreter-spec
   (ds/req :file_search) any?
   (ds/opt :function) run-step-delta-step-details-tool-calls-function-object-function-spec
   })

(def run-step-delta-step-details-tool-calls-object-tool-calls-inner-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-object-tool-calls-inner
     :spec run-step-delta-step-details-tool-calls-object-tool-calls-inner-data}))
