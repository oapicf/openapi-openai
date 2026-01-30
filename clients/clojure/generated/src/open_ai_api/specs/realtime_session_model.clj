(ns open-ai-api.specs.realtime-session-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-session-model-data
  {
   })

(def realtime-session-model-spec
  (ds/spec
    {:name ::realtime-session-model
     :spec realtime-session-model-data}))
