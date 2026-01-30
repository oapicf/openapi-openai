(ns open-ai-api.specs.usage-completions-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-completions-result-data
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
   })

(def usage-completions-result-spec
  (ds/spec
    {:name ::usage-completions-result
     :spec usage-completions-result-data}))
