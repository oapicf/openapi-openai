(ns open-ai-api.specs.realtime-client-event-response-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response-create-params :refer :all]
            )
  (:import (java.io File)))


(def realtime-client-event-response-create-data
  {
   (ds/opt :event_id) string?
   (ds/req :type) string?
   (ds/opt :response) realtime-response-create-params-spec
   })

(def realtime-client-event-response-create-spec
  (ds/spec
    {:name ::realtime-client-event-response-create
     :spec realtime-client-event-response-create-data}))
