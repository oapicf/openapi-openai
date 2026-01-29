(ns open-ai-api.specs.message-delta-content-text-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-content-text-object-text :refer :all]
            )
  (:import (java.io File)))


(def message-delta-content-text-object-data
  {
   (ds/req :index) int?
   (ds/req :type) string?
   (ds/opt :text) message-delta-content-text-object-text-spec
   })

(def message-delta-content-text-object-spec
  (ds/spec
    {:name ::message-delta-content-text-object
     :spec message-delta-content-text-object-data}))
