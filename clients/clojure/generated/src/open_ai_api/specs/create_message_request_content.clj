(ns open-ai-api.specs.create-message-request-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-message-request-content-data
  {
   })

(def create-message-request-content-spec
  (ds/spec
    {:name ::create-message-request-content
     :spec create-message-request-content-data}))
