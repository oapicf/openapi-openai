(ns open-ai-api.specs.create-message-request-attachments-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-message-request-attachments-inner-tools-inner :refer :all]
            )
  (:import (java.io File)))


(def create-message-request-attachments-inner-data
  {
   (ds/opt :file_id) string?
   (ds/opt :tools) (s/coll-of create-message-request-attachments-inner-tools-inner-spec)
   })

(def create-message-request-attachments-inner-spec
  (ds/spec
    {:name ::create-message-request-attachments-inner
     :spec create-message-request-attachments-inner-data}))
