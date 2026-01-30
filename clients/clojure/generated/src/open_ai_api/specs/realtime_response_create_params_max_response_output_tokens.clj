(ns open-ai-api.specs.realtime-response-create-params-max-response-output-tokens
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def realtime-response-create-params-max-response-output-tokens-data
  {
   })

(def realtime-response-create-params-max-response-output-tokens-spec
  (ds/spec
    {:name ::realtime-response-create-params-max-response-output-tokens
     :spec realtime-response-create-params-max-response-output-tokens-data}))
