(ns open-ai-api.specs.realtime-session-turn-detection
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-session-turn-detection-data
  {
   (ds/opt :type) string?
   (ds/opt :threshold) float?
   (ds/opt :prefix_padding_ms) int?
   (ds/opt :silence_duration_ms) int?
   })

(def realtime-session-turn-detection-spec
  (ds/spec
    {:name ::realtime-session-turn-detection
     :spec realtime-session-turn-detection-data}))
