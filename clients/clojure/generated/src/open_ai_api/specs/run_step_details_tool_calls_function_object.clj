(ns open-ai-api.specs.run-step-details-tool-calls-function-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-function-object-function :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-function-object-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :function) run-step-details-tool-calls-function-object-function-spec
   })

(def run-step-details-tool-calls-function-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-function-object
     :spec run-step-details-tool-calls-function-object-data}))
