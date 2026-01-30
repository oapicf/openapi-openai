(ns open-ai-api.specs.realtime-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response-status-details :refer :all]
            [open-ai-api.specs.realtime-conversation-item :refer :all]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs.realtime-response-usage :refer :all]
            )
  (:import (java.io File)))


(def realtime-response-data
  {
   (ds/opt :id) string?
   (ds/opt :object) string?
   (ds/opt :status) string?
   (ds/opt :status_details) realtime-response-status-details-spec
   (ds/opt :output) (s/coll-of realtime-conversation-item-spec)
   (ds/opt :metadata) any?
   (ds/opt :usage) realtime-response-usage-spec
   })

(def realtime-response-spec
  (ds/spec
    {:name ::realtime-response
     :spec realtime-response-data}))
