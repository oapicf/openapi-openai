(ns open-ai-api.specs.create-thread-and-run-request-tools-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.assistant-tools-file-search-file-search :refer :all]
            [open-ai-api.specs.function-object :refer :all]
            )
  (:import (java.io File)))


(def create-thread-and-run-request-tools-inner-data
  {
   (ds/req :type) string?
   (ds/opt :file_search) assistant-tools-file-search-file-search-spec
   (ds/req :function) function-object-spec
   })

(def create-thread-and-run-request-tools-inner-spec
  (ds/spec
    {:name ::create-thread-and-run-request-tools-inner
     :spec create-thread-and-run-request-tools-inner-data}))
