(ns open-ai-api.specs.vector-store-file-object-chunking-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy :refer :all]
            )
  (:import (java.io File)))


(def vector-store-file-object-chunking-strategy-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-spec
   })

(def vector-store-file-object-chunking-strategy-spec
  (ds/spec
    {:name ::vector-store-file-object-chunking-strategy
     :spec vector-store-file-object-chunking-strategy-data}))
