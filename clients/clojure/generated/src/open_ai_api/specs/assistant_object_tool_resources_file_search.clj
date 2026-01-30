(ns open-ai-api.specs.assistant-object-tool-resources-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-object-tool-resources-file-search-data
  {
   (ds/opt :vector_store_ids) (s/coll-of string?)
   })

(def assistant-object-tool-resources-file-search-spec
  (ds/spec
    {:name ::assistant-object-tool-resources-file-search
     :spec assistant-object-tool-resources-file-search-data}))
