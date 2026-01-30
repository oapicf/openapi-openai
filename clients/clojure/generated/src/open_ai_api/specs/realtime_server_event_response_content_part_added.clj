(ns open-ai-api.specs.realtime-server-event-response-content-part-added
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-response-content-part-added-part :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-content-part-added-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response_id) string?
   (ds/req :item_id) string?
   (ds/req :output_index) int?
   (ds/req :content_index) int?
   (ds/req :part) realtime-server-event-response-content-part-added-part-spec
   })

(def realtime-server-event-response-content-part-added-spec
  (ds/spec
    {:name ::realtime-server-event-response-content-part-added
     :spec realtime-server-event-response-content-part-added-data}))
