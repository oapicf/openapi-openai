(ns open-ai-api.specs.realtime-server-event-session-updated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-session :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-session-updated-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :session) realtime-session-spec
   })

(def realtime-server-event-session-updated-spec
  (ds/spec
    {:name ::realtime-server-event-session-updated
     :spec realtime-server-event-session-updated-data}))
