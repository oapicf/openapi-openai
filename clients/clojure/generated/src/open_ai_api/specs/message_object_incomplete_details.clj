(ns open-ai-api.specs.message-object-incomplete-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def message-object-incomplete-details-data
  {
   (ds/req :reason) string?
   })

(def message-object-incomplete-details-spec
  (ds/spec
    {:name ::message-object-incomplete-details
     :spec message-object-incomplete-details-data}))
