(ns open-ai-api.specs.modify-run-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def modify-run-request-data
  {
   (ds/opt :metadata) any?
   })

(def modify-run-request-spec
  (ds/spec
    {:name ::modify-run-request
     :spec modify-run-request-data}))
