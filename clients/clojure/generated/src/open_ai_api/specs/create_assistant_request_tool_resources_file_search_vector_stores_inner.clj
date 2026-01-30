(ns open-ai-api.specs.create-assistant-request-tool-resources-file-search-vector-stores-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-assistant-request-tool-resources-file-search-vector-stores-inner-data
  {
   (ds/opt :file_ids) (s/coll-of string?)
   (ds/opt :chunking_strategy) create-assistant-request-tool-resources-file-search-vector-stores-inner-chunking-strategy-spec
   (ds/opt :metadata) any?
   })

(def create-assistant-request-tool-resources-file-search-vector-stores-inner-spec
  (ds/spec
    {:name ::create-assistant-request-tool-resources-file-search-vector-stores-inner
     :spec create-assistant-request-tool-resources-file-search-vector-stores-inner-data}))
