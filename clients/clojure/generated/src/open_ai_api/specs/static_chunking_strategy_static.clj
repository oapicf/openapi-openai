(ns open-ai-api.specs.static-chunking-strategy-static
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def static-chunking-strategy-static-data
  {
   (ds/req :max_chunk_size_tokens) int?
   (ds/req :chunk_overlap_tokens) int?
   })

(def static-chunking-strategy-static-spec
  (ds/spec
    {:name ::static-chunking-strategy-static
     :spec static-chunking-strategy-static-data}))
