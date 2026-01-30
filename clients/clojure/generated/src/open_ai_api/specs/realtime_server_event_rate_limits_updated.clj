(ns open-ai-api.specs.realtime-server-event-rate-limits-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-rate-limits-updated-rate-limits-inner :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-rate-limits-updated-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :rate_limits) (s/coll-of realtime-server-event-rate-limits-updated-rate-limits-inner-spec)
   })

(def realtime-server-event-rate-limits-updated-spec
  (ds/spec
    {:name ::realtime-server-event-rate-limits-updated
     :spec realtime-server-event-rate-limits-updated-data}))
