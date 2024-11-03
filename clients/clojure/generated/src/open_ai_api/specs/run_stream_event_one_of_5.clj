(ns open-ai-api.specs.run-stream-event-one-of-5
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-object :refer :all]
            )
  (:import (java.io File)))


(def run-stream-event-one-of-5-data
  {
   (ds/req :event) string?
   (ds/req :data) run-object-spec
   })

(def run-stream-event-one-of-5-spec
  (ds/spec
    {:name ::run-stream-event-one-of-5
     :spec run-stream-event-one-of-5-data}))