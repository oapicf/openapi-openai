(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object-function :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-function-object-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/req :type) string?
   (ds/opt :function) run-step-delta-step-details-tool-calls-function-object-function-spec
   })

(def run-step-delta-step-details-tool-calls-function-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-function-object
     :spec run-step-delta-step-details-tool-calls-function-object-data}))
