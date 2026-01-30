(ns open-ai-api.specs.create-moderation-response-results-inner-category-applied-input-types
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-moderation-response-results-inner-category-applied-input-types-data
  {
   (ds/req :hate) (s/coll-of string?)
   (ds/req :hatethreatening) (s/coll-of string?)
   (ds/req :harassment) (s/coll-of string?)
   (ds/req :harassmentthreatening) (s/coll-of string?)
   (ds/req :illicit) (s/coll-of string?)
   (ds/req :illicitviolent) (s/coll-of string?)
   (ds/req :self-harm) (s/coll-of string?)
   (ds/req :self-harmintent) (s/coll-of string?)
   (ds/req :self-harminstructions) (s/coll-of string?)
   (ds/req :sexual) (s/coll-of string?)
   (ds/req :sexualminors) (s/coll-of string?)
   (ds/req :violence) (s/coll-of string?)
   (ds/req :violencegraphic) (s/coll-of string?)
   })

(def create-moderation-response-results-inner-category-applied-input-types-spec
  (ds/spec
    {:name ::create-moderation-response-results-inner-category-applied-input-types
     :spec create-moderation-response-results-inner-category-applied-input-types-data}))
