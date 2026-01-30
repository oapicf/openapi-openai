(ns open-ai-api.specs.realtime-server-event-response-content-part-done-part
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-server-event-response-content-part-done-part-data
  {
   (ds/opt :type) string?
   (ds/opt :text) string?
   (ds/opt :audio) string?
   (ds/opt :transcript) string?
   })

(def realtime-server-event-response-content-part-done-part-spec
  (ds/spec
    {:name ::realtime-server-event-response-content-part-done-part
     :spec realtime-server-event-response-content-part-done-part-data}))
