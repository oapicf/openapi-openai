(ns open-ai-api.specs.message-stream-event-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-object :refer :all]
            )
  (:import (java.io File)))


(def message-stream-event-one-of-data
  {
   (ds/req :event) string?
   (ds/req :data) message-object-spec
   })

(def message-stream-event-one-of-spec
  (ds/spec
    {:name ::message-stream-event-one-of
     :spec message-stream-event-one-of-data}))
