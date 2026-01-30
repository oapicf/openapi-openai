(ns open-ai-api.specs.assistant-tools-file-search-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.file-search-ranking-options :refer :all]
            )
  (:import (java.io File)))


(def assistant-tools-file-search-file-search-data
  {
   (ds/opt :max_num_results) int?
   (ds/opt :ranking_options) file-search-ranking-options-spec
   })

(def assistant-tools-file-search-file-search-spec
  (ds/spec
    {:name ::assistant-tools-file-search-file-search
     :spec assistant-tools-file-search-file-search-data}))
