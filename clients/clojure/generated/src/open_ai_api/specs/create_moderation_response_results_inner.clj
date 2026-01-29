(ns open-ai-api.specs.create-moderation-response-results-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.create-moderation-response-results-inner-categories :refer :all]
            [open-ai-api.specs.create-moderation-response-results-inner-category-scores :refer :all]
            )
  (:import (java.io File)))


(def create-moderation-response-results-inner-data
  {
   (ds/req :flagged) boolean?
   (ds/req :categories) create-moderation-response-results-inner-categories-spec
   (ds/req :category_scores) create-moderation-response-results-inner-category-scores-spec
   })

(def create-moderation-response-results-inner-spec
  (ds/spec
    {:name ::create-moderation-response-results-inner
     :spec create-moderation-response-results-inner-data}))
