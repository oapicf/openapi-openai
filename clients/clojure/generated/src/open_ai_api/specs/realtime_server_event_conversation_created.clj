(ns open-ai-api.specs.realtime-server-event-conversation-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-conversation-created-conversation :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-created-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :conversation) realtime-server-event-conversation-created-conversation-spec
   })

(def realtime-server-event-conversation-created-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-created
     :spec realtime-server-event-conversation-created-data}))
