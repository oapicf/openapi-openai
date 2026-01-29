(ns open-ai-api.specs.run-step-stream-event-one-of-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-delta-object :refer :all]
            )
  (:import (java.io File)))


(def run-step-stream-event-one-of-2-data
  {
   (ds/req :event) string?
   (ds/req :data) run-step-delta-object-spec
   })

(def run-step-stream-event-one-of-2-spec
  (ds/spec
    {:name ::run-step-stream-event-one-of-2
     :spec run-step-stream-event-one-of-2-data}))
