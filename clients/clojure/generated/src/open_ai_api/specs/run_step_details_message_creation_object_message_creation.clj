(ns open-ai-api.specs.run-step-details-message-creation-object-message-creation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-details-message-creation-object-message-creation-data
  {
   (ds/req :message_id) string?
   })

(def run-step-details-message-creation-object-message-creation-spec
  (ds/spec
    {:name ::run-step-details-message-creation-object-message-creation
     :spec run-step-details-message-creation-object-message-creation-data}))
