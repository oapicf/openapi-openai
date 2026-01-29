(ns open-ai-api.specs.fine-tuning-job-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def fine-tuning-job-error-data
  {
   (ds/req :code) string?
   (ds/req :message) string?
   (ds/req :param) string?
   })

(def fine-tuning-job-error-spec
  (ds/spec
    {:name ::fine-tuning-job-error
     :spec fine-tuning-job-error-data}))
