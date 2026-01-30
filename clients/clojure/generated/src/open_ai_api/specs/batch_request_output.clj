(ns open-ai-api.specs.batch-request-output
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.batch-request-output-response :refer :all]
            [open-ai-api.specs.batch-request-output-error :refer :all]
            )
  (:import (java.io File)))


(def batch-request-output-data
  {
   (ds/opt :id) string?
   (ds/opt :custom_id) string?
   (ds/opt :response) batch-request-output-response-spec
   (ds/opt :error) batch-request-output-error-spec
   })

(def batch-request-output-spec
  (ds/spec
    {:name ::batch-request-output
     :spec batch-request-output-data}))
