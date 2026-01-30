(ns open-ai-api.specs.run-step-details-tool-calls-file-search-ranking-options-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def run-step-details-tool-calls-file-search-ranking-options-object-data
  {
   (ds/req :ranker) string?
   (ds/req :score_threshold) float?
   })

(def run-step-details-tool-calls-file-search-ranking-options-object-spec
  (ds/spec
    {:name ::run-step-details-tool-calls-file-search-ranking-options-object
     :spec run-step-details-tool-calls-file-search-ranking-options-object-data}))
