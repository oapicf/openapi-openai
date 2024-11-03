(ns open-ai-api.specs.message-stream-event-one-of-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-object :refer :all]
            )
  (:import (java.io File)))


(def message-stream-event-one-of-2-data
  {
   (ds/req :event) string?
   (ds/req :data) message-delta-object-spec
   })

(def message-stream-event-one-of-2-spec
  (ds/spec
    {:name ::message-stream-event-one-of-2
     :spec message-stream-event-one-of-2-data}))
