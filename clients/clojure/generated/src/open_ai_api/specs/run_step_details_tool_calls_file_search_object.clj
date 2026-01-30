(ns open-ai-api.specs.run-step-details-tool-calls-file-search-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-file-search-object-file-search :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-file-search-object-data
  {
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :file_search) run-step-details-tool-calls-file-search-object-file-search-spec
   })

(def run-step-details-tool-calls-file-search-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-file-search-object
     :spec run-step-details-tool-calls-file-search-object-data}))
