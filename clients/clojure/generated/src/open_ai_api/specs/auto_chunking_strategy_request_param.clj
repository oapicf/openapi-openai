(ns open-ai-api.specs.auto-chunking-strategy-request-param
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def auto-chunking-strategy-request-param-data
  {
   (ds/req :type) string?
   })

(def auto-chunking-strategy-request-param-spec
  (ds/spec
    {:name ::auto-chunking-strategy-request-param
     :spec auto-chunking-strategy-request-param-data}))
