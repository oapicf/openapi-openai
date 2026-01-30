(ns open-ai-api.specs.realtime-server-event-rate-limits-updated-rate-limits-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-rate-limits-updated-rate-limits-inner-data
  {
   (ds/opt :name) string?
   (ds/opt :limit) int?
   (ds/opt :remaining) int?
   (ds/opt :reset_seconds) float?
   })

(def realtime-server-event-rate-limits-updated-rate-limits-inner-spec
  (ds/spec
    {:name ::realtime-server-event-rate-limits-updated-rate-limits-inner
     :spec realtime-server-event-rate-limits-updated-rate-limits-inner-data}))
