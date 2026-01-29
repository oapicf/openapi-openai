(ns open-ai-api.specs.done-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def done-event-data
  {
   (ds/req :event) string?
   (ds/req :data) string?
   })

(def done-event-spec
  (ds/spec
    {:name ::done-event
     :spec done-event-data}))
