(ns open-ai-api.specs.realtime-server-event-response-function-call-arguments-delta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-response-function-call-arguments-delta-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :item_id) string?
   (ds/req :output_index) int?
   (ds/req :call_id) string?
   (ds/req :delta) string?
   })

(def realtime-server-event-response-function-call-arguments-delta-spec
  (ds/spec
    {:name ::realtime-server-event-response-function-call-arguments-delta
     :spec realtime-server-event-response-function-call-arguments-delta-data}))
