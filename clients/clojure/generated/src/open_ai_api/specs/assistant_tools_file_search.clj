(ns open-ai-api.specs.assistant-tools-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-tools-file-search-file-search :refer :all]
            )
  (:import (java.io File)))


(def assistant-tools-file-search-data
  {
   (ds/req :type) string?
   (ds/opt :file_search) assistant-tools-file-search-file-search-spec
   })

(def assistant-tools-file-search-spec
  (ds/spec
    {:name ::assistant-tools-file-search
     :spec assistant-tools-file-search-data}))
