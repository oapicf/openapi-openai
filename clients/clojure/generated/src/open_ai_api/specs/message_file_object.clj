(ns open-ai-api.specs.message-file-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-file-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :created_at) int?
   (ds/req :message_id) string?
   })

(def message-file-object-spec
  (ds/spec
    {:name ::message-file-object
     :spec message-file-object-data}))
