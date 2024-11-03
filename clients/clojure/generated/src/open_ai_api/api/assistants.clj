(ns open-ai-api.api.assistants
  (:require [open-ai-api.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [open-ai-api.specs.chat-completion-tool-choice-option :refer :all]
            [open-ai-api.specs.run-step-details-message-creation-object :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-retrieval-object :refer :all]
            [open-ai-api.specs.message-object-incomplete-details :refer :all]
            [open-ai-api.specs.message-delta-content-text-object-text-annotations-inner :refer :all]
            [open-ai-api.specs.create-chat-completion-request-model :refer :all]
            [open-ai-api.specs.message-stream-event :refer :all]
            [open-ai-api.specs.done-event :refer :all]
            [open-ai-api.specs.chat-completion-stream-response-delta-function-call :refer :all]
            [open-ai-api.specs.message-delta-content-text-annotations-file-path-object :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object :refer :all]
            [open-ai-api.specs.create-chat-completion-request-function-call :refer :all]
            [open-ai-api.specs.message-content-text-object-text :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of :refer :all]
            [open-ai-api.specs.chat-completion-request-user-message-content :refer :all]
            [open-ai-api.specs.create-moderation-request-model :refer :all]
            [open-ai-api.specs.create-run-request :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-batch-size :refer :all]
            [open-ai-api.specs.create-assistant-request-model :refer :all]
            [open-ai-api.specs.run-tool-call-object :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-retrieval-object :refer :all]
            [open-ai-api.specs.create-completion-request-model :refer :all]
            [open-ai-api.specs.create-translation-response-json :refer :all]
            [open-ai-api.specs.run-object-incomplete-details :refer :all]
            [open-ai-api.specs.create-assistant-file-request :refer :all]
            [open-ai-api.specs.chat-completion-tool :refer :all]
            [open-ai-api.specs.delete-file-response :refer :all]
            [open-ai-api.specs.run-completion-usage :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-object :refer :all]
            [open-ai-api.specs.modify-run-request :refer :all]
            [open-ai-api.specs.fine-tuning-job-hyperparameters-n-epochs :refer :all]
            [open-ai-api.specs.create-chat-completion-stream-response :refer :all]
            [open-ai-api.specs.list-run-steps-response :refer :all]
            [open-ai-api.specs.assistant-tools-code :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message-function-call :refer :all]
            [open-ai-api.specs.create-translation-response-verbose-json :refer :all]
            [open-ai-api.specs.assistants-api-tool-choice-option :refer :all]
            [open-ai-api.specs.message-file-object :refer :all]
            [open-ai-api.specs.list-fine-tuning-job-events-response :refer :all]
            [open-ai-api.specs.list-threads-response :refer :all]
            [open-ai-api.specs.create-transcription-request-model :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call :refer :all]
            [open-ai-api.specs.chat-completion-request-function-message :refer :all]
            [open-ai-api.specs.list-files-response :refer :all]
            [open-ai-api.specs.chat-completion-named-tool-choice :refer :all]
            [open-ai-api.specs.create-message-request :refer :all]
            [open-ai-api.specs.create-speech-request-model :refer :all]
            [open-ai-api.specs.modify-thread-request :refer :all]
            [open-ai-api.specs.transcription-word :refer :all]
            [open-ai-api.specs.submit-tool-outputs-run-request-tool-outputs-inner :refer :all]
            [open-ai-api.specs.message-delta-content-image-file-object :refer :all]
            [open-ai-api.specs.create-chat-completion-function-response :refer :all]
            [open-ai-api.specs.delete-thread-response :refer :all]
            [open-ai-api.specs.chat-completion-request-tool-message :refer :all]
            [open-ai-api.specs.assistant-object :refer :all]
            [open-ai-api.specs.list-models-response :refer :all]
            [open-ai-api.specs.images-response :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-function-object-function :refer :all]
            [open-ai-api.specs.create-image-request-model :refer :all]
            [open-ai-api.specs.chat-completion-function-call-option :refer :all]
            [open-ai-api.specs.run-tool-call-object-function :refer :all]
            [open-ai-api.specs.list-assistants-response :refer :all]
            [open-ai-api.specs.run-object-required-action :refer :all]
            [open-ai-api.specs.delete-message-response :refer :all]
            [open-ai-api.specs.assistant-object-tools-inner :refer :all]
            [open-ai-api.specs.create-chat-completion-request-response-format :refer :all]
            [open-ai-api.specs.create-chat-completion-response-choices-inner :refer :all]
            [open-ai-api.specs.create-run-request-model :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call-chunk-function :refer :all]
            [open-ai-api.specs.run-object-last-error :refer :all]
            [open-ai-api.specs.list-runs-response :refer :all]
            [open-ai-api.specs.run-step-object :refer :all]
            [open-ai-api.specs.create-moderation-response-results-inner-category-scores :refer :all]
            [open-ai-api.specs.message-delta-object :refer :all]
            [open-ai-api.specs.create-chat-completion-request-stop :refer :all]
            [open-ai-api.specs.create-transcription-200-response :refer :all]
            [open-ai-api.specs.message-object :refer :all]
            [open-ai-api.specs.create-completion-request :refer :all]
            [open-ai-api.specs.chat-completion-functions :refer :all]
            [open-ai-api.specs.assistants-api-response-format :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-wandb :refer :all]
            [open-ai-api.specs.run-object-required-action-submit-tool-outputs :refer :all]
            [open-ai-api.specs.image :refer :all]
            [open-ai-api.specs.chat-completion-request-message-content-part :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-logs-object :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call-function :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters :refer :all]
            [open-ai-api.specs.message-content-image-file-object :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-6 :refer :all]
            [open-ai-api.specs.assistants-api-named-tool-choice :refer :all]
            [open-ai-api.specs.fine-tuning-job :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-1 :refer :all]
            [open-ai-api.specs.message-content-text-annotations-file-citation-object :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-2 :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-3 :refer :all]
            [open-ai-api.specs.create-speech-request :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-4 :refer :all]
            [open-ai-api.specs.run-step-stream-event-one-of-5 :refer :all]
            [open-ai-api.specs.create-completion-request-prompt :refer :all]
            [open-ai-api.specs.create-moderation-response :refer :all]
            [open-ai-api.specs.assistants-api-response-format-option :refer :all]
            [open-ai-api.specs.run-step-delta-object :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object-image :refer :all]
            [open-ai-api.specs.list-message-files-response :refer :all]
            [open-ai-api.specs.chat-completion-request-assistant-message :refer :all]
            [open-ai-api.specs.fine-tuning-job-error :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-model :refer :all]
            [open-ai-api.specs.create-embedding-request-input :refer :all]
            [open-ai-api.specs.transcription-segment :refer :all]
            [open-ai-api.specs.create-chat-completion-function-response-choices-inner :refer :all]
            [open-ai-api.specs.message-content-text-annotations-file-path-object :refer :all]
            [open-ai-api.specs.run-step-delta-object-delta-step-details :refer :all]
            [open-ai-api.specs.run-step-object-last-error :refer :all]
            [open-ai-api.specs.run-object :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-output-image-object-image :refer :all]
            [open-ai-api.specs.assistant-stream-event :refer :all]
            [open-ai-api.specs.message-delta-content-image-file-object-image-file :refer :all]
            [open-ai-api.specs.create-thread-and-run-request-tools-inner :refer :all]
            [open-ai-api.specs.message-content-text-annotations-file-citation-object-file-citation :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-n-epochs :refer :all]
            [open-ai-api.specs.message-content-text-annotations-file-path-object-file-path :refer :all]
            [open-ai-api.specs.message-stream-event-one-of-3 :refer :all]
            [open-ai-api.specs.message-stream-event-one-of-4 :refer :all]
            [open-ai-api.specs.message-stream-event-one-of-1 :refer :all]
            [open-ai-api.specs.message-stream-event-one-of-2 :refer :all]
            [open-ai-api.specs.chat-completion-role :refer :all]
            [open-ai-api.specs.create-completion-request-stop :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner-type :refer :all]
            [open-ai-api.specs.chat-completion-request-user-message :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter :refer :all]
            [open-ai-api.specs.fine-tuning-integration :refer :all]
            [open-ai-api.specs.model :refer :all]
            [open-ai-api.specs.chat-completion-request-message-content-part-image-image-url :refer :all]
            [open-ai-api.specs.create-chat-completion-response :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-object-tool-calls-inner :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-object-code-interpreter-outputs-inner :refer :all]
            [open-ai-api.specs.create-embedding-request :refer :all]
            [open-ai-api.specs.message-stream-event-one-of :refer :all]
            [open-ai-api.specs.create-moderation-request-input :refer :all]
            [open-ai-api.specs.create-moderation-response-results-inner :refer :all]
            [open-ai-api.specs.chat-completion-stream-response-delta :refer :all]
            [open-ai-api.specs.create-embedding-response :refer :all]
            [open-ai-api.specs.message-content-text-object :refer :all]
            [open-ai-api.specs.chat-completion-response-message :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-object :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter-outputs-inner :refer :all]
            [open-ai-api.specs.run-step-details-message-creation-object-message-creation :refer :all]
            [open-ai-api.specs.fine-tuning-job-checkpoint :refer :all]
            [open-ai-api.specs.create-embedding-response-usage :refer :all]
            [open-ai-api.specs.fine-tuning-job-integrations-inner :refer :all]
            [open-ai-api.specs.create-translation-200-response :refer :all]
            [open-ai-api.specs.delete-assistant-response :refer :all]
            [open-ai-api.specs.create-chat-completion-stream-response-choices-inner :refer :all]
            [open-ai-api.specs.message-delta-content-text-annotations-file-citation-object-file-citation :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-function-object :refer :all]
            [open-ai-api.specs.list-fine-tuning-job-checkpoints-response :refer :all]
            [open-ai-api.specs.embedding :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-output-image-object :refer :all]
            [open-ai-api.specs.message-delta-object-delta :refer :all]
            [open-ai-api.specs.run-step-completion-usage :refer :all]
            [open-ai-api.specs.open-ai-file :refer :all]
            [open-ai-api.specs.message-content-text-object-text-annotations-inner :refer :all]
            [open-ai-api.specs.create-moderation-response-results-inner-categories :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object :refer :all]
            [open-ai-api.specs.message-delta-content-text-annotations-file-citation-object :refer :all]
            [open-ai-api.specs.fine-tuning-job-event :refer :all]
            [open-ai-api.specs.message-delta-content-text-object :refer :all]
            [open-ai-api.specs.message-delta-content-text-annotations-file-path-object-file-path :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-object-tool-calls-inner :refer :all]
            [open-ai-api.specs.delete-model-response :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-5 :refer :all]
            [open-ai-api.specs.create-assistant-request :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-6 :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-7 :refer :all]
            [open-ai-api.specs.create-image-request :refer :all]
            [open-ai-api.specs.thread-stream-event :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-8 :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-1 :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-output-logs-object :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-2 :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-3 :refer :all]
            [open-ai-api.specs.create-embedding-request-model :refer :all]
            [open-ai-api.specs.run-stream-event-one-of-4 :refer :all]
            [open-ai-api.specs.create-fine-tuning-job-request-integrations-inner :refer :all]
            [open-ai-api.specs.chat-completion-named-tool-choice-function :refer :all]
            [open-ai-api.specs.run-step-object-step-details :refer :all]
            [open-ai-api.specs.fine-tuning-job-hyperparameters :refer :all]
            [open-ai-api.specs.fine-tuning-job-checkpoint-metrics :refer :all]
            [open-ai-api.specs.run-stream-event :refer :all]
            [open-ai-api.specs.create-chat-completion-request :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-message-creation-object-message-creation :refer :all]
            [open-ai-api.specs.completion-usage :refer :all]
            [open-ai-api.specs.create-chat-completion-response-choices-inner-logprobs :refer :all]
            [open-ai-api.specs.function-object :refer :all]
            [open-ai-api.specs.assistant-file-object :refer :all]
            [open-ai-api.specs.create-image-edit-request-model :refer :all]
            [open-ai-api.specs.create-completion-response :refer :all]
            [open-ai-api.specs.thread-stream-event-one-of :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-object :refer :all]
            [open-ai-api.specs.message-content-image-file-object-image-file :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-function-object-function :refer :all]
            [open-ai-api.specs.run-step-delta-object-delta :refer :all]
            [open-ai-api.specs.submit-tool-outputs-run-request :refer :all]
            [open-ai-api.specs.modify-message-request :refer :all]
            [open-ai-api.specs.list-assistant-files-response :refer :all]
            [open-ai-api.specs.run-step-stream-event :refer :all]
            [open-ai-api.specs.error-event :refer :all]
            [open-ai-api.specs.message-delta-object-delta-content-inner :refer :all]
            [open-ai-api.specs.create-moderation-request :refer :all]
            [open-ai-api.specs.create-transcription-response-json :refer :all]
            [open-ai-api.specs.message-object-content-inner :refer :all]
            [open-ai-api.specs.message-delta-content-text-object-text :refer :all]
            [open-ai-api.specs.chat-completion-message-tool-call-chunk :refer :all]
            [open-ai-api.specs.run-stream-event-one-of :refer :all]
            [open-ai-api.specs.create-completion-response-choices-inner :refer :all]
            [open-ai-api.specs.error :refer :all]
            [open-ai-api.specs.chat-completion-token-logprob-top-logprobs-inner :refer :all]
            [open-ai-api.specs.create-thread-and-run-request :refer :all]
            [open-ai-api.specs.thread-object :refer :all]
            [open-ai-api.specs.chat-completion-request-system-message :refer :all]
            [open-ai-api.specs.create-completion-response-choices-inner-logprobs :refer :all]
            [open-ai-api.specs.truncation-object :refer :all]
            [open-ai-api.specs.list-paginated-fine-tuning-jobs-response :refer :all]
            [open-ai-api.specs.run-step-details-tool-calls-code-output-image-object :refer :all]
            [open-ai-api.specs.delete-assistant-file-response :refer :all]
            [open-ai-api.specs.create-thread-request :refer :all]
            [open-ai-api.specs.create-transcription-response-verbose-json :refer :all]
            [open-ai-api.specs.list-messages-response :refer :all]
            [open-ai-api.specs.assistant-tools-function :refer :all]
            [open-ai-api.specs.chat-completion-token-logprob :refer :all]
            [open-ai-api.specs.error-response :refer :all]
            [open-ai-api.specs.chat-completion-request-message-content-part-image :refer :all]
            [open-ai-api.specs.chat-completion-request-message :refer :all]
            [open-ai-api.specs.chat-completion-request-message-content-part-text :refer :all]
            [open-ai-api.specs.assistant-tools-retrieval :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-message-creation-object :refer :all]
            [open-ai-api.specs.modify-assistant-request :refer :all]
            [open-ai-api.specs.run-step-delta-step-details-tool-calls-code-object-code-interpreter :refer :all]
            )
  (:import (java.io File)))


(defn-spec cancel-run-with-http-info any?
  "Cancels a run that is `in_progress`."
  [thread_id string?, run_id string?]
  (check-required-params thread_id run_id)
  (call-api "/threads/{thread_id}/runs/{run_id}/cancel" :post
            {:path-params   {"thread_id" thread_id "run_id" run_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec cancel-run run-object-spec
  "Cancels a run that is `in_progress`."
  [thread_id string?, run_id string?]
  (let [res (:data (cancel-run-with-http-info thread_id run_id))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


(defn-spec create-assistant-with-http-info any?
  "Create an assistant with a model and instructions."
  [create-assistant-request create-assistant-request]
  (check-required-params create-assistant-request)
  (call-api "/assistants" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-assistant-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-assistant assistant-object-spec
  "Create an assistant with a model and instructions."
  [create-assistant-request create-assistant-request]
  (let [res (:data (create-assistant-with-http-info create-assistant-request))]
    (if (:decode-models *api-context*)
       (st/decode assistant-object-spec res st/string-transformer)
       res)))


(defn-spec create-assistant-file-with-http-info any?
  "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)."
  [assistant_id string?, create-assistant-file-request create-assistant-file-request]
  (check-required-params assistant_id create-assistant-file-request)
  (call-api "/assistants/{assistant_id}/files" :post
            {:path-params   {"assistant_id" assistant_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-assistant-file-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-assistant-file assistant-file-object-spec
  "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants)."
  [assistant_id string?, create-assistant-file-request create-assistant-file-request]
  (let [res (:data (create-assistant-file-with-http-info assistant_id create-assistant-file-request))]
    (if (:decode-models *api-context*)
       (st/decode assistant-file-object-spec res st/string-transformer)
       res)))


(defn-spec create-message-with-http-info any?
  "Create a message."
  [thread_id string?, create-message-request create-message-request]
  (check-required-params thread_id create-message-request)
  (call-api "/threads/{thread_id}/messages" :post
            {:path-params   {"thread_id" thread_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-message-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-message message-object-spec
  "Create a message."
  [thread_id string?, create-message-request create-message-request]
  (let [res (:data (create-message-with-http-info thread_id create-message-request))]
    (if (:decode-models *api-context*)
       (st/decode message-object-spec res st/string-transformer)
       res)))


(defn-spec create-run-with-http-info any?
  "Create a run."
  [thread_id string?, create-run-request create-run-request]
  (check-required-params thread_id create-run-request)
  (call-api "/threads/{thread_id}/runs" :post
            {:path-params   {"thread_id" thread_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-run-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-run run-object-spec
  "Create a run."
  [thread_id string?, create-run-request create-run-request]
  (let [res (:data (create-run-with-http-info thread_id create-run-request))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


(defn-spec create-thread-with-http-info any?
  "Create a thread."
  ([] (create-thread-with-http-info nil))
  ([{:keys [create-thread-request]} (s/map-of keyword? any?)]
   (call-api "/threads" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    create-thread-request
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec create-thread thread-object-spec
  "Create a thread."
  ([] (create-thread nil))
  ([optional-params any?]
   (let [res (:data (create-thread-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode thread-object-spec res st/string-transformer)
        res))))


(defn-spec create-thread-and-run-with-http-info any?
  "Create a thread and run it in one request."
  [create-thread-and-run-request create-thread-and-run-request]
  (check-required-params create-thread-and-run-request)
  (call-api "/threads/runs" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    create-thread-and-run-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-thread-and-run run-object-spec
  "Create a thread and run it in one request."
  [create-thread-and-run-request create-thread-and-run-request]
  (let [res (:data (create-thread-and-run-with-http-info create-thread-and-run-request))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


(defn-spec delete-assistant-with-http-info any?
  "Delete an assistant."
  [assistant_id string?]
  (check-required-params assistant_id)
  (call-api "/assistants/{assistant_id}" :delete
            {:path-params   {"assistant_id" assistant_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec delete-assistant delete-assistant-response-spec
  "Delete an assistant."
  [assistant_id string?]
  (let [res (:data (delete-assistant-with-http-info assistant_id))]
    (if (:decode-models *api-context*)
       (st/decode delete-assistant-response-spec res st/string-transformer)
       res)))


(defn-spec delete-assistant-file-with-http-info any?
  "Delete an assistant file."
  [assistant_id string?, file_id string?]
  (check-required-params assistant_id file_id)
  (call-api "/assistants/{assistant_id}/files/{file_id}" :delete
            {:path-params   {"assistant_id" assistant_id "file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec delete-assistant-file delete-assistant-file-response-spec
  "Delete an assistant file."
  [assistant_id string?, file_id string?]
  (let [res (:data (delete-assistant-file-with-http-info assistant_id file_id))]
    (if (:decode-models *api-context*)
       (st/decode delete-assistant-file-response-spec res st/string-transformer)
       res)))


(defn-spec delete-thread-with-http-info any?
  "Delete a thread."
  [thread_id string?]
  (check-required-params thread_id)
  (call-api "/threads/{thread_id}" :delete
            {:path-params   {"thread_id" thread_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec delete-thread delete-thread-response-spec
  "Delete a thread."
  [thread_id string?]
  (let [res (:data (delete-thread-with-http-info thread_id))]
    (if (:decode-models *api-context*)
       (st/decode delete-thread-response-spec res st/string-transformer)
       res)))


(defn-spec get-assistant-with-http-info any?
  "Retrieves an assistant."
  [assistant_id string?]
  (check-required-params assistant_id)
  (call-api "/assistants/{assistant_id}" :get
            {:path-params   {"assistant_id" assistant_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-assistant assistant-object-spec
  "Retrieves an assistant."
  [assistant_id string?]
  (let [res (:data (get-assistant-with-http-info assistant_id))]
    (if (:decode-models *api-context*)
       (st/decode assistant-object-spec res st/string-transformer)
       res)))


(defn-spec get-assistant-file-with-http-info any?
  "Retrieves an AssistantFile."
  [assistant_id string?, file_id string?]
  (check-required-params assistant_id file_id)
  (call-api "/assistants/{assistant_id}/files/{file_id}" :get
            {:path-params   {"assistant_id" assistant_id "file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-assistant-file assistant-file-object-spec
  "Retrieves an AssistantFile."
  [assistant_id string?, file_id string?]
  (let [res (:data (get-assistant-file-with-http-info assistant_id file_id))]
    (if (:decode-models *api-context*)
       (st/decode assistant-file-object-spec res st/string-transformer)
       res)))


(defn-spec get-message-with-http-info any?
  "Retrieve a message."
  [thread_id string?, message_id string?]
  (check-required-params thread_id message_id)
  (call-api "/threads/{thread_id}/messages/{message_id}" :get
            {:path-params   {"thread_id" thread_id "message_id" message_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-message message-object-spec
  "Retrieve a message."
  [thread_id string?, message_id string?]
  (let [res (:data (get-message-with-http-info thread_id message_id))]
    (if (:decode-models *api-context*)
       (st/decode message-object-spec res st/string-transformer)
       res)))


(defn-spec get-message-file-with-http-info any?
  "Retrieves a message file."
  [thread_id string?, message_id string?, file_id string?]
  (check-required-params thread_id message_id file_id)
  (call-api "/threads/{thread_id}/messages/{message_id}/files/{file_id}" :get
            {:path-params   {"thread_id" thread_id "message_id" message_id "file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-message-file message-file-object-spec
  "Retrieves a message file."
  [thread_id string?, message_id string?, file_id string?]
  (let [res (:data (get-message-file-with-http-info thread_id message_id file_id))]
    (if (:decode-models *api-context*)
       (st/decode message-file-object-spec res st/string-transformer)
       res)))


(defn-spec get-run-with-http-info any?
  "Retrieves a run."
  [thread_id string?, run_id string?]
  (check-required-params thread_id run_id)
  (call-api "/threads/{thread_id}/runs/{run_id}" :get
            {:path-params   {"thread_id" thread_id "run_id" run_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-run run-object-spec
  "Retrieves a run."
  [thread_id string?, run_id string?]
  (let [res (:data (get-run-with-http-info thread_id run_id))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


(defn-spec get-run-step-with-http-info any?
  "Retrieves a run step."
  [thread_id string?, run_id string?, step_id string?]
  (check-required-params thread_id run_id step_id)
  (call-api "/threads/{thread_id}/runs/{run_id}/steps/{step_id}" :get
            {:path-params   {"thread_id" thread_id "run_id" run_id "step_id" step_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-run-step run-step-object-spec
  "Retrieves a run step."
  [thread_id string?, run_id string?, step_id string?]
  (let [res (:data (get-run-step-with-http-info thread_id run_id step_id))]
    (if (:decode-models *api-context*)
       (st/decode run-step-object-spec res st/string-transformer)
       res)))


(defn-spec get-thread-with-http-info any?
  "Retrieves a thread."
  [thread_id string?]
  (check-required-params thread_id)
  (call-api "/threads/{thread_id}" :get
            {:path-params   {"thread_id" thread_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec get-thread thread-object-spec
  "Retrieves a thread."
  [thread_id string?]
  (let [res (:data (get-thread-with-http-info thread_id))]
    (if (:decode-models *api-context*)
       (st/decode thread-object-spec res st/string-transformer)
       res)))


(defn-spec list-assistant-files-with-http-info any?
  "Returns a list of assistant files."
  ([assistant_id string?, ] (list-assistant-files-with-http-info assistant_id nil))
  ([assistant_id string?, {:keys [limit order after before]} (s/map-of keyword? any?)]
   (check-required-params assistant_id)
   (call-api "/assistants/{assistant_id}/files" :get
             {:path-params   {"assistant_id" assistant_id }
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-assistant-files list-assistant-files-response-spec
  "Returns a list of assistant files."
  ([assistant_id string?, ] (list-assistant-files assistant_id nil))
  ([assistant_id string?, optional-params any?]
   (let [res (:data (list-assistant-files-with-http-info assistant_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-assistant-files-response-spec res st/string-transformer)
        res))))


(defn-spec list-assistants-with-http-info any?
  "Returns a list of assistants."
  ([] (list-assistants-with-http-info nil))
  ([{:keys [limit order after before]} (s/map-of keyword? any?)]
   (call-api "/assistants" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-assistants list-assistants-response-spec
  "Returns a list of assistants."
  ([] (list-assistants nil))
  ([optional-params any?]
   (let [res (:data (list-assistants-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-assistants-response-spec res st/string-transformer)
        res))))


(defn-spec list-message-files-with-http-info any?
  "Returns a list of message files."
  ([thread_id string?, message_id string?, ] (list-message-files-with-http-info thread_id message_id nil))
  ([thread_id string?, message_id string?, {:keys [limit order after before]} (s/map-of keyword? any?)]
   (check-required-params thread_id message_id)
   (call-api "/threads/{thread_id}/messages/{message_id}/files" :get
             {:path-params   {"thread_id" thread_id "message_id" message_id }
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-message-files list-message-files-response-spec
  "Returns a list of message files."
  ([thread_id string?, message_id string?, ] (list-message-files thread_id message_id nil))
  ([thread_id string?, message_id string?, optional-params any?]
   (let [res (:data (list-message-files-with-http-info thread_id message_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-message-files-response-spec res st/string-transformer)
        res))))


(defn-spec list-messages-with-http-info any?
  "Returns a list of messages for a given thread."
  ([thread_id string?, ] (list-messages-with-http-info thread_id nil))
  ([thread_id string?, {:keys [limit order after before run_id]} (s/map-of keyword? any?)]
   (check-required-params thread_id)
   (call-api "/threads/{thread_id}/messages" :get
             {:path-params   {"thread_id" thread_id }
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before "run_id" run_id }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-messages list-messages-response-spec
  "Returns a list of messages for a given thread."
  ([thread_id string?, ] (list-messages thread_id nil))
  ([thread_id string?, optional-params any?]
   (let [res (:data (list-messages-with-http-info thread_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-messages-response-spec res st/string-transformer)
        res))))


(defn-spec list-run-steps-with-http-info any?
  "Returns a list of run steps belonging to a run."
  ([thread_id string?, run_id string?, ] (list-run-steps-with-http-info thread_id run_id nil))
  ([thread_id string?, run_id string?, {:keys [limit order after before]} (s/map-of keyword? any?)]
   (check-required-params thread_id run_id)
   (call-api "/threads/{thread_id}/runs/{run_id}/steps" :get
             {:path-params   {"thread_id" thread_id "run_id" run_id }
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-run-steps list-run-steps-response-spec
  "Returns a list of run steps belonging to a run."
  ([thread_id string?, run_id string?, ] (list-run-steps thread_id run_id nil))
  ([thread_id string?, run_id string?, optional-params any?]
   (let [res (:data (list-run-steps-with-http-info thread_id run_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-run-steps-response-spec res st/string-transformer)
        res))))


(defn-spec list-runs-with-http-info any?
  "Returns a list of runs belonging to a thread."
  ([thread_id string?, ] (list-runs-with-http-info thread_id nil))
  ([thread_id string?, {:keys [limit order after before]} (s/map-of keyword? any?)]
   (check-required-params thread_id)
   (call-api "/threads/{thread_id}/runs" :get
             {:path-params   {"thread_id" thread_id }
              :header-params {}
              :query-params  {"limit" limit "order" order "after" after "before" before }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-runs list-runs-response-spec
  "Returns a list of runs belonging to a thread."
  ([thread_id string?, ] (list-runs thread_id nil))
  ([thread_id string?, optional-params any?]
   (let [res (:data (list-runs-with-http-info thread_id optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-runs-response-spec res st/string-transformer)
        res))))


(defn-spec modify-assistant-with-http-info any?
  "Modifies an assistant."
  [assistant_id string?, modify-assistant-request modify-assistant-request]
  (check-required-params assistant_id modify-assistant-request)
  (call-api "/assistants/{assistant_id}" :post
            {:path-params   {"assistant_id" assistant_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    modify-assistant-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec modify-assistant assistant-object-spec
  "Modifies an assistant."
  [assistant_id string?, modify-assistant-request modify-assistant-request]
  (let [res (:data (modify-assistant-with-http-info assistant_id modify-assistant-request))]
    (if (:decode-models *api-context*)
       (st/decode assistant-object-spec res st/string-transformer)
       res)))


(defn-spec modify-message-with-http-info any?
  "Modifies a message."
  [thread_id string?, message_id string?, modify-message-request modify-message-request]
  (check-required-params thread_id message_id modify-message-request)
  (call-api "/threads/{thread_id}/messages/{message_id}" :post
            {:path-params   {"thread_id" thread_id "message_id" message_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    modify-message-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec modify-message message-object-spec
  "Modifies a message."
  [thread_id string?, message_id string?, modify-message-request modify-message-request]
  (let [res (:data (modify-message-with-http-info thread_id message_id modify-message-request))]
    (if (:decode-models *api-context*)
       (st/decode message-object-spec res st/string-transformer)
       res)))


(defn-spec modify-run-with-http-info any?
  "Modifies a run."
  [thread_id string?, run_id string?, modify-run-request modify-run-request]
  (check-required-params thread_id run_id modify-run-request)
  (call-api "/threads/{thread_id}/runs/{run_id}" :post
            {:path-params   {"thread_id" thread_id "run_id" run_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    modify-run-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec modify-run run-object-spec
  "Modifies a run."
  [thread_id string?, run_id string?, modify-run-request modify-run-request]
  (let [res (:data (modify-run-with-http-info thread_id run_id modify-run-request))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


(defn-spec modify-thread-with-http-info any?
  "Modifies a thread."
  [thread_id string?, modify-thread-request modify-thread-request]
  (check-required-params thread_id modify-thread-request)
  (call-api "/threads/{thread_id}" :post
            {:path-params   {"thread_id" thread_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    modify-thread-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec modify-thread thread-object-spec
  "Modifies a thread."
  [thread_id string?, modify-thread-request modify-thread-request]
  (let [res (:data (modify-thread-with-http-info thread_id modify-thread-request))]
    (if (:decode-models *api-context*)
       (st/decode thread-object-spec res st/string-transformer)
       res)))


(defn-spec submit-tool-ouputs-to-run-with-http-info any?
  "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request."
  [thread_id string?, run_id string?, submit-tool-outputs-run-request submit-tool-outputs-run-request]
  (check-required-params thread_id run_id submit-tool-outputs-run-request)
  (call-api "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs" :post
            {:path-params   {"thread_id" thread_id "run_id" run_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    submit-tool-outputs-run-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec submit-tool-ouputs-to-run run-object-spec
  "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request."
  [thread_id string?, run_id string?, submit-tool-outputs-run-request submit-tool-outputs-run-request]
  (let [res (:data (submit-tool-ouputs-to-run-with-http-info thread_id run_id submit-tool-outputs-run-request))]
    (if (:decode-models *api-context*)
       (st/decode run-object-spec res st/string-transformer)
       res)))


