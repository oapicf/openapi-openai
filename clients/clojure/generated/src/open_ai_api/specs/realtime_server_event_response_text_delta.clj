(ns open-ai-api.specs.realtime-server-event-response-text-delta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-response-text-delta-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :item_id) string?
   (ds/req :output_index) int?
   (ds/req :content_index) int?
   (ds/req :delta) string?
   })

(def realtime-server-event-response-text-delta-spec
  (ds/spec
    {:name ::realtime-server-event-response-text-delta
     :spec realtime-server-event-response-text-delta-data}))
