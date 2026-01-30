(ns open-ai-api.specs.realtime-client-event-response-cancel
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-client-event-response-cancel-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/opt :response_id) string?
   })

(def realtime-client-event-response-cancel-spec
  (ds/spec
    {:name ::realtime-client-event-response-cancel
     :spec realtime-client-event-response-cancel-data}))
