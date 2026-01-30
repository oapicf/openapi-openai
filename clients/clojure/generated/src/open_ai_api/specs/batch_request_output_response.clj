(ns open-ai-api.specs.batch-request-output-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def batch-request-output-response-data
  {
   (ds/opt :status_code) int?
   (ds/opt :request_id) string?
   (ds/opt :body) any?
   })

(def batch-request-output-response-spec
  (ds/spec
    {:name ::batch-request-output-response
     :spec batch-request-output-response-data}))
