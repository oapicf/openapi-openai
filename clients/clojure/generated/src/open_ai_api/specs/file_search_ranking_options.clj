(ns open-ai-api.specs.file-search-ranking-options
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def file-search-ranking-options-data
  {
   (ds/opt :ranker) string?
   (ds/req :score_threshold) float?
   })

(def file-search-ranking-options-spec
  (ds/spec
    {:name ::file-search-ranking-options
     :spec file-search-ranking-options-data}))
