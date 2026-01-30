(ns open-ai-api.specs.create-message-request-attachments-inner-tools-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-message-request-attachments-inner-tools-inner-data
  {
   (ds/req :type) string?
   })

(def create-message-request-attachments-inner-tools-inner-spec
  (ds/spec
    {:name ::create-message-request-attachments-inner-tools-inner
     :spec create-message-request-attachments-inner-tools-inner-data}))
