(ns open-ai-api.specs.create-moderation-response-results-inner-category-scores
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-response-results-inner-category-scores-data
  {
   (ds/req :hate) float?
   (ds/req :hatethreatening) float?
   (ds/req :harassment) float?
   (ds/req :harassmentthreatening) float?
   (ds/req :self-harm) float?
   (ds/req :self-harmintent) float?
   (ds/req :self-harminstructions) float?
   (ds/req :sexual) float?
   (ds/req :sexualminors) float?
   (ds/req :violence) float?
   (ds/req :violencegraphic) float?
   })

(def create-moderation-response-results-inner-category-scores-spec
  (ds/spec
    {:name ::create-moderation-response-results-inner-category-scores
     :spec create-moderation-response-results-inner-category-scores-data}))
