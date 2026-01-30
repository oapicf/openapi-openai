(ns open-ai-api.specs.realtime-server-event-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-server-event-error-error :refer :all]
            )
  (:import (java.io File)))


(def realtime-server-event-error-data
  {
   (ds/req :event_id) string?
   (ds/req :type) string?
   (ds/req :error) realtime-server-event-error-error-spec
   })

(def realtime-server-event-error-spec
  (ds/spec
    {:name ::realtime-server-event-error
     :spec realtime-server-event-error-data}))
