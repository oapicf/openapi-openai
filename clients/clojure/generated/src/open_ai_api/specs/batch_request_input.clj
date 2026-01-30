(ns open-ai-api.specs.batch-request-input
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-request-input-data
  {
   (ds/opt :custom_id) string?
   (ds/opt :method) string?
   (ds/opt :url) string?
   })

(def batch-request-input-spec
  (ds/spec
    {:name ::batch-request-input
     :spec batch-request-input-data}))
