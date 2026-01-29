(ns open-ai-api.specs.thread-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def thread-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :metadata) any?
   })

(def thread-object-spec
  (ds/spec
    {:name ::thread-object
     :spec thread-object-data}))
