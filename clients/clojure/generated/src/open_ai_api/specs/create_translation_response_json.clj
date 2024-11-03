(ns open-ai-api.specs.create-translation-response-json
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-translation-response-json-data
  {
   (ds/req :text) string?
   })

(def create-translation-response-json-spec
  (ds/spec
    {:name ::create-translation-response-json
     :spec create-translation-response-json-data}))
