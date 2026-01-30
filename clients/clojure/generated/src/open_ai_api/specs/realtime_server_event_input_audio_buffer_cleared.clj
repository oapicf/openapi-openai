(ns open-ai-api.specs.realtime-server-event-input-audio-buffer-cleared
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-input-audio-buffer-cleared-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   })

(def realtime-server-event-input-audio-buffer-cleared-spec
  (ds/spec
    {:name ::realtime-server-event-input-audio-buffer-cleared
     :spec realtime-server-event-input-audio-buffer-cleared-data}))
