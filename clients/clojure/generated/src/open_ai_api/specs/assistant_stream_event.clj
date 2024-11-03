(ns open-ai-api.specs.assistant-stream-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-stream-event-data
  {
   (ds/req :event) string?
   (ds/req :data) string?
   })

(def assistant-stream-event-spec
  (ds/spec
    {:name ::assistant-stream-event
     :spec assistant-stream-event-data}))
