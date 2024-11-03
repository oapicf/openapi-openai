(ns open-ai-api.specs.run-step-stream-event-one-of-6
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-object :refer :all]
            )
  (:import (java.io File)))


(def run-step-stream-event-one-of-6-data
  {
   (ds/req :event) string?
   (ds/req :data) run-step-object-spec
   })

(def run-step-stream-event-one-of-6-spec
  (ds/spec
    {:name ::run-step-stream-event-one-of-6
     :spec run-step-stream-event-one-of-6-data}))
