(ns open-ai-api.specs.static-chunking-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy-static :refer :all]
            )
  (:import (java.io File)))


(def static-chunking-strategy-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-static-spec
   })

(def static-chunking-strategy-spec
  (ds/spec
    {:name ::static-chunking-strategy
     :spec static-chunking-strategy-data}))
