(ns open-ai-api.specs.usage-time-bucket-result-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.costs-result-amount :refer :all]
            )
  (:import (java.io File)))


(def usage-time-bucket-result-inner-data
  {
   (ds/req :object) string?
   (ds/req :input_tokens) int?
   (ds/opt :input_cached_tokens) int?
   (ds/req :output_tokens) int?
   (ds/opt :input_audio_tokens) int?
   (ds/opt :output_audio_tokens) int?
   (ds/req :num_model_requests) int?
   (ds/opt :project_id) string?
   (ds/opt :user_id) string?
   (ds/opt :api_key_id) string?
   (ds/opt :model) string?
   (ds/opt :batch) boolean?
   (ds/req :images) int?
   (ds/opt :source) string?
   (ds/opt :size) string?
   (ds/req :characters) int?
   (ds/req :seconds) int?
   (ds/req :usage_bytes) int?
   (ds/req :sessions) int?
   (ds/opt :amount) costs-result-amount-spec
   (ds/opt :line_item) string?
   })

(def usage-time-bucket-result-inner-spec
  (ds/spec
    {:name ::usage-time-bucket-result-inner
     :spec usage-time-bucket-result-inner-data}))
