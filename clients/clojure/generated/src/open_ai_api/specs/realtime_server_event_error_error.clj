(ns open-ai-api.specs.realtime-server-event-error-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-error-error-data
  {
   (ds/req :type) string?
   (ds/opt :code) string?
   (ds/req :message) string?
   (ds/opt :param) string?
   (ds/opt :event_id) string?
   })

(def realtime-server-event-error-error-spec
  (ds/spec
    {:name ::realtime-server-event-error-error
     :spec realtime-server-event-error-error-data}))
