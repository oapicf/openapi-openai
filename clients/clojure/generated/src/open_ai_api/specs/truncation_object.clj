(ns open-ai-api.specs.truncation-object
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def truncation-object-data
  {
   (ds/opt :type) string?
   (ds/opt :last_messages) int?
   })

(def truncation-object-spec
  (ds/spec
    {:name ::truncation-object
     :spec truncation-object-data}))
