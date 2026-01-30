(ns open-ai-api.specs.run-step-details-tool-calls-file-search-object-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.run-step-details-tool-calls-file-search-ranking-options-object :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-file-search-result-object :refer :all]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-file-search-object-file-search-data
  {
   (ds/opt :ranking_options) run-step-details-tool-calls-file-search-ranking-options-object-spec
   (ds/opt :results) (s/coll-of run-step-details-tool-calls-file-search-result-object-spec)
   })

(def run-step-details-tool-calls-file-search-object-file-search-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-file-search-object-file-search
     :spec run-step-details-tool-calls-file-search-object-file-search-data}))
