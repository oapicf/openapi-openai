(ns open-ai-api.specs.prediction-content-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def prediction-content-content-data
  {
   })

(def prediction-content-content-spec
  (ds/spec
    {:name ::prediction-content-content
     :spec prediction-content-content-data}))
