(ns open-ai-api.specs.fine-tune-method
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [open-ai-api.specs. :refer :all]
            [open-ai-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def fine-tune-method-data
  {
   (ds/opt :type) string?
   (ds/opt :supervised) fine-tune-supervised-method-spec
   (ds/opt :dpo) fine-tune-dpo-method-spec
   })

(def fine-tune-method-spec
  (ds/spec
    {:name ::fine-tune-method
     :spec fine-tune-method-data}))
