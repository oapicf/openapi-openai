(ns open-ai-api.specs.realtime-response-status-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response-status-details-error :refer :all]
            )
  (:import (java.io File)))


(def realtime-response-status-details-data
  {
   (ds/opt :type) string?
   (ds/opt :reason) string?
   (ds/opt :error) realtime-response-status-details-error-spec
   })

(def realtime-response-status-details-spec
  (ds/spec
    {:name ::realtime-response-status-details
     :spec realtime-response-status-details-data}))
