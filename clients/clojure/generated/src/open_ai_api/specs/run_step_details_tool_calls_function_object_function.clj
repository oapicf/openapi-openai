(ns open-ai-api.specs.run-step-details-tool-calls-function-object-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-function-object-function-data
  {
   (ds/req :name) string?
   (ds/req :arguments) string?
   (ds/req :output) string?
   })

(def run-step-details-tool-calls-function-object-function-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-function-object-function
     :spec run-step-details-tool-calls-function-object-function-data}))
