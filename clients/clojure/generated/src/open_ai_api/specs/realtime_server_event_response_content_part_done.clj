(ns open-ai-api.specs.realtime-server-event-response-content-part-done
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-response-content-part-done-part :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-content-part-done-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :item_id) string?
   (ds/req :output_index) int?
   (ds/req :content_index) int?
   (ds/req :part) realtime-server-event-response-content-part-done-part-spec
   })

(def realtime-server-event-response-content-part-done-spec
  (ds/spec
    {:name ::realtime-server-event-response-content-part-done
     :spec realtime-server-event-response-content-part-done-data}))
