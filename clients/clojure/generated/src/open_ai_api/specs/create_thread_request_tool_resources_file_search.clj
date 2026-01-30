(ns open-ai-api.specs.create-thread-request-tool-resources-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-thread-request-tool-resources-file-search-vector-stores-inner :refer :all]
            )
  (:import (java.io File)))


(def create-thread-request-tool-resources-file-search-data
  {
   (ds/opt :vector_store_ids) (s/coll-of string?)
   (ds/opt :vector_stores) (s/coll-of create-thread-request-tool-resources-file-search-vector-stores-inner-spec)
   })

(def create-thread-request-tool-resources-file-search-spec
  (ds/spec
    {:name ::create-thread-request-tool-resources-file-search
     :spec create-thread-request-tool-resources-file-search-data}))
