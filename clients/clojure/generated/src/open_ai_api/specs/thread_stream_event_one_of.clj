(ns open-ai-api.specs.thread-stream-event-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.thread-object :refer :all]
            )
  (:import (java.io File)))


(def thread-stream-event-one-of-data
  {
   (ds/req :event) string?
   (ds/req :data) thread-object-spec
   })

(def thread-stream-event-one-of-spec
  (ds/spec
    {:name ::thread-stream-event-one-of
     :spec thread-stream-event-one-of-data}))
