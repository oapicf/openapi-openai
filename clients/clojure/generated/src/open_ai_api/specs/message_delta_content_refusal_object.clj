(ns open-ai-api.specs.message-delta-content-refusal-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-delta-content-refusal-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :refusal) string?
   })

(def message-delta-content-refusal-object-spec
  (ds/spec
    {:name ::message-delta-content-refusal-object
     :spec message-delta-content-refusal-object-data}))
