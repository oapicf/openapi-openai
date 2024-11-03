(ns open-ai-api.specs.message-content-text-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-content-text-object-text :refer :all]
            )
  (:import (java.io File)))


(def message-content-text-object-data
  {
   (ds/req :type) string?
   (ds/req :text) message-content-text-object-text-spec
   })

(def message-content-text-object-spec
  (ds/spec
    {:name ::message-content-text-object
     :spec message-content-text-object-data}))
