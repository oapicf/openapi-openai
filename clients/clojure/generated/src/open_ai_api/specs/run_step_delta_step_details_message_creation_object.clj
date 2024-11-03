(ns open-ai-api.specs.run-step-delta-step-details-message-creation-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-step-details-message-creation-object-message-creation :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-message-creation-object-data
  {
   (ds/req :type) string?
   (ds/opt :message_creation) run-step-delta-step-details-message-creation-object-message-creation-spec
   })

(def run-step-delta-step-details-message-creation-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-message-creation-object
     :spec run-step-delta-step-details-message-creation-object-data}))
