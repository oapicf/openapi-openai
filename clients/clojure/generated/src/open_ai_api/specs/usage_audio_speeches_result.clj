(ns open-ai-api.specs.usage-audio-speeches-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-audio-speeches-result-data
  {
   (ds/req :object) string?
   (ds/req :characters) int?
   (ds/req :num_model_requests) int?
   (ds/opt :project_id) string?
   (ds/opt :user_id) string?
   (ds/opt :api_key_id) string?
   (ds/opt :model) string?
   })

(def usage-audio-speeches-result-spec
  (ds/spec
    {:name ::usage-audio-speeches-result
     :spec usage-audio-speeches-result-data}))
