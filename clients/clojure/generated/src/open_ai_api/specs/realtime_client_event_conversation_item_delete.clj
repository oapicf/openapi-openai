(ns open-ai-api.specs.realtime-client-event-conversation-item-delete
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-client-event-conversation-item-delete-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/req :item_id) string?
   })

(def realtime-client-event-conversation-item-delete-spec
  (ds/spec
    {:name ::realtime-client-event-conversation-item-delete
     :spec realtime-client-event-conversation-item-delete-data}))
