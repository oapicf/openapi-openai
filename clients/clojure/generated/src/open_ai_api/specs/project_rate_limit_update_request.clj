(ns open-ai-api.specs.project-rate-limit-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def project-rate-limit-update-request-data
  {
   (ds/opt :max_requests_per_1_minute) int?
   (ds/opt :max_tokens_per_1_minute) int?
   (ds/opt :max_images_per_1_minute) int?
   (ds/opt :max_audio_megabytes_per_1_minute) int?
   (ds/opt :max_requests_per_1_day) int?
   (ds/opt :batch_1_day_max_input_tokens) int?
   })

(def project-rate-limit-update-request-spec
  (ds/spec
    {:name ::project-rate-limit-update-request
     :spec project-rate-limit-update-request-data}))
