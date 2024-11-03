(ns open-ai-api.specs.run-step-stream-event-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-object :refer :all]
            )
  (:import (java.io File)))


(def run-step-stream-event-one-of-data
  {
   (ds/req :event) string?
   (ds/req :data) run-step-object-spec
   })

(def run-step-stream-event-one-of-spec
  (ds/spec
    {:name ::run-step-stream-event-one-of
     :spec run-step-stream-event-one-of-data}))
