(ns open-ai-api.specs.image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def image-data
  {
   (ds/opt :b64_json) string?
   (ds/opt :url) string?
   (ds/opt :revised_prompt) string?
   })

(def image-spec
  (ds/spec
    {:name ::image
     :spec image-data}))
