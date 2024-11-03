(ns open-ai-api.specs.create-message-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-message-request-data
  {
   (ds/req :role) string?
   (ds/req :content) string?
   (ds/opt :file_ids) (s/coll-of string?)
   (ds/opt :metadata) any?
   })

(def create-message-request-spec
  (ds/spec
    {:name ::create-message-request
     :spec create-message-request-data}))
