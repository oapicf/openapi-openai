(ns open-ai-api.specs.message-content-refusal-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-content-refusal-object-data
  {
   (ds/req :type) string?
   (ds/req :refusal) string?
   })

(def message-content-refusal-object-spec
  (ds/spec
    {:name ::message-content-refusal-object
     :spec message-content-refusal-object-data}))
