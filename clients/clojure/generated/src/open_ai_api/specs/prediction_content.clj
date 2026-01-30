(ns open-ai-api.specs.prediction-content
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.prediction-content-content :refer :all]
            )
  (:import (java.io File)))


(def prediction-content-data
  {
   (ds/req :type) string?
   (ds/req :content) prediction-content-content-spec
   })

(def prediction-content-spec
  (ds/spec
    {:name ::prediction-content
     :spec prediction-content-data}))
