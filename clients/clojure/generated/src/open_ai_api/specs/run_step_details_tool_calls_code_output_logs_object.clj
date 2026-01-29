(ns open-ai-api.specs.run-step-details-tool-calls-code-output-logs-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-code-output-logs-object-data
  {
   (ds/req :type) string?
   (ds/req :logs) string?
   })

(def run-step-details-tool-calls-code-output-logs-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-code-output-logs-object
     :spec run-step-details-tool-calls-code-output-logs-object-data}))
