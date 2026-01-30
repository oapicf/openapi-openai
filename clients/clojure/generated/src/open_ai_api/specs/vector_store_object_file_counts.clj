(ns open-ai-api.specs.vector-store-object-file-counts
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vector-store-object-file-counts-data
  {
   (ds/req :in_progress) int?
   (ds/req :completed) int?
   (ds/req :failed) int?
   (ds/req :cancelled) int?
   (ds/req :total) int?
   })

(def vector-store-object-file-counts-spec
  (ds/spec
    {:name ::vector-store-object-file-counts
     :spec vector-store-object-file-counts-data}))
