(ns open-ai-api.specs.realtime-server-event-input-audio-buffer-committed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-input-audio-buffer-committed-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :previous_item_id) string?
   (ds/req :item_id) string?
   })

(def realtime-server-event-input-audio-buffer-committed-spec
  (ds/spec
    {:name ::realtime-server-event-input-audio-buffer-committed
     :spec realtime-server-event-input-audio-buffer-committed-data}))
