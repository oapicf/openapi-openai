(ns open-ai-api.specs.error-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.error :refer :all]
            )
  (:import (java.io File)))


(def error-event-data
  {
   (ds/req :event) string?
   (ds/req :data) error-spec
   })

(def error-event-spec
  (ds/spec
    {:name ::error-event
     :spec error-event-data}))
