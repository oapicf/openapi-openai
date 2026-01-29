(ns open-ai-api.specs.create-assistant-file-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-assistant-file-request-data
  {
   (ds/req :file_id) string?
   })

(def create-assistant-file-request-spec
  (ds/spec
    {:name ::create-assistant-file-request
     :spec create-assistant-file-request-data}))
