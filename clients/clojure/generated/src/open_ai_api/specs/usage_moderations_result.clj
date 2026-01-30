(ns open-ai-api.specs.usage-moderations-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-moderations-result-data
  {
   (ds/req :object) string?
   (ds/req :input_tokens) int?
   (ds/req :num_model_requests) int?
   (ds/opt :project_id) string?
   (ds/opt :user_id) string?
   (ds/opt :api_key_id) string?
   (ds/opt :model) string?
   })

(def usage-moderations-result-spec
  (ds/spec
    {:name ::usage-moderations-result
     :spec usage-moderations-result-data}))
