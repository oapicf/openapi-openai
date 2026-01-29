(ns open-ai-api.specs.list-files-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs.open-ai-file :refer :all]
            )
  (:import (java.io File)))


(def list-files-response-data
  {
   (ds/req :data) (s/coll-of open-ai-file-spec)
   (ds/req :object) string?
   })

(def list-files-response-spec
  (ds/spec
    {:name ::list-files-response
     :spec list-files-response-data}))
