(ns open-ai-api.specs.assistant-tools-function
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.function-object :refer :all]
            )
  (:import (java.io File)))


(def assistant-tools-function-data
  {
   (ds/req :type) string?
   (ds/req :function) function-object-spec
   })

(def assistant-tools-function-spec
  (ds/spec
    {:name ::assistant-tools-function
     :spec assistant-tools-function-data}))
