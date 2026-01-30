(ns open-ai-api.specs.create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy-static :refer :all]
            )
  (:import (java.io File)))


(def create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-static-spec
   })

(def create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy-spec
  (ds/spec
    {:name ::create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy
     :spec create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy-data}))
