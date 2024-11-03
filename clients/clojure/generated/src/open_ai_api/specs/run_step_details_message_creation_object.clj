(ns open-ai-api.specs.run-step-details-message-creation-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-message-creation-object-message-creation :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-message-creation-object-data
  {
   (ds/req :type) string?
   (ds/req :message_creation) run-step-details-message-creation-object-message-creation-spec
   })

(def run-step-details-message-creation-object-spec
  (ds/spec
    {:name ::run-step-details-message-creation-object
     :spec run-step-details-message-creation-object-data}))
