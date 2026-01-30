(ns open-ai-api.specs.run-step-delta-step-details-tool-calls-file-search-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def run-step-delta-step-details-tool-calls-file-search-object-data
  {
   (ds/req :index) int?
   (ds/opt :id) string?
   (ds/req :type) string?
   (ds/req :file_search) any?
   })

(def run-step-delta-step-details-tool-calls-file-search-object-spec
  (ds/spec
    {:name ::run-step-delta-step-details-tool-calls-file-search-object
     :spec run-step-delta-step-details-tool-calls-file-search-object-data}))
