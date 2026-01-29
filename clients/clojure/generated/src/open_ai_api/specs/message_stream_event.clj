(ns open-ai-api.specs.message-stream-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-object :refer :all]
            )
  (:import (java.io File)))


(def message-stream-event-data
  {
   (ds/req :event) string?
   (ds/req :data) message-object-spec
   })

(def message-stream-event-spec
  (ds/spec
    {:name ::message-stream-event
     :spec message-stream-event-data}))
