(ns open-ai-api.specs.realtime-client-event-session-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-session-create-request :refer :all]
            )
  (:import (java.io File)))


(def realtime-client-event-session-update-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/req :session) realtime-session-create-request-spec
   })

(def realtime-client-event-session-update-spec
  (ds/spec
    {:name ::realtime-client-event-session-update
     :spec realtime-client-event-session-update-data}))
