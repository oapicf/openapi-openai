(ns open-ai-api.specs.realtime-client-event-input-audio-buffer-append
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-client-event-input-audio-buffer-append-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/req :audio) string?
   })

(def realtime-client-event-input-audio-buffer-append-spec
  (ds/spec
    {:name ::realtime-client-event-input-audio-buffer-append
     :spec realtime-client-event-input-audio-buffer-append-data}))
