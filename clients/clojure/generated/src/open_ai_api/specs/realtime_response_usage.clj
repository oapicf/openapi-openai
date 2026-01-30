(ns open-ai-api.specs.realtime-response-usage
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.realtime-response-usage-input-token-details :refer :all]
            [open-ai-api.specs.realtime-response-usage-output-token-details :refer :all]
            )
  (:import (java.io File)))


(def realtime-response-usage-data
  {
   (ds/opt :total_tokens) int?
   (ds/opt :input_tokens) int?
   (ds/opt :output_tokens) int?
   (ds/opt :input_token_details) realtime-response-usage-input-token-details-spec
   (ds/opt :output_token_details) realtime-response-usage-output-token-details-spec
   })

(def realtime-response-usage-spec
  (ds/spec
    {:name ::realtime-response-usage
     :spec realtime-response-usage-data}))
