(ns open-ai-api.specs.realtime-server-event-response-output-item-done
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-output-item-done-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :output_index) int?
   (ds/req :item) realtime-conversation-item-spec
   })

(def realtime-server-event-response-output-item-done-spec
  (ds/spec
    {:name ::realtime-server-event-response-output-item-done
     :spec realtime-server-event-response-output-item-done-data}))
