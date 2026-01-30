(ns open-ai-api.specs.complete-upload-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def complete-upload-request-data
  {
   (ds/req :part_ids) (s/coll-of string?)
   (ds/opt :md5) string?
   })

(def complete-upload-request-spec
  (ds/spec
    {:name ::complete-upload-request
     :spec complete-upload-request-data}))
