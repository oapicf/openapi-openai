(ns open-ai-api.specs.assistant-tools-file-search-type-only
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def assistant-tools-file-search-type-only-data
  {
   (ds/req :type) string?
   })

(def assistant-tools-file-search-type-only-spec
  (ds/spec
    {:name ::assistant-tools-file-search-type-only
     :spec assistant-tools-file-search-type-only-data}))
