(ns open-ai-api.specs.realtime-client-event-conversation-item-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            )
  (:import (java.io File)))


(def realtime-client-event-conversation-item-create-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/opt :previous_item_id) string?
   (ds/req :item) realtime-conversation-item-spec
   })

(def realtime-client-event-conversation-item-create-spec
  (ds/spec
    {:name ::realtime-client-event-conversation-item-create
     :spec realtime-client-event-conversation-item-create-data}))
