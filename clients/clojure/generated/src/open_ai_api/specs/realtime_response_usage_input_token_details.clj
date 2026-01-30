(ns open-ai-api.specs.realtime-response-usage-input-token-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-response-usage-input-token-details-data
  {
   (ds/opt :cached_tokens) int?
   (ds/opt :text_tokens) int?
   (ds/opt :audio_tokens) int?
   })

(def realtime-response-usage-input-token-details-spec
  (ds/spec
    {:name ::realtime-response-usage-input-token-details
     :spec realtime-response-usage-input-token-details-data}))
