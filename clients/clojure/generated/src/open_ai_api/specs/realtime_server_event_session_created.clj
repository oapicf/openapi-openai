(ns open-ai-api.specs.realtime-server-event-session-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-session :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-session-created-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :session) realtime-session-spec
   })

(def realtime-server-event-session-created-spec
  (ds/spec
    {:name ::realtime-server-event-session-created
     :spec realtime-server-event-session-created-data}))
