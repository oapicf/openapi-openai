(ns open-ai-api.specs.realtime-response-status-details-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-response-status-details-error-data
  {
   (ds/opt :type) string?
   (ds/opt :code) string?
   })

(def realtime-response-status-details-error-spec
  (ds/spec
    {:name ::realtime-response-status-details-error
     :spec realtime-response-status-details-error-data}))
