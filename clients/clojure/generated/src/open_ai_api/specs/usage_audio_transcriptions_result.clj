(ns open-ai-api.specs.usage-audio-transcriptions-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-audio-transcriptions-result-data
  {
   (ds/req :object) string?
   (ds/req :seconds) int?
   (ds/req :num_model_requests) int?
   (ds/opt :project_id) string?
   (ds/opt :user_id) string?
   (ds/opt :api_key_id) string?
   (ds/opt :model) string?
   })

(def usage-audio-transcriptions-result-spec
  (ds/spec
    {:name ::usage-audio-transcriptions-result
     :spec usage-audio-transcriptions-result-data}))
