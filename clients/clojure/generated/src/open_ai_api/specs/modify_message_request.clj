(ns open-ai-api.specs.modify-message-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def modify-message-request-data
  {
   (ds/opt :metadata) any?
   })

(def modify-message-request-spec
  (ds/spec
    {:name ::modify-message-request
     :spec modify-message-request-data}))
