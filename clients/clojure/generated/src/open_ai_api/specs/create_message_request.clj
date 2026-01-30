(ns open-ai-api.specs.create-message-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-message-request-content :refer :all]
            [open-ai-api.specs.create-message-request-attachments-inner :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-message-request-data
  {
   (ds/req :role) string?
   (ds/req :content) create-message-request-content-spec
   (ds/opt :attachments) (s/coll-of create-message-request-attachments-inner-spec)
   (ds/opt :metadata) any?
   })

(def create-message-request-spec
  (ds/spec
    {:name ::create-message-request
     :spec create-message-request-data}))
