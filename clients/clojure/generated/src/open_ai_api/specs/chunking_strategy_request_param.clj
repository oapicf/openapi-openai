(ns open-ai-api.specs.chunking-strategy-request-param
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.static-chunking-strategy :refer :all]
            )
  (:import (java.io File)))


(def chunking-strategy-request-param-data
  {
   (ds/req :type) string?
   (ds/req :static) static-chunking-strategy-spec
   })

(def chunking-strategy-request-param-spec
  (ds/spec
    {:name ::chunking-strategy-request-param
     :spec chunking-strategy-request-param-data}))
