(ns open-ai-api.specs.assistant-object-tools-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-tools-file-search-file-search :refer :all]
            [open-ai-api.specs.function-object :refer :all]
            )
  (:import (java.io File)))


(def assistant-object-tools-inner-data
  {
   (ds/req :type) string?
   (ds/opt :file_search) assistant-tools-file-search-file-search-spec
   (ds/req :function) function-object-spec
   })

(def assistant-object-tools-inner-spec
  (ds/spec
    {:name ::assistant-object-tools-inner
     :spec assistant-object-tools-inner-data}))
