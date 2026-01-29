(ns open-ai-api.specs.thread-stream-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.thread-object :refer :all]
            )
  (:import (java.io File)))


(def thread-stream-event-data
  {
   (ds/req :event) string?
   (ds/req :data) thread-object-spec
   })

(def thread-stream-event-spec
  (ds/spec
    {:name ::thread-stream-event
     :spec thread-stream-event-data}))
