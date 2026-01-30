(ns open-ai-api.specs.realtime-server-event-conversation-item-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-conversation-item-created-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :previous_item_id) string?
   (ds/req :item) realtime-conversation-item-spec
   })

(def realtime-server-event-conversation-item-created-spec
  (ds/spec
    {:name ::realtime-server-event-conversation-item-created
     :spec realtime-server-event-conversation-item-created-data}))
