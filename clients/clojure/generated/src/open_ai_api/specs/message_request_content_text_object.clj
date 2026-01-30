(ns open-ai-api.specs.message-request-content-text-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-request-content-text-object-data
  {
   (ds/req :type) string?
   (ds/req :text) string?
   })

(def message-request-content-text-object-spec
  (ds/spec
    {:name ::message-request-content-text-object
     :spec message-request-content-text-object-data}))
