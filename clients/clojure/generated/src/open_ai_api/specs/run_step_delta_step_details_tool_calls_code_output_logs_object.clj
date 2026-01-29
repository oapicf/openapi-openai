(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-logs-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-code-output-logs-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :logs) string?
   })

(def run-step-delta-step-details-tool-calls-code-output-logs-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-code-output-logs-object
     :spec run-step-delta-step-details-tool-calls-code-output-logs-object-data}))
