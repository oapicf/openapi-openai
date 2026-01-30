(ns open-ai-api.specs.modify-assistant-request-tool-resources-file-search
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def modify-assistant-request-tool-resources-file-search-data
  {
   (ds/opt :vector_store_ids) (s/coll-of string?)
   })

(def modify-assistant-request-tool-resources-file-search-spec
  (ds/spec
    {:name ::modify-assistant-request-tool-resources-file-search
     :spec modify-assistant-request-tool-resources-file-search-data}))
