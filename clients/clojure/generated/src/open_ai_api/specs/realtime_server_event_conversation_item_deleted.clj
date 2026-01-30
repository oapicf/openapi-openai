(ns open-ai-api.specs.realtime-server-event-conversation-item-deleted
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-deleted-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   })

(def realtime-server-event-conversation-item-deleted-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-deleted
     :spec realtime-server-event-conversation-item-deleted-data}))
