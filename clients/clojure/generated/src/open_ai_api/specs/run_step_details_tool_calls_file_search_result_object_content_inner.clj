(ns open-ai-api.specs.run-step-details-tool-calls-file-search-result-object-content-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-file-search-result-object-content-inner-data
  {
   (ds/opt :type) string?
   (ds/opt :text) string?
   })

(def run-step-details-tool-calls-file-search-result-object-content-inner-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-file-search-result-object-content-inner
     :spec run-step-details-tool-calls-file-search-result-object-content-inner-data}))
