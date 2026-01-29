(ns open-ai-api.specs.run-step-object-step-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-message-creation-object-message-creation :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-object-tool-calls-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-object-step-details-data
  {
   (ds/req :type) string?
   (ds/req :message_creation) run-step-details-message-creation-object-message-creation-spec
   (ds/req :tool_calls) (s/coll-of run-step-details-tool-calls-object-tool-calls-inner-spec)
   })

(def run-step-object-step-details-spec
  (ds/spec
    {:name ::run-step-object-step-details
     :spec run-step-object-step-details-data}))
