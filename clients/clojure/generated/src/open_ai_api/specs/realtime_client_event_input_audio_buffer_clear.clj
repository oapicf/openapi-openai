(ns open-ai-api.specs.realtime-client-event-input-audio-buffer-clear
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-client-event-input-audio-buffer-clear-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   })

(def realtime-client-event-input-audio-buffer-clear-spec
  (ds/spec
    {:name ::realtime-client-event-input-audio-buffer-clear
     :spec realtime-client-event-input-audio-buffer-clear-data}))
