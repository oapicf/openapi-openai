(ns open-ai-api.specs.vector-store-file-object-last-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def vector-store-file-object-last-error-data
  {
   (ds/req :code) string?
   (ds/req :message) string?
   })

(def vector-store-file-object-last-error-spec
  (ds/spec
    {:name ::vector-store-file-object-last-error
     :spec vector-store-file-object-last-error-data}))
