(ns open-ai-api.specs.audit-log-rate-limit-updated-changes-requested
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audit-log-rate-limit-updated-changes-requested-data
  {
   (ds/opt :max_requests_per_1_minute) int?
   (ds/opt :max_tokens_per_1_minute) int?
   (ds/opt :max_images_per_1_minute) int?
   (ds/opt :max_audio_megabytes_per_1_minute) int?
   (ds/opt :max_requests_per_1_day) int?
   (ds/opt :batch_1_day_max_input_tokens) int?
   })

(def audit-log-rate-limit-updated-changes-requested-spec
  (ds/spec
    {:name ::audit-log-rate-limit-updated-changes-requested
     :spec audit-log-rate-limit-updated-changes-requested-data}))
