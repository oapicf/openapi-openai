(ns open-ai-api.specs.message-stream-event-one-of-4
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-object :refer :all]
            )
  (:import (java.io File)))


(def message-stream-event-one-of-4-data
  {
   (ds/req :event) string?
   (ds/req :data) message-object-spec
   })

(def message-stream-event-one-of-4-spec
  (ds/spec
    {:name ::message-stream-event-one-of-4
     :spec message-stream-event-one-of-4-data}))
