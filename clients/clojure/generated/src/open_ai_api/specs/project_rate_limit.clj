(ns open-ai-api.specs.project-rate-limit
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-rate-limit-data
  {
   (ds/req :object) string?
   (ds/req :id) string?
   (ds/req :model) string?
   (ds/req :max_requests_per_1_minute) int?
   (ds/req :max_tokens_per_1_minute) int?
   (ds/opt :max_images_per_1_minute) int?
   (ds/opt :max_audio_megabytes_per_1_minute) int?
   (ds/opt :max_requests_per_1_day) int?
   (ds/opt :batch_1_day_max_input_tokens) int?
   })

(def project-rate-limit-spec
  (ds/spec
    {:name ::project-rate-limit
     :spec project-rate-limit-data}))
