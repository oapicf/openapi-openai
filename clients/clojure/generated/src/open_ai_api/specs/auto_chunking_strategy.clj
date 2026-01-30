(ns open-ai-api.specs.auto-chunking-strategy
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def auto-chunking-strategy-data
  {
   (ds/req :type) string?
   })

(def auto-chunking-strategy-spec
  (ds/spec
    {:name ::auto-chunking-strategy
     :spec auto-chunking-strategy-data}))
