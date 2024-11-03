(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-function-object-function-data
  {
   (ds/opt :name) string?
   (ds/opt :arguments) string?
   (ds/opt :output) string?
   })

(def run-step-delta-step-details-tool-calls-function-object-function-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-function-object-function
     :spec run-step-delta-step-details-tool-calls-function-object-function-data}))
