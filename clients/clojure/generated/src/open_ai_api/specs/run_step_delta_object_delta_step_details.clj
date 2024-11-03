(ns open-ai-api.specs.run-step-delta-object-delta-step-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-message-creation-object-message-creation :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-object-tool-calls-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-object-delta-step-details-data
  {
   (ds/req :type) string?
   (ds/opt :message_creation) run-step-delta-step-details-message-creation-object-message-creation-spec
   (ds/opt :tool_calls) (s/coll-of run-step-delta-step-details-tool-calls-object-tool-calls-inner-spec)
   })

(def run-step-delta-object-delta-step-details-spec
  (ds/spec
    {:name ::run-step-delta-object-delta-step-details
     :spec run-step-delta-object-delta-step-details-data}))
