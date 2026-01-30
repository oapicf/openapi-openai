(ns open-ai-api.specs.batch-request-output-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-request-output-error-data
  {
   (ds/opt :code) string?
   (ds/opt :message) string?
   })

(def batch-request-output-error-spec
  (ds/spec
    {:name ::batch-request-output-error
     :spec batch-request-output-error-data}))
