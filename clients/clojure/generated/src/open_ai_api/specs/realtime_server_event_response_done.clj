(ns open-ai-api.specs.realtime-server-event-response-done
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-response-done-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :response) realtime-response-spec
   })

(def realtime-server-event-response-done-spec
  (ds/spec
    {:name ::realtime-server-event-response-done
     :spec realtime-server-event-response-done-data}))
