(ns open-ai-api.specs.create-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-batch-request-data
  {
   (ds/req :input_file_id) string?
   (ds/req :endpoint) string?
   (ds/req :completion_window) string?
   (ds/opt :metadata) (s/map-of string? string?)
   })

(def create-batch-request-spec
  (ds/spec
    {:name ::create-batch-request
     :spec create-batch-request-data}))
