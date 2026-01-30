(ns open-ai-api.specs.create-moderation-response-results-inner-categories
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-response-results-inner-categories-data
  {
   (ds/req :hate) boolean?
   (ds/req :hatethreatening) boolean?
   (ds/req :harassment) boolean?
   (ds/req :harassmentthreatening) boolean?
   (ds/req :illicit) boolean?
   (ds/req :illicitviolent) boolean?
   (ds/req :self-harm) boolean?
   (ds/req :self-harmintent) boolean?
   (ds/req :self-harminstructions) boolean?
   (ds/req :sexual) boolean?
   (ds/req :sexualminors) boolean?
   (ds/req :violence) boolean?
   (ds/req :violencegraphic) boolean?
   })

(def create-moderation-response-results-inner-categories-spec
  (ds/spec
    {:name ::create-moderation-response-results-inner-categories
     :spec create-moderation-response-results-inner-categories-data}))
