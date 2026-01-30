(ns open-ai-api.specs.usage-images-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def usage-images-result-data
  {
   (ds/req :object) string?
   (ds/req :images) int?
   (ds/req :num_model_requests) int?
   (ds/opt :source) string?
   (ds/opt :size) string?
   (ds/opt :project_id) string?
   (ds/opt :user_id) string?
   (ds/opt :api_key_id) string?
   (ds/opt :model) string?
   })

(def usage-images-result-spec
  (ds/spec
    {:name ::usage-images-result
     :spec usage-images-result-data}))
