(ns open-ai-api.specs.other-chunking-strategy-response-param
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def other-chunking-strategy-response-param-data
  {
   (ds/req :type) string?
   })

(def other-chunking-strategy-response-param-spec
  (ds/spec
    {:name ::other-chunking-strategy-response-param
     :spec other-chunking-strategy-response-param-data}))
