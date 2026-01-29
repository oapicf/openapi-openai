(ns open-ai-api.specs.create-thread-and-run-request-tools-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.function-object :refer :all]
            )
  (:import (java.io File)))


(def create-thread-and-run-request-tools-inner-data
  {
   (ds/req :type) string?
   (ds/req :function) function-object-spec
   })

(def create-thread-and-run-request-tools-inner-spec
  (ds/spec
    {:name ::create-thread-and-run-request-tools-inner
     :spec create-thread-and-run-request-tools-inner-data}))
