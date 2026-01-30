(ns open-ai-api.specs.realtime-server-event-response-text-done
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-response-text-done-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :item_id) string?
   (ds/req :output_index) int?
   (ds/req :content_index) int?
   (ds/req :text) string?
   })

(def realtime-server-event-response-text-done-spec
  (ds/spec
    {:name ::realtime-server-event-response-text-done
     :spec realtime-server-event-response-text-done-data}))
