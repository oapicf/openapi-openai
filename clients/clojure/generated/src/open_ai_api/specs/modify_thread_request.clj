(ns open-ai-api.specs.modify-thread-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def modify-thread-request-data
  {
   (ds/opt :metadata) any?
   })

(def modify-thread-request-spec
  (ds/spec
    {:name ::modify-thread-request
     :spec modify-thread-request-data}))
