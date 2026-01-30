(ns open-ai-api.specs.static-chunking-strategy-response-param
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy :refer :all]
            )
  (:import (java.io File)))


(def static-chunking-strategy-response-param-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-spec
   })

(def static-chunking-strategy-response-param-spec
  (ds/spec
    {:name ::static-chunking-strategy-response-param
     :spec static-chunking-strategy-response-param-data}))
