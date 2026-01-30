(ns open-ai-api.specs.run-step-details-tool-calls-file-search-result-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-file-search-result-object-content-inner :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-file-search-result-object-data
  {
   (ds/req :file_id) string?
   (ds/req :file_name) string?
   (ds/req :score) float?
   (ds/opt :content) (s/coll-of run-step-details-tool-calls-file-search-result-object-content-inner-spec)
   })

(def run-step-details-tool-calls-file-search-result-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-file-search-result-object
     :spec run-step-details-tool-calls-file-search-result-object-data}))
