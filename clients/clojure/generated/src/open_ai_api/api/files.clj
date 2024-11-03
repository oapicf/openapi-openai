(ns open-ai-api.api.files
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


(defn-spec create-file-with-http-info any?
  "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.

Please [contact us](https://help.openai.com/) if you need to increase these storage limits."
  [^File file any?, purpose string?]
  (check-required-params file purpose)
  (call-api "/files" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"file" file "purpose" purpose }
             :content-types ["multipart/form-data"]
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec create-file open-ai-file-spec
  "Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.

Please [contact us](https://help.openai.com/) if you need to increase these storage limits."
  [^File file any?, purpose string?]
  (let [res (:data (create-file-with-http-info file purpose))]
    (if (:decode-models *api-context*)
       (st/decode open-ai-file-spec res st/string-transformer)
       res)))


(defn-spec delete-file-with-http-info any?
  "Delete a file."
  [file_id string?]
  (check-required-params file_id)
  (call-api "/files/{file_id}" :delete
            {:path-params   {"file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec delete-file delete-file-response-spec
  "Delete a file."
  [file_id string?]
  (let [res (:data (delete-file-with-http-info file_id))]
    (if (:decode-models *api-context*)
       (st/decode delete-file-response-spec res st/string-transformer)
       res)))


(defn-spec download-file-with-http-info any?
  "Returns the contents of the specified file."
  [file_id string?]
  (check-required-params file_id)
  (call-api "/files/{file_id}/content" :get
            {:path-params   {"file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec download-file string?
  "Returns the contents of the specified file."
  [file_id string?]
  (let [res (:data (download-file-with-http-info file_id))]
    (if (:decode-models *api-context*)
       (st/decode string? res st/string-transformer)
       res)))


(defn-spec list-files-with-http-info any?
  "Returns a list of files that belong to the user's organization."
  ([] (list-files-with-http-info nil))
  ([{:keys [purpose]} (s/map-of keyword? any?)]
   (call-api "/files" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"purpose" purpose }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["ApiKeyAuth"]})))

(defn-spec list-files list-files-response-spec
  "Returns a list of files that belong to the user's organization."
  ([] (list-files nil))
  ([optional-params any?]
   (let [res (:data (list-files-with-http-info optional-params))]
     (if (:decode-models *api-context*)
        (st/decode list-files-response-spec res st/string-transformer)
        res))))


(defn-spec retrieve-file-with-http-info any?
  "Returns information about a specific file."
  [file_id string?]
  (check-required-params file_id)
  (call-api "/files/{file_id}" :get
            {:path-params   {"file_id" file_id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["ApiKeyAuth"]}))

(defn-spec retrieve-file open-ai-file-spec
  "Returns information about a specific file."
  [file_id string?]
  (let [res (:data (retrieve-file-with-http-info file_id))]
    (if (:decode-models *api-context*)
       (st/decode open-ai-file-spec res st/string-transformer)
       res)))


