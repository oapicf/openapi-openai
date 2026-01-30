(ns open-ai-api.specs.realtime-server-event-response-created
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-created-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response) realtime-response-spec
   })

(def realtime-server-event-response-created-spec
  (ds/spec
    {:name ::realtime-server-event-response-created
     :spec realtime-server-event-response-created-data}))
