(ns open-ai-api.specs.realtime-server-event-response-output-item-added
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-output-item-added-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :output_index) int?
   (ds/req :item) realtime-conversation-item-spec
   })

(def realtime-server-event-response-output-item-added-spec
  (ds/spec
    {:name ::realtime-server-event-response-output-item-added
     :spec realtime-server-event-response-output-item-added-data}))
