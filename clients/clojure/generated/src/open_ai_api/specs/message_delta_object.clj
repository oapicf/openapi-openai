(ns open-ai-api.specs.message-delta-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.message-delta-object-delta :refer :all]
            )
  (:import (java.io File)))


(def message-delta-object-data
  {
   (ds/req :id) string?
   (ds/req :object) string?
   (ds/req :delta) message-delta-object-delta-spec
   })

(def message-delta-object-spec
  (ds/spec
    {:name ::message-delta-object
     :spec message-delta-object-data}))
