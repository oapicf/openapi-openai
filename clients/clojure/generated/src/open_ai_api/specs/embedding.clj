(ns open-ai-api.specs.embedding
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def embedding-data
  {
   (ds/req :index) int?
   (ds/req :embedding) (s/coll-of float?)
   (ds/req :object) string?
   })

(def embedding-spec
  (ds/spec
    {:name ::embedding
     :spec embedding-data}))
