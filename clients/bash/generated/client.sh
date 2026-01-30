#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Generator version: 7.18.0
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for OpenAI API.
#
# LICENSE:
# https://github.com/openai/openai-openapi/blob/master/LICENSE
#
# CONTACT:
# blah+oapicf@cliffano.com
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statements
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodetection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["cancelRun:::thread_id"]=1
operation_parameters_minimum_occurrences["cancelRun:::run_id"]=1
operation_parameters_minimum_occurrences["createAssistant:::CreateAssistantRequest"]=1
operation_parameters_minimum_occurrences["createMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["createMessage:::CreateMessageRequest"]=1
operation_parameters_minimum_occurrences["createRun:::thread_id"]=1
operation_parameters_minimum_occurrences["createRun:::CreateRunRequest"]=1
operation_parameters_minimum_occurrences["createRun:::include[]"]=0
operation_parameters_minimum_occurrences["createThread:::CreateThreadRequest"]=0
operation_parameters_minimum_occurrences["createThreadAndRun:::CreateThreadAndRunRequest"]=1
operation_parameters_minimum_occurrences["deleteAssistant:::assistant_id"]=1
operation_parameters_minimum_occurrences["deleteMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["deleteMessage:::message_id"]=1
operation_parameters_minimum_occurrences["deleteThread:::thread_id"]=1
operation_parameters_minimum_occurrences["getAssistant:::assistant_id"]=1
operation_parameters_minimum_occurrences["getMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["getMessage:::message_id"]=1
operation_parameters_minimum_occurrences["getRun:::thread_id"]=1
operation_parameters_minimum_occurrences["getRun:::run_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::thread_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::run_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::step_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::include[]"]=0
operation_parameters_minimum_occurrences["getThread:::thread_id"]=1
operation_parameters_minimum_occurrences["listAssistants:::limit"]=0
operation_parameters_minimum_occurrences["listAssistants:::order"]=0
operation_parameters_minimum_occurrences["listAssistants:::after"]=0
operation_parameters_minimum_occurrences["listAssistants:::before"]=0
operation_parameters_minimum_occurrences["listMessages:::thread_id"]=1
operation_parameters_minimum_occurrences["listMessages:::limit"]=0
operation_parameters_minimum_occurrences["listMessages:::order"]=0
operation_parameters_minimum_occurrences["listMessages:::after"]=0
operation_parameters_minimum_occurrences["listMessages:::before"]=0
operation_parameters_minimum_occurrences["listMessages:::run_id"]=0
operation_parameters_minimum_occurrences["listRunSteps:::thread_id"]=1
operation_parameters_minimum_occurrences["listRunSteps:::run_id"]=1
operation_parameters_minimum_occurrences["listRunSteps:::limit"]=0
operation_parameters_minimum_occurrences["listRunSteps:::order"]=0
operation_parameters_minimum_occurrences["listRunSteps:::after"]=0
operation_parameters_minimum_occurrences["listRunSteps:::before"]=0
operation_parameters_minimum_occurrences["listRunSteps:::include[]"]=0
operation_parameters_minimum_occurrences["listRuns:::thread_id"]=1
operation_parameters_minimum_occurrences["listRuns:::limit"]=0
operation_parameters_minimum_occurrences["listRuns:::order"]=0
operation_parameters_minimum_occurrences["listRuns:::after"]=0
operation_parameters_minimum_occurrences["listRuns:::before"]=0
operation_parameters_minimum_occurrences["modifyAssistant:::assistant_id"]=1
operation_parameters_minimum_occurrences["modifyAssistant:::ModifyAssistantRequest"]=1
operation_parameters_minimum_occurrences["modifyMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["modifyMessage:::message_id"]=1
operation_parameters_minimum_occurrences["modifyMessage:::ModifyMessageRequest"]=1
operation_parameters_minimum_occurrences["modifyRun:::thread_id"]=1
operation_parameters_minimum_occurrences["modifyRun:::run_id"]=1
operation_parameters_minimum_occurrences["modifyRun:::ModifyRunRequest"]=1
operation_parameters_minimum_occurrences["modifyThread:::thread_id"]=1
operation_parameters_minimum_occurrences["modifyThread:::ModifyThreadRequest"]=1
operation_parameters_minimum_occurrences["submitToolOuputsToRun:::thread_id"]=1
operation_parameters_minimum_occurrences["submitToolOuputsToRun:::run_id"]=1
operation_parameters_minimum_occurrences["submitToolOuputsToRun:::SubmitToolOutputsRunRequest"]=1
operation_parameters_minimum_occurrences["createSpeech:::CreateSpeechRequest"]=1
operation_parameters_minimum_occurrences["createTranscription:::file"]=1
operation_parameters_minimum_occurrences["createTranscription:::model"]=1
operation_parameters_minimum_occurrences["createTranscription:::language"]=0
operation_parameters_minimum_occurrences["createTranscription:::prompt"]=0
operation_parameters_minimum_occurrences["createTranscription:::response_format"]=0
operation_parameters_minimum_occurrences["createTranscription:::temperature"]=0
operation_parameters_minimum_occurrences["createTranscription:::timestamp_granularities[]"]=0
operation_parameters_minimum_occurrences["createTranslation:::file"]=1
operation_parameters_minimum_occurrences["createTranslation:::model"]=1
operation_parameters_minimum_occurrences["createTranslation:::prompt"]=0
operation_parameters_minimum_occurrences["createTranslation:::response_format"]=0
operation_parameters_minimum_occurrences["createTranslation:::temperature"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::effective_at"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::project_ids[]"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::event_types[]"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::actor_ids[]"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::actor_emails[]"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::resource_ids[]"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::limit"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::after"]=0
operation_parameters_minimum_occurrences["listAuditLogs:::before"]=0
operation_parameters_minimum_occurrences["cancelBatch:::batch_id"]=1
operation_parameters_minimum_occurrences["createBatch:::CreateBatchRequest"]=1
operation_parameters_minimum_occurrences["listBatches:::after"]=0
operation_parameters_minimum_occurrences["listBatches:::limit"]=0
operation_parameters_minimum_occurrences["retrieveBatch:::batch_id"]=1
operation_parameters_minimum_occurrences["createChatCompletion:::CreateChatCompletionRequest"]=1
operation_parameters_minimum_occurrences["createCompletion:::CreateCompletionRequest"]=1
operation_parameters_minimum_occurrences["adminApiKeysCreate:::AdminApiKeysCreateRequest"]=1
operation_parameters_minimum_occurrences["adminApiKeysDelete:::key_id"]=1
operation_parameters_minimum_occurrences["adminApiKeysGet:::key_id"]=1
operation_parameters_minimum_occurrences["adminApiKeysList:::after"]=0
operation_parameters_minimum_occurrences["adminApiKeysList:::order"]=0
operation_parameters_minimum_occurrences["adminApiKeysList:::limit"]=0
operation_parameters_minimum_occurrences["createEmbedding:::CreateEmbeddingRequest"]=1
operation_parameters_minimum_occurrences["createFile:::file"]=1
operation_parameters_minimum_occurrences["createFile:::purpose"]=1
operation_parameters_minimum_occurrences["deleteFile:::file_id"]=1
operation_parameters_minimum_occurrences["downloadFile:::file_id"]=1
operation_parameters_minimum_occurrences["listFiles:::purpose"]=0
operation_parameters_minimum_occurrences["listFiles:::limit"]=0
operation_parameters_minimum_occurrences["listFiles:::order"]=0
operation_parameters_minimum_occurrences["listFiles:::after"]=0
operation_parameters_minimum_occurrences["retrieveFile:::file_id"]=1
operation_parameters_minimum_occurrences["cancelFineTuningJob:::fine_tuning_job_id"]=1
operation_parameters_minimum_occurrences["createFineTuningJob:::CreateFineTuningJobRequest"]=1
operation_parameters_minimum_occurrences["listFineTuningEvents:::fine_tuning_job_id"]=1
operation_parameters_minimum_occurrences["listFineTuningEvents:::after"]=0
operation_parameters_minimum_occurrences["listFineTuningEvents:::limit"]=0
operation_parameters_minimum_occurrences["listFineTuningJobCheckpoints:::fine_tuning_job_id"]=1
operation_parameters_minimum_occurrences["listFineTuningJobCheckpoints:::after"]=0
operation_parameters_minimum_occurrences["listFineTuningJobCheckpoints:::limit"]=0
operation_parameters_minimum_occurrences["listPaginatedFineTuningJobs:::after"]=0
operation_parameters_minimum_occurrences["listPaginatedFineTuningJobs:::limit"]=0
operation_parameters_minimum_occurrences["retrieveFineTuningJob:::fine_tuning_job_id"]=1
operation_parameters_minimum_occurrences["createImage:::CreateImageRequest"]=1
operation_parameters_minimum_occurrences["createImageEdit:::image"]=1
operation_parameters_minimum_occurrences["createImageEdit:::prompt"]=1
operation_parameters_minimum_occurrences["createImageEdit:::mask"]=0
operation_parameters_minimum_occurrences["createImageEdit:::model"]=0
operation_parameters_minimum_occurrences["createImageEdit:::n"]=0
operation_parameters_minimum_occurrences["createImageEdit:::size"]=0
operation_parameters_minimum_occurrences["createImageEdit:::response_format"]=0
operation_parameters_minimum_occurrences["createImageEdit:::user"]=0
operation_parameters_minimum_occurrences["createImageVariation:::image"]=1
operation_parameters_minimum_occurrences["createImageVariation:::model"]=0
operation_parameters_minimum_occurrences["createImageVariation:::n"]=0
operation_parameters_minimum_occurrences["createImageVariation:::response_format"]=0
operation_parameters_minimum_occurrences["createImageVariation:::size"]=0
operation_parameters_minimum_occurrences["createImageVariation:::user"]=0
operation_parameters_minimum_occurrences["deleteInvite:::invite_id"]=1
operation_parameters_minimum_occurrences["inviteUser:::InviteRequest"]=1
operation_parameters_minimum_occurrences["listInvites:::limit"]=0
operation_parameters_minimum_occurrences["listInvites:::after"]=0
operation_parameters_minimum_occurrences["retrieveInvite:::invite_id"]=1
operation_parameters_minimum_occurrences["deleteModel:::model"]=1
operation_parameters_minimum_occurrences["retrieveModel:::model"]=1
operation_parameters_minimum_occurrences["createModeration:::CreateModerationRequest"]=1
operation_parameters_minimum_occurrences["archiveProject:::project_id"]=1
operation_parameters_minimum_occurrences["createProject:::ProjectCreateRequest"]=1
operation_parameters_minimum_occurrences["createProjectServiceAccount:::project_id"]=1
operation_parameters_minimum_occurrences["createProjectServiceAccount:::ProjectServiceAccountCreateRequest"]=1
operation_parameters_minimum_occurrences["createProjectUser:::project_id"]=1
operation_parameters_minimum_occurrences["createProjectUser:::ProjectUserCreateRequest"]=1
operation_parameters_minimum_occurrences["deleteProjectApiKey:::project_id"]=1
operation_parameters_minimum_occurrences["deleteProjectApiKey:::key_id"]=1
operation_parameters_minimum_occurrences["deleteProjectServiceAccount:::project_id"]=1
operation_parameters_minimum_occurrences["deleteProjectServiceAccount:::service_account_id"]=1
operation_parameters_minimum_occurrences["deleteProjectUser:::project_id"]=1
operation_parameters_minimum_occurrences["deleteProjectUser:::user_id"]=1
operation_parameters_minimum_occurrences["listProjectApiKeys:::project_id"]=1
operation_parameters_minimum_occurrences["listProjectApiKeys:::limit"]=0
operation_parameters_minimum_occurrences["listProjectApiKeys:::after"]=0
operation_parameters_minimum_occurrences["listProjectRateLimits:::project_id"]=1
operation_parameters_minimum_occurrences["listProjectRateLimits:::limit"]=0
operation_parameters_minimum_occurrences["listProjectRateLimits:::after"]=0
operation_parameters_minimum_occurrences["listProjectRateLimits:::before"]=0
operation_parameters_minimum_occurrences["listProjectServiceAccounts:::project_id"]=1
operation_parameters_minimum_occurrences["listProjectServiceAccounts:::limit"]=0
operation_parameters_minimum_occurrences["listProjectServiceAccounts:::after"]=0
operation_parameters_minimum_occurrences["listProjectUsers:::project_id"]=1
operation_parameters_minimum_occurrences["listProjectUsers:::limit"]=0
operation_parameters_minimum_occurrences["listProjectUsers:::after"]=0
operation_parameters_minimum_occurrences["listProjects:::limit"]=0
operation_parameters_minimum_occurrences["listProjects:::after"]=0
operation_parameters_minimum_occurrences["listProjects:::include_archived"]=0
operation_parameters_minimum_occurrences["modifyProject:::project_id"]=1
operation_parameters_minimum_occurrences["modifyProject:::ProjectUpdateRequest"]=1
operation_parameters_minimum_occurrences["modifyProjectUser:::project_id"]=1
operation_parameters_minimum_occurrences["modifyProjectUser:::user_id"]=1
operation_parameters_minimum_occurrences["modifyProjectUser:::ProjectUserUpdateRequest"]=1
operation_parameters_minimum_occurrences["retrieveProject:::project_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectApiKey:::project_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectApiKey:::key_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectServiceAccount:::project_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectServiceAccount:::service_account_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectUser:::project_id"]=1
operation_parameters_minimum_occurrences["retrieveProjectUser:::user_id"]=1
operation_parameters_minimum_occurrences["updateProjectRateLimits:::project_id"]=1
operation_parameters_minimum_occurrences["updateProjectRateLimits:::rate_limit_id"]=1
operation_parameters_minimum_occurrences["updateProjectRateLimits:::ProjectRateLimitUpdateRequest"]=1
operation_parameters_minimum_occurrences["createRealtimeSession:::RealtimeSessionCreateRequest"]=1
operation_parameters_minimum_occurrences["addUploadPart:::upload_id"]=1
operation_parameters_minimum_occurrences["addUploadPart:::data"]=1
operation_parameters_minimum_occurrences["cancelUpload:::upload_id"]=1
operation_parameters_minimum_occurrences["completeUpload:::upload_id"]=1
operation_parameters_minimum_occurrences["completeUpload:::CompleteUploadRequest"]=1
operation_parameters_minimum_occurrences["createUpload:::CreateUploadRequest"]=1
operation_parameters_minimum_occurrences["usageAudioSpeeches:::start_time"]=1
operation_parameters_minimum_occurrences["usageAudioSpeeches:::end_time"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::project_ids"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::user_ids"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::models"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::group_by"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::limit"]=0
operation_parameters_minimum_occurrences["usageAudioSpeeches:::page"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::start_time"]=1
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::end_time"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::project_ids"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::user_ids"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::models"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::group_by"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::limit"]=0
operation_parameters_minimum_occurrences["usageAudioTranscriptions:::page"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::start_time"]=1
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::end_time"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::project_ids"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::group_by"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::limit"]=0
operation_parameters_minimum_occurrences["usageCodeInterpreterSessions:::page"]=0
operation_parameters_minimum_occurrences["usageCompletions:::start_time"]=1
operation_parameters_minimum_occurrences["usageCompletions:::end_time"]=0
operation_parameters_minimum_occurrences["usageCompletions:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageCompletions:::project_ids"]=0
operation_parameters_minimum_occurrences["usageCompletions:::user_ids"]=0
operation_parameters_minimum_occurrences["usageCompletions:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageCompletions:::models"]=0
operation_parameters_minimum_occurrences["usageCompletions:::batch"]=0
operation_parameters_minimum_occurrences["usageCompletions:::group_by"]=0
operation_parameters_minimum_occurrences["usageCompletions:::limit"]=0
operation_parameters_minimum_occurrences["usageCompletions:::page"]=0
operation_parameters_minimum_occurrences["usageCosts:::start_time"]=1
operation_parameters_minimum_occurrences["usageCosts:::end_time"]=0
operation_parameters_minimum_occurrences["usageCosts:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageCosts:::project_ids"]=0
operation_parameters_minimum_occurrences["usageCosts:::group_by"]=0
operation_parameters_minimum_occurrences["usageCosts:::limit"]=0
operation_parameters_minimum_occurrences["usageCosts:::page"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::start_time"]=1
operation_parameters_minimum_occurrences["usageEmbeddings:::end_time"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::project_ids"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::user_ids"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::models"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::group_by"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::limit"]=0
operation_parameters_minimum_occurrences["usageEmbeddings:::page"]=0
operation_parameters_minimum_occurrences["usageImages:::start_time"]=1
operation_parameters_minimum_occurrences["usageImages:::end_time"]=0
operation_parameters_minimum_occurrences["usageImages:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageImages:::sources"]=0
operation_parameters_minimum_occurrences["usageImages:::sizes"]=0
operation_parameters_minimum_occurrences["usageImages:::project_ids"]=0
operation_parameters_minimum_occurrences["usageImages:::user_ids"]=0
operation_parameters_minimum_occurrences["usageImages:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageImages:::models"]=0
operation_parameters_minimum_occurrences["usageImages:::group_by"]=0
operation_parameters_minimum_occurrences["usageImages:::limit"]=0
operation_parameters_minimum_occurrences["usageImages:::page"]=0
operation_parameters_minimum_occurrences["usageModerations:::start_time"]=1
operation_parameters_minimum_occurrences["usageModerations:::end_time"]=0
operation_parameters_minimum_occurrences["usageModerations:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageModerations:::project_ids"]=0
operation_parameters_minimum_occurrences["usageModerations:::user_ids"]=0
operation_parameters_minimum_occurrences["usageModerations:::api_key_ids"]=0
operation_parameters_minimum_occurrences["usageModerations:::models"]=0
operation_parameters_minimum_occurrences["usageModerations:::group_by"]=0
operation_parameters_minimum_occurrences["usageModerations:::limit"]=0
operation_parameters_minimum_occurrences["usageModerations:::page"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::start_time"]=1
operation_parameters_minimum_occurrences["usageVectorStores:::end_time"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::bucket_width"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::project_ids"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::group_by"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::limit"]=0
operation_parameters_minimum_occurrences["usageVectorStores:::page"]=0
operation_parameters_minimum_occurrences["deleteUser:::user_id"]=1
operation_parameters_minimum_occurrences["listUsers:::limit"]=0
operation_parameters_minimum_occurrences["listUsers:::after"]=0
operation_parameters_minimum_occurrences["modifyUser:::user_id"]=1
operation_parameters_minimum_occurrences["modifyUser:::UserRoleUpdateRequest"]=1
operation_parameters_minimum_occurrences["retrieveUser:::user_id"]=1
operation_parameters_minimum_occurrences["cancelVectorStoreFileBatch:::vector_store_id"]=1
operation_parameters_minimum_occurrences["cancelVectorStoreFileBatch:::batch_id"]=1
operation_parameters_minimum_occurrences["createVectorStore:::CreateVectorStoreRequest"]=1
operation_parameters_minimum_occurrences["createVectorStoreFile:::vector_store_id"]=1
operation_parameters_minimum_occurrences["createVectorStoreFile:::CreateVectorStoreFileRequest"]=1
operation_parameters_minimum_occurrences["createVectorStoreFileBatch:::vector_store_id"]=1
operation_parameters_minimum_occurrences["createVectorStoreFileBatch:::CreateVectorStoreFileBatchRequest"]=1
operation_parameters_minimum_occurrences["deleteVectorStore:::vector_store_id"]=1
operation_parameters_minimum_occurrences["deleteVectorStoreFile:::vector_store_id"]=1
operation_parameters_minimum_occurrences["deleteVectorStoreFile:::file_id"]=1
operation_parameters_minimum_occurrences["getVectorStore:::vector_store_id"]=1
operation_parameters_minimum_occurrences["getVectorStoreFile:::vector_store_id"]=1
operation_parameters_minimum_occurrences["getVectorStoreFile:::file_id"]=1
operation_parameters_minimum_occurrences["getVectorStoreFileBatch:::vector_store_id"]=1
operation_parameters_minimum_occurrences["getVectorStoreFileBatch:::batch_id"]=1
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::vector_store_id"]=1
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::batch_id"]=1
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::limit"]=0
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::order"]=0
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::after"]=0
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::before"]=0
operation_parameters_minimum_occurrences["listFilesInVectorStoreBatch:::filter"]=0
operation_parameters_minimum_occurrences["listVectorStoreFiles:::vector_store_id"]=1
operation_parameters_minimum_occurrences["listVectorStoreFiles:::limit"]=0
operation_parameters_minimum_occurrences["listVectorStoreFiles:::order"]=0
operation_parameters_minimum_occurrences["listVectorStoreFiles:::after"]=0
operation_parameters_minimum_occurrences["listVectorStoreFiles:::before"]=0
operation_parameters_minimum_occurrences["listVectorStoreFiles:::filter"]=0
operation_parameters_minimum_occurrences["listVectorStores:::limit"]=0
operation_parameters_minimum_occurrences["listVectorStores:::order"]=0
operation_parameters_minimum_occurrences["listVectorStores:::after"]=0
operation_parameters_minimum_occurrences["listVectorStores:::before"]=0
operation_parameters_minimum_occurrences["modifyVectorStore:::vector_store_id"]=1
operation_parameters_minimum_occurrences["modifyVectorStore:::UpdateVectorStoreRequest"]=1

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["cancelRun:::thread_id"]=0
operation_parameters_maximum_occurrences["cancelRun:::run_id"]=0
operation_parameters_maximum_occurrences["createAssistant:::CreateAssistantRequest"]=0
operation_parameters_maximum_occurrences["createMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["createMessage:::CreateMessageRequest"]=0
operation_parameters_maximum_occurrences["createRun:::thread_id"]=0
operation_parameters_maximum_occurrences["createRun:::CreateRunRequest"]=0
operation_parameters_maximum_occurrences["createRun:::include[]"]=0
operation_parameters_maximum_occurrences["createThread:::CreateThreadRequest"]=0
operation_parameters_maximum_occurrences["createThreadAndRun:::CreateThreadAndRunRequest"]=0
operation_parameters_maximum_occurrences["deleteAssistant:::assistant_id"]=0
operation_parameters_maximum_occurrences["deleteMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["deleteMessage:::message_id"]=0
operation_parameters_maximum_occurrences["deleteThread:::thread_id"]=0
operation_parameters_maximum_occurrences["getAssistant:::assistant_id"]=0
operation_parameters_maximum_occurrences["getMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["getMessage:::message_id"]=0
operation_parameters_maximum_occurrences["getRun:::thread_id"]=0
operation_parameters_maximum_occurrences["getRun:::run_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::thread_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::run_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::step_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::include[]"]=0
operation_parameters_maximum_occurrences["getThread:::thread_id"]=0
operation_parameters_maximum_occurrences["listAssistants:::limit"]=0
operation_parameters_maximum_occurrences["listAssistants:::order"]=0
operation_parameters_maximum_occurrences["listAssistants:::after"]=0
operation_parameters_maximum_occurrences["listAssistants:::before"]=0
operation_parameters_maximum_occurrences["listMessages:::thread_id"]=0
operation_parameters_maximum_occurrences["listMessages:::limit"]=0
operation_parameters_maximum_occurrences["listMessages:::order"]=0
operation_parameters_maximum_occurrences["listMessages:::after"]=0
operation_parameters_maximum_occurrences["listMessages:::before"]=0
operation_parameters_maximum_occurrences["listMessages:::run_id"]=0
operation_parameters_maximum_occurrences["listRunSteps:::thread_id"]=0
operation_parameters_maximum_occurrences["listRunSteps:::run_id"]=0
operation_parameters_maximum_occurrences["listRunSteps:::limit"]=0
operation_parameters_maximum_occurrences["listRunSteps:::order"]=0
operation_parameters_maximum_occurrences["listRunSteps:::after"]=0
operation_parameters_maximum_occurrences["listRunSteps:::before"]=0
operation_parameters_maximum_occurrences["listRunSteps:::include[]"]=0
operation_parameters_maximum_occurrences["listRuns:::thread_id"]=0
operation_parameters_maximum_occurrences["listRuns:::limit"]=0
operation_parameters_maximum_occurrences["listRuns:::order"]=0
operation_parameters_maximum_occurrences["listRuns:::after"]=0
operation_parameters_maximum_occurrences["listRuns:::before"]=0
operation_parameters_maximum_occurrences["modifyAssistant:::assistant_id"]=0
operation_parameters_maximum_occurrences["modifyAssistant:::ModifyAssistantRequest"]=0
operation_parameters_maximum_occurrences["modifyMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["modifyMessage:::message_id"]=0
operation_parameters_maximum_occurrences["modifyMessage:::ModifyMessageRequest"]=0
operation_parameters_maximum_occurrences["modifyRun:::thread_id"]=0
operation_parameters_maximum_occurrences["modifyRun:::run_id"]=0
operation_parameters_maximum_occurrences["modifyRun:::ModifyRunRequest"]=0
operation_parameters_maximum_occurrences["modifyThread:::thread_id"]=0
operation_parameters_maximum_occurrences["modifyThread:::ModifyThreadRequest"]=0
operation_parameters_maximum_occurrences["submitToolOuputsToRun:::thread_id"]=0
operation_parameters_maximum_occurrences["submitToolOuputsToRun:::run_id"]=0
operation_parameters_maximum_occurrences["submitToolOuputsToRun:::SubmitToolOutputsRunRequest"]=0
operation_parameters_maximum_occurrences["createSpeech:::CreateSpeechRequest"]=0
operation_parameters_maximum_occurrences["createTranscription:::file"]=0
operation_parameters_maximum_occurrences["createTranscription:::model"]=0
operation_parameters_maximum_occurrences["createTranscription:::language"]=0
operation_parameters_maximum_occurrences["createTranscription:::prompt"]=0
operation_parameters_maximum_occurrences["createTranscription:::response_format"]=0
operation_parameters_maximum_occurrences["createTranscription:::temperature"]=0
operation_parameters_maximum_occurrences["createTranscription:::timestamp_granularities[]"]=0
operation_parameters_maximum_occurrences["createTranslation:::file"]=0
operation_parameters_maximum_occurrences["createTranslation:::model"]=0
operation_parameters_maximum_occurrences["createTranslation:::prompt"]=0
operation_parameters_maximum_occurrences["createTranslation:::response_format"]=0
operation_parameters_maximum_occurrences["createTranslation:::temperature"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::effective_at"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::project_ids[]"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::event_types[]"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::actor_ids[]"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::actor_emails[]"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::resource_ids[]"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::limit"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::after"]=0
operation_parameters_maximum_occurrences["listAuditLogs:::before"]=0
operation_parameters_maximum_occurrences["cancelBatch:::batch_id"]=0
operation_parameters_maximum_occurrences["createBatch:::CreateBatchRequest"]=0
operation_parameters_maximum_occurrences["listBatches:::after"]=0
operation_parameters_maximum_occurrences["listBatches:::limit"]=0
operation_parameters_maximum_occurrences["retrieveBatch:::batch_id"]=0
operation_parameters_maximum_occurrences["createChatCompletion:::CreateChatCompletionRequest"]=0
operation_parameters_maximum_occurrences["createCompletion:::CreateCompletionRequest"]=0
operation_parameters_maximum_occurrences["adminApiKeysCreate:::AdminApiKeysCreateRequest"]=0
operation_parameters_maximum_occurrences["adminApiKeysDelete:::key_id"]=0
operation_parameters_maximum_occurrences["adminApiKeysGet:::key_id"]=0
operation_parameters_maximum_occurrences["adminApiKeysList:::after"]=0
operation_parameters_maximum_occurrences["adminApiKeysList:::order"]=0
operation_parameters_maximum_occurrences["adminApiKeysList:::limit"]=0
operation_parameters_maximum_occurrences["createEmbedding:::CreateEmbeddingRequest"]=0
operation_parameters_maximum_occurrences["createFile:::file"]=0
operation_parameters_maximum_occurrences["createFile:::purpose"]=0
operation_parameters_maximum_occurrences["deleteFile:::file_id"]=0
operation_parameters_maximum_occurrences["downloadFile:::file_id"]=0
operation_parameters_maximum_occurrences["listFiles:::purpose"]=0
operation_parameters_maximum_occurrences["listFiles:::limit"]=0
operation_parameters_maximum_occurrences["listFiles:::order"]=0
operation_parameters_maximum_occurrences["listFiles:::after"]=0
operation_parameters_maximum_occurrences["retrieveFile:::file_id"]=0
operation_parameters_maximum_occurrences["cancelFineTuningJob:::fine_tuning_job_id"]=0
operation_parameters_maximum_occurrences["createFineTuningJob:::CreateFineTuningJobRequest"]=0
operation_parameters_maximum_occurrences["listFineTuningEvents:::fine_tuning_job_id"]=0
operation_parameters_maximum_occurrences["listFineTuningEvents:::after"]=0
operation_parameters_maximum_occurrences["listFineTuningEvents:::limit"]=0
operation_parameters_maximum_occurrences["listFineTuningJobCheckpoints:::fine_tuning_job_id"]=0
operation_parameters_maximum_occurrences["listFineTuningJobCheckpoints:::after"]=0
operation_parameters_maximum_occurrences["listFineTuningJobCheckpoints:::limit"]=0
operation_parameters_maximum_occurrences["listPaginatedFineTuningJobs:::after"]=0
operation_parameters_maximum_occurrences["listPaginatedFineTuningJobs:::limit"]=0
operation_parameters_maximum_occurrences["retrieveFineTuningJob:::fine_tuning_job_id"]=0
operation_parameters_maximum_occurrences["createImage:::CreateImageRequest"]=0
operation_parameters_maximum_occurrences["createImageEdit:::image"]=0
operation_parameters_maximum_occurrences["createImageEdit:::prompt"]=0
operation_parameters_maximum_occurrences["createImageEdit:::mask"]=0
operation_parameters_maximum_occurrences["createImageEdit:::model"]=0
operation_parameters_maximum_occurrences["createImageEdit:::n"]=0
operation_parameters_maximum_occurrences["createImageEdit:::size"]=0
operation_parameters_maximum_occurrences["createImageEdit:::response_format"]=0
operation_parameters_maximum_occurrences["createImageEdit:::user"]=0
operation_parameters_maximum_occurrences["createImageVariation:::image"]=0
operation_parameters_maximum_occurrences["createImageVariation:::model"]=0
operation_parameters_maximum_occurrences["createImageVariation:::n"]=0
operation_parameters_maximum_occurrences["createImageVariation:::response_format"]=0
operation_parameters_maximum_occurrences["createImageVariation:::size"]=0
operation_parameters_maximum_occurrences["createImageVariation:::user"]=0
operation_parameters_maximum_occurrences["deleteInvite:::invite_id"]=0
operation_parameters_maximum_occurrences["inviteUser:::InviteRequest"]=0
operation_parameters_maximum_occurrences["listInvites:::limit"]=0
operation_parameters_maximum_occurrences["listInvites:::after"]=0
operation_parameters_maximum_occurrences["retrieveInvite:::invite_id"]=0
operation_parameters_maximum_occurrences["deleteModel:::model"]=0
operation_parameters_maximum_occurrences["retrieveModel:::model"]=0
operation_parameters_maximum_occurrences["createModeration:::CreateModerationRequest"]=0
operation_parameters_maximum_occurrences["archiveProject:::project_id"]=0
operation_parameters_maximum_occurrences["createProject:::ProjectCreateRequest"]=0
operation_parameters_maximum_occurrences["createProjectServiceAccount:::project_id"]=0
operation_parameters_maximum_occurrences["createProjectServiceAccount:::ProjectServiceAccountCreateRequest"]=0
operation_parameters_maximum_occurrences["createProjectUser:::project_id"]=0
operation_parameters_maximum_occurrences["createProjectUser:::ProjectUserCreateRequest"]=0
operation_parameters_maximum_occurrences["deleteProjectApiKey:::project_id"]=0
operation_parameters_maximum_occurrences["deleteProjectApiKey:::key_id"]=0
operation_parameters_maximum_occurrences["deleteProjectServiceAccount:::project_id"]=0
operation_parameters_maximum_occurrences["deleteProjectServiceAccount:::service_account_id"]=0
operation_parameters_maximum_occurrences["deleteProjectUser:::project_id"]=0
operation_parameters_maximum_occurrences["deleteProjectUser:::user_id"]=0
operation_parameters_maximum_occurrences["listProjectApiKeys:::project_id"]=0
operation_parameters_maximum_occurrences["listProjectApiKeys:::limit"]=0
operation_parameters_maximum_occurrences["listProjectApiKeys:::after"]=0
operation_parameters_maximum_occurrences["listProjectRateLimits:::project_id"]=0
operation_parameters_maximum_occurrences["listProjectRateLimits:::limit"]=0
operation_parameters_maximum_occurrences["listProjectRateLimits:::after"]=0
operation_parameters_maximum_occurrences["listProjectRateLimits:::before"]=0
operation_parameters_maximum_occurrences["listProjectServiceAccounts:::project_id"]=0
operation_parameters_maximum_occurrences["listProjectServiceAccounts:::limit"]=0
operation_parameters_maximum_occurrences["listProjectServiceAccounts:::after"]=0
operation_parameters_maximum_occurrences["listProjectUsers:::project_id"]=0
operation_parameters_maximum_occurrences["listProjectUsers:::limit"]=0
operation_parameters_maximum_occurrences["listProjectUsers:::after"]=0
operation_parameters_maximum_occurrences["listProjects:::limit"]=0
operation_parameters_maximum_occurrences["listProjects:::after"]=0
operation_parameters_maximum_occurrences["listProjects:::include_archived"]=0
operation_parameters_maximum_occurrences["modifyProject:::project_id"]=0
operation_parameters_maximum_occurrences["modifyProject:::ProjectUpdateRequest"]=0
operation_parameters_maximum_occurrences["modifyProjectUser:::project_id"]=0
operation_parameters_maximum_occurrences["modifyProjectUser:::user_id"]=0
operation_parameters_maximum_occurrences["modifyProjectUser:::ProjectUserUpdateRequest"]=0
operation_parameters_maximum_occurrences["retrieveProject:::project_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectApiKey:::project_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectApiKey:::key_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectServiceAccount:::project_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectServiceAccount:::service_account_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectUser:::project_id"]=0
operation_parameters_maximum_occurrences["retrieveProjectUser:::user_id"]=0
operation_parameters_maximum_occurrences["updateProjectRateLimits:::project_id"]=0
operation_parameters_maximum_occurrences["updateProjectRateLimits:::rate_limit_id"]=0
operation_parameters_maximum_occurrences["updateProjectRateLimits:::ProjectRateLimitUpdateRequest"]=0
operation_parameters_maximum_occurrences["createRealtimeSession:::RealtimeSessionCreateRequest"]=0
operation_parameters_maximum_occurrences["addUploadPart:::upload_id"]=0
operation_parameters_maximum_occurrences["addUploadPart:::data"]=0
operation_parameters_maximum_occurrences["cancelUpload:::upload_id"]=0
operation_parameters_maximum_occurrences["completeUpload:::upload_id"]=0
operation_parameters_maximum_occurrences["completeUpload:::CompleteUploadRequest"]=0
operation_parameters_maximum_occurrences["createUpload:::CreateUploadRequest"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::start_time"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::end_time"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::project_ids"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::user_ids"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::models"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::group_by"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::limit"]=0
operation_parameters_maximum_occurrences["usageAudioSpeeches:::page"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::start_time"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::end_time"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::project_ids"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::user_ids"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::models"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::group_by"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::limit"]=0
operation_parameters_maximum_occurrences["usageAudioTranscriptions:::page"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::start_time"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::end_time"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::project_ids"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::group_by"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::limit"]=0
operation_parameters_maximum_occurrences["usageCodeInterpreterSessions:::page"]=0
operation_parameters_maximum_occurrences["usageCompletions:::start_time"]=0
operation_parameters_maximum_occurrences["usageCompletions:::end_time"]=0
operation_parameters_maximum_occurrences["usageCompletions:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageCompletions:::project_ids"]=0
operation_parameters_maximum_occurrences["usageCompletions:::user_ids"]=0
operation_parameters_maximum_occurrences["usageCompletions:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageCompletions:::models"]=0
operation_parameters_maximum_occurrences["usageCompletions:::batch"]=0
operation_parameters_maximum_occurrences["usageCompletions:::group_by"]=0
operation_parameters_maximum_occurrences["usageCompletions:::limit"]=0
operation_parameters_maximum_occurrences["usageCompletions:::page"]=0
operation_parameters_maximum_occurrences["usageCosts:::start_time"]=0
operation_parameters_maximum_occurrences["usageCosts:::end_time"]=0
operation_parameters_maximum_occurrences["usageCosts:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageCosts:::project_ids"]=0
operation_parameters_maximum_occurrences["usageCosts:::group_by"]=0
operation_parameters_maximum_occurrences["usageCosts:::limit"]=0
operation_parameters_maximum_occurrences["usageCosts:::page"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::start_time"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::end_time"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::project_ids"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::user_ids"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::models"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::group_by"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::limit"]=0
operation_parameters_maximum_occurrences["usageEmbeddings:::page"]=0
operation_parameters_maximum_occurrences["usageImages:::start_time"]=0
operation_parameters_maximum_occurrences["usageImages:::end_time"]=0
operation_parameters_maximum_occurrences["usageImages:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageImages:::sources"]=0
operation_parameters_maximum_occurrences["usageImages:::sizes"]=0
operation_parameters_maximum_occurrences["usageImages:::project_ids"]=0
operation_parameters_maximum_occurrences["usageImages:::user_ids"]=0
operation_parameters_maximum_occurrences["usageImages:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageImages:::models"]=0
operation_parameters_maximum_occurrences["usageImages:::group_by"]=0
operation_parameters_maximum_occurrences["usageImages:::limit"]=0
operation_parameters_maximum_occurrences["usageImages:::page"]=0
operation_parameters_maximum_occurrences["usageModerations:::start_time"]=0
operation_parameters_maximum_occurrences["usageModerations:::end_time"]=0
operation_parameters_maximum_occurrences["usageModerations:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageModerations:::project_ids"]=0
operation_parameters_maximum_occurrences["usageModerations:::user_ids"]=0
operation_parameters_maximum_occurrences["usageModerations:::api_key_ids"]=0
operation_parameters_maximum_occurrences["usageModerations:::models"]=0
operation_parameters_maximum_occurrences["usageModerations:::group_by"]=0
operation_parameters_maximum_occurrences["usageModerations:::limit"]=0
operation_parameters_maximum_occurrences["usageModerations:::page"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::start_time"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::end_time"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::bucket_width"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::project_ids"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::group_by"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::limit"]=0
operation_parameters_maximum_occurrences["usageVectorStores:::page"]=0
operation_parameters_maximum_occurrences["deleteUser:::user_id"]=0
operation_parameters_maximum_occurrences["listUsers:::limit"]=0
operation_parameters_maximum_occurrences["listUsers:::after"]=0
operation_parameters_maximum_occurrences["modifyUser:::user_id"]=0
operation_parameters_maximum_occurrences["modifyUser:::UserRoleUpdateRequest"]=0
operation_parameters_maximum_occurrences["retrieveUser:::user_id"]=0
operation_parameters_maximum_occurrences["cancelVectorStoreFileBatch:::vector_store_id"]=0
operation_parameters_maximum_occurrences["cancelVectorStoreFileBatch:::batch_id"]=0
operation_parameters_maximum_occurrences["createVectorStore:::CreateVectorStoreRequest"]=0
operation_parameters_maximum_occurrences["createVectorStoreFile:::vector_store_id"]=0
operation_parameters_maximum_occurrences["createVectorStoreFile:::CreateVectorStoreFileRequest"]=0
operation_parameters_maximum_occurrences["createVectorStoreFileBatch:::vector_store_id"]=0
operation_parameters_maximum_occurrences["createVectorStoreFileBatch:::CreateVectorStoreFileBatchRequest"]=0
operation_parameters_maximum_occurrences["deleteVectorStore:::vector_store_id"]=0
operation_parameters_maximum_occurrences["deleteVectorStoreFile:::vector_store_id"]=0
operation_parameters_maximum_occurrences["deleteVectorStoreFile:::file_id"]=0
operation_parameters_maximum_occurrences["getVectorStore:::vector_store_id"]=0
operation_parameters_maximum_occurrences["getVectorStoreFile:::vector_store_id"]=0
operation_parameters_maximum_occurrences["getVectorStoreFile:::file_id"]=0
operation_parameters_maximum_occurrences["getVectorStoreFileBatch:::vector_store_id"]=0
operation_parameters_maximum_occurrences["getVectorStoreFileBatch:::batch_id"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::vector_store_id"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::batch_id"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::limit"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::order"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::after"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::before"]=0
operation_parameters_maximum_occurrences["listFilesInVectorStoreBatch:::filter"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::vector_store_id"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::limit"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::order"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::after"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::before"]=0
operation_parameters_maximum_occurrences["listVectorStoreFiles:::filter"]=0
operation_parameters_maximum_occurrences["listVectorStores:::limit"]=0
operation_parameters_maximum_occurrences["listVectorStores:::order"]=0
operation_parameters_maximum_occurrences["listVectorStores:::after"]=0
operation_parameters_maximum_occurrences["listVectorStores:::before"]=0
operation_parameters_maximum_occurrences["modifyVectorStore:::vector_store_id"]=0
operation_parameters_maximum_occurrences["modifyVectorStore:::UpdateVectorStoreRequest"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["cancelRun:::thread_id"]=""
operation_parameters_collection_type["cancelRun:::run_id"]=""
operation_parameters_collection_type["createAssistant:::CreateAssistantRequest"]=""
operation_parameters_collection_type["createMessage:::thread_id"]=""
operation_parameters_collection_type["createMessage:::CreateMessageRequest"]=""
operation_parameters_collection_type["createRun:::thread_id"]=""
operation_parameters_collection_type["createRun:::CreateRunRequest"]=""
operation_parameters_collection_type["createRun:::include[]"]="multi"
operation_parameters_collection_type["createThread:::CreateThreadRequest"]=""
operation_parameters_collection_type["createThreadAndRun:::CreateThreadAndRunRequest"]=""
operation_parameters_collection_type["deleteAssistant:::assistant_id"]=""
operation_parameters_collection_type["deleteMessage:::thread_id"]=""
operation_parameters_collection_type["deleteMessage:::message_id"]=""
operation_parameters_collection_type["deleteThread:::thread_id"]=""
operation_parameters_collection_type["getAssistant:::assistant_id"]=""
operation_parameters_collection_type["getMessage:::thread_id"]=""
operation_parameters_collection_type["getMessage:::message_id"]=""
operation_parameters_collection_type["getRun:::thread_id"]=""
operation_parameters_collection_type["getRun:::run_id"]=""
operation_parameters_collection_type["getRunStep:::thread_id"]=""
operation_parameters_collection_type["getRunStep:::run_id"]=""
operation_parameters_collection_type["getRunStep:::step_id"]=""
operation_parameters_collection_type["getRunStep:::include[]"]="multi"
operation_parameters_collection_type["getThread:::thread_id"]=""
operation_parameters_collection_type["listAssistants:::limit"]=""
operation_parameters_collection_type["listAssistants:::order"]=""
operation_parameters_collection_type["listAssistants:::after"]=""
operation_parameters_collection_type["listAssistants:::before"]=""
operation_parameters_collection_type["listMessages:::thread_id"]=""
operation_parameters_collection_type["listMessages:::limit"]=""
operation_parameters_collection_type["listMessages:::order"]=""
operation_parameters_collection_type["listMessages:::after"]=""
operation_parameters_collection_type["listMessages:::before"]=""
operation_parameters_collection_type["listMessages:::run_id"]=""
operation_parameters_collection_type["listRunSteps:::thread_id"]=""
operation_parameters_collection_type["listRunSteps:::run_id"]=""
operation_parameters_collection_type["listRunSteps:::limit"]=""
operation_parameters_collection_type["listRunSteps:::order"]=""
operation_parameters_collection_type["listRunSteps:::after"]=""
operation_parameters_collection_type["listRunSteps:::before"]=""
operation_parameters_collection_type["listRunSteps:::include[]"]="multi"
operation_parameters_collection_type["listRuns:::thread_id"]=""
operation_parameters_collection_type["listRuns:::limit"]=""
operation_parameters_collection_type["listRuns:::order"]=""
operation_parameters_collection_type["listRuns:::after"]=""
operation_parameters_collection_type["listRuns:::before"]=""
operation_parameters_collection_type["modifyAssistant:::assistant_id"]=""
operation_parameters_collection_type["modifyAssistant:::ModifyAssistantRequest"]=""
operation_parameters_collection_type["modifyMessage:::thread_id"]=""
operation_parameters_collection_type["modifyMessage:::message_id"]=""
operation_parameters_collection_type["modifyMessage:::ModifyMessageRequest"]=""
operation_parameters_collection_type["modifyRun:::thread_id"]=""
operation_parameters_collection_type["modifyRun:::run_id"]=""
operation_parameters_collection_type["modifyRun:::ModifyRunRequest"]=""
operation_parameters_collection_type["modifyThread:::thread_id"]=""
operation_parameters_collection_type["modifyThread:::ModifyThreadRequest"]=""
operation_parameters_collection_type["submitToolOuputsToRun:::thread_id"]=""
operation_parameters_collection_type["submitToolOuputsToRun:::run_id"]=""
operation_parameters_collection_type["submitToolOuputsToRun:::SubmitToolOutputsRunRequest"]=""
operation_parameters_collection_type["createSpeech:::CreateSpeechRequest"]=""
operation_parameters_collection_type["createTranscription:::file"]=""
operation_parameters_collection_type["createTranscription:::model"]=""
operation_parameters_collection_type["createTranscription:::language"]=""
operation_parameters_collection_type["createTranscription:::prompt"]=""
operation_parameters_collection_type["createTranscription:::response_format"]=""
operation_parameters_collection_type["createTranscription:::temperature"]=""
operation_parameters_collection_type["createTranscription:::timestamp_granularities[]"]=
operation_parameters_collection_type["createTranslation:::file"]=""
operation_parameters_collection_type["createTranslation:::model"]=""
operation_parameters_collection_type["createTranslation:::prompt"]=""
operation_parameters_collection_type["createTranslation:::response_format"]=""
operation_parameters_collection_type["createTranslation:::temperature"]=""
operation_parameters_collection_type["listAuditLogs:::effective_at"]=""
operation_parameters_collection_type["listAuditLogs:::project_ids[]"]="multi"
operation_parameters_collection_type["listAuditLogs:::event_types[]"]="multi"
operation_parameters_collection_type["listAuditLogs:::actor_ids[]"]="multi"
operation_parameters_collection_type["listAuditLogs:::actor_emails[]"]="multi"
operation_parameters_collection_type["listAuditLogs:::resource_ids[]"]="multi"
operation_parameters_collection_type["listAuditLogs:::limit"]=""
operation_parameters_collection_type["listAuditLogs:::after"]=""
operation_parameters_collection_type["listAuditLogs:::before"]=""
operation_parameters_collection_type["cancelBatch:::batch_id"]=""
operation_parameters_collection_type["createBatch:::CreateBatchRequest"]=""
operation_parameters_collection_type["listBatches:::after"]=""
operation_parameters_collection_type["listBatches:::limit"]=""
operation_parameters_collection_type["retrieveBatch:::batch_id"]=""
operation_parameters_collection_type["createChatCompletion:::CreateChatCompletionRequest"]=""
operation_parameters_collection_type["createCompletion:::CreateCompletionRequest"]=""
operation_parameters_collection_type["adminApiKeysCreate:::AdminApiKeysCreateRequest"]=""
operation_parameters_collection_type["adminApiKeysDelete:::key_id"]=""
operation_parameters_collection_type["adminApiKeysGet:::key_id"]=""
operation_parameters_collection_type["adminApiKeysList:::after"]=""
operation_parameters_collection_type["adminApiKeysList:::order"]=""
operation_parameters_collection_type["adminApiKeysList:::limit"]=""
operation_parameters_collection_type["createEmbedding:::CreateEmbeddingRequest"]=""
operation_parameters_collection_type["createFile:::file"]=""
operation_parameters_collection_type["createFile:::purpose"]=""
operation_parameters_collection_type["deleteFile:::file_id"]=""
operation_parameters_collection_type["downloadFile:::file_id"]=""
operation_parameters_collection_type["listFiles:::purpose"]=""
operation_parameters_collection_type["listFiles:::limit"]=""
operation_parameters_collection_type["listFiles:::order"]=""
operation_parameters_collection_type["listFiles:::after"]=""
operation_parameters_collection_type["retrieveFile:::file_id"]=""
operation_parameters_collection_type["cancelFineTuningJob:::fine_tuning_job_id"]=""
operation_parameters_collection_type["createFineTuningJob:::CreateFineTuningJobRequest"]=""
operation_parameters_collection_type["listFineTuningEvents:::fine_tuning_job_id"]=""
operation_parameters_collection_type["listFineTuningEvents:::after"]=""
operation_parameters_collection_type["listFineTuningEvents:::limit"]=""
operation_parameters_collection_type["listFineTuningJobCheckpoints:::fine_tuning_job_id"]=""
operation_parameters_collection_type["listFineTuningJobCheckpoints:::after"]=""
operation_parameters_collection_type["listFineTuningJobCheckpoints:::limit"]=""
operation_parameters_collection_type["listPaginatedFineTuningJobs:::after"]=""
operation_parameters_collection_type["listPaginatedFineTuningJobs:::limit"]=""
operation_parameters_collection_type["retrieveFineTuningJob:::fine_tuning_job_id"]=""
operation_parameters_collection_type["createImage:::CreateImageRequest"]=""
operation_parameters_collection_type["createImageEdit:::image"]=""
operation_parameters_collection_type["createImageEdit:::prompt"]=""
operation_parameters_collection_type["createImageEdit:::mask"]=""
operation_parameters_collection_type["createImageEdit:::model"]=""
operation_parameters_collection_type["createImageEdit:::n"]=""
operation_parameters_collection_type["createImageEdit:::size"]=""
operation_parameters_collection_type["createImageEdit:::response_format"]=""
operation_parameters_collection_type["createImageEdit:::user"]=""
operation_parameters_collection_type["createImageVariation:::image"]=""
operation_parameters_collection_type["createImageVariation:::model"]=""
operation_parameters_collection_type["createImageVariation:::n"]=""
operation_parameters_collection_type["createImageVariation:::response_format"]=""
operation_parameters_collection_type["createImageVariation:::size"]=""
operation_parameters_collection_type["createImageVariation:::user"]=""
operation_parameters_collection_type["deleteInvite:::invite_id"]=""
operation_parameters_collection_type["inviteUser:::InviteRequest"]=""
operation_parameters_collection_type["listInvites:::limit"]=""
operation_parameters_collection_type["listInvites:::after"]=""
operation_parameters_collection_type["retrieveInvite:::invite_id"]=""
operation_parameters_collection_type["deleteModel:::model"]=""
operation_parameters_collection_type["retrieveModel:::model"]=""
operation_parameters_collection_type["createModeration:::CreateModerationRequest"]=""
operation_parameters_collection_type["archiveProject:::project_id"]=""
operation_parameters_collection_type["createProject:::ProjectCreateRequest"]=""
operation_parameters_collection_type["createProjectServiceAccount:::project_id"]=""
operation_parameters_collection_type["createProjectServiceAccount:::ProjectServiceAccountCreateRequest"]=""
operation_parameters_collection_type["createProjectUser:::project_id"]=""
operation_parameters_collection_type["createProjectUser:::ProjectUserCreateRequest"]=""
operation_parameters_collection_type["deleteProjectApiKey:::project_id"]=""
operation_parameters_collection_type["deleteProjectApiKey:::key_id"]=""
operation_parameters_collection_type["deleteProjectServiceAccount:::project_id"]=""
operation_parameters_collection_type["deleteProjectServiceAccount:::service_account_id"]=""
operation_parameters_collection_type["deleteProjectUser:::project_id"]=""
operation_parameters_collection_type["deleteProjectUser:::user_id"]=""
operation_parameters_collection_type["listProjectApiKeys:::project_id"]=""
operation_parameters_collection_type["listProjectApiKeys:::limit"]=""
operation_parameters_collection_type["listProjectApiKeys:::after"]=""
operation_parameters_collection_type["listProjectRateLimits:::project_id"]=""
operation_parameters_collection_type["listProjectRateLimits:::limit"]=""
operation_parameters_collection_type["listProjectRateLimits:::after"]=""
operation_parameters_collection_type["listProjectRateLimits:::before"]=""
operation_parameters_collection_type["listProjectServiceAccounts:::project_id"]=""
operation_parameters_collection_type["listProjectServiceAccounts:::limit"]=""
operation_parameters_collection_type["listProjectServiceAccounts:::after"]=""
operation_parameters_collection_type["listProjectUsers:::project_id"]=""
operation_parameters_collection_type["listProjectUsers:::limit"]=""
operation_parameters_collection_type["listProjectUsers:::after"]=""
operation_parameters_collection_type["listProjects:::limit"]=""
operation_parameters_collection_type["listProjects:::after"]=""
operation_parameters_collection_type["listProjects:::include_archived"]=""
operation_parameters_collection_type["modifyProject:::project_id"]=""
operation_parameters_collection_type["modifyProject:::ProjectUpdateRequest"]=""
operation_parameters_collection_type["modifyProjectUser:::project_id"]=""
operation_parameters_collection_type["modifyProjectUser:::user_id"]=""
operation_parameters_collection_type["modifyProjectUser:::ProjectUserUpdateRequest"]=""
operation_parameters_collection_type["retrieveProject:::project_id"]=""
operation_parameters_collection_type["retrieveProjectApiKey:::project_id"]=""
operation_parameters_collection_type["retrieveProjectApiKey:::key_id"]=""
operation_parameters_collection_type["retrieveProjectServiceAccount:::project_id"]=""
operation_parameters_collection_type["retrieveProjectServiceAccount:::service_account_id"]=""
operation_parameters_collection_type["retrieveProjectUser:::project_id"]=""
operation_parameters_collection_type["retrieveProjectUser:::user_id"]=""
operation_parameters_collection_type["updateProjectRateLimits:::project_id"]=""
operation_parameters_collection_type["updateProjectRateLimits:::rate_limit_id"]=""
operation_parameters_collection_type["updateProjectRateLimits:::ProjectRateLimitUpdateRequest"]=""
operation_parameters_collection_type["createRealtimeSession:::RealtimeSessionCreateRequest"]=""
operation_parameters_collection_type["addUploadPart:::upload_id"]=""
operation_parameters_collection_type["addUploadPart:::data"]=""
operation_parameters_collection_type["cancelUpload:::upload_id"]=""
operation_parameters_collection_type["completeUpload:::upload_id"]=""
operation_parameters_collection_type["completeUpload:::CompleteUploadRequest"]=""
operation_parameters_collection_type["createUpload:::CreateUploadRequest"]=""
operation_parameters_collection_type["usageAudioSpeeches:::start_time"]=""
operation_parameters_collection_type["usageAudioSpeeches:::end_time"]=""
operation_parameters_collection_type["usageAudioSpeeches:::bucket_width"]=""
operation_parameters_collection_type["usageAudioSpeeches:::project_ids"]="multi"
operation_parameters_collection_type["usageAudioSpeeches:::user_ids"]="multi"
operation_parameters_collection_type["usageAudioSpeeches:::api_key_ids"]="multi"
operation_parameters_collection_type["usageAudioSpeeches:::models"]="multi"
operation_parameters_collection_type["usageAudioSpeeches:::group_by"]="multi"
operation_parameters_collection_type["usageAudioSpeeches:::limit"]=""
operation_parameters_collection_type["usageAudioSpeeches:::page"]=""
operation_parameters_collection_type["usageAudioTranscriptions:::start_time"]=""
operation_parameters_collection_type["usageAudioTranscriptions:::end_time"]=""
operation_parameters_collection_type["usageAudioTranscriptions:::bucket_width"]=""
operation_parameters_collection_type["usageAudioTranscriptions:::project_ids"]="multi"
operation_parameters_collection_type["usageAudioTranscriptions:::user_ids"]="multi"
operation_parameters_collection_type["usageAudioTranscriptions:::api_key_ids"]="multi"
operation_parameters_collection_type["usageAudioTranscriptions:::models"]="multi"
operation_parameters_collection_type["usageAudioTranscriptions:::group_by"]="multi"
operation_parameters_collection_type["usageAudioTranscriptions:::limit"]=""
operation_parameters_collection_type["usageAudioTranscriptions:::page"]=""
operation_parameters_collection_type["usageCodeInterpreterSessions:::start_time"]=""
operation_parameters_collection_type["usageCodeInterpreterSessions:::end_time"]=""
operation_parameters_collection_type["usageCodeInterpreterSessions:::bucket_width"]=""
operation_parameters_collection_type["usageCodeInterpreterSessions:::project_ids"]="multi"
operation_parameters_collection_type["usageCodeInterpreterSessions:::group_by"]="multi"
operation_parameters_collection_type["usageCodeInterpreterSessions:::limit"]=""
operation_parameters_collection_type["usageCodeInterpreterSessions:::page"]=""
operation_parameters_collection_type["usageCompletions:::start_time"]=""
operation_parameters_collection_type["usageCompletions:::end_time"]=""
operation_parameters_collection_type["usageCompletions:::bucket_width"]=""
operation_parameters_collection_type["usageCompletions:::project_ids"]="multi"
operation_parameters_collection_type["usageCompletions:::user_ids"]="multi"
operation_parameters_collection_type["usageCompletions:::api_key_ids"]="multi"
operation_parameters_collection_type["usageCompletions:::models"]="multi"
operation_parameters_collection_type["usageCompletions:::batch"]=""
operation_parameters_collection_type["usageCompletions:::group_by"]="multi"
operation_parameters_collection_type["usageCompletions:::limit"]=""
operation_parameters_collection_type["usageCompletions:::page"]=""
operation_parameters_collection_type["usageCosts:::start_time"]=""
operation_parameters_collection_type["usageCosts:::end_time"]=""
operation_parameters_collection_type["usageCosts:::bucket_width"]=""
operation_parameters_collection_type["usageCosts:::project_ids"]="multi"
operation_parameters_collection_type["usageCosts:::group_by"]="multi"
operation_parameters_collection_type["usageCosts:::limit"]=""
operation_parameters_collection_type["usageCosts:::page"]=""
operation_parameters_collection_type["usageEmbeddings:::start_time"]=""
operation_parameters_collection_type["usageEmbeddings:::end_time"]=""
operation_parameters_collection_type["usageEmbeddings:::bucket_width"]=""
operation_parameters_collection_type["usageEmbeddings:::project_ids"]="multi"
operation_parameters_collection_type["usageEmbeddings:::user_ids"]="multi"
operation_parameters_collection_type["usageEmbeddings:::api_key_ids"]="multi"
operation_parameters_collection_type["usageEmbeddings:::models"]="multi"
operation_parameters_collection_type["usageEmbeddings:::group_by"]="multi"
operation_parameters_collection_type["usageEmbeddings:::limit"]=""
operation_parameters_collection_type["usageEmbeddings:::page"]=""
operation_parameters_collection_type["usageImages:::start_time"]=""
operation_parameters_collection_type["usageImages:::end_time"]=""
operation_parameters_collection_type["usageImages:::bucket_width"]=""
operation_parameters_collection_type["usageImages:::sources"]="multi"
operation_parameters_collection_type["usageImages:::sizes"]="multi"
operation_parameters_collection_type["usageImages:::project_ids"]="multi"
operation_parameters_collection_type["usageImages:::user_ids"]="multi"
operation_parameters_collection_type["usageImages:::api_key_ids"]="multi"
operation_parameters_collection_type["usageImages:::models"]="multi"
operation_parameters_collection_type["usageImages:::group_by"]="multi"
operation_parameters_collection_type["usageImages:::limit"]=""
operation_parameters_collection_type["usageImages:::page"]=""
operation_parameters_collection_type["usageModerations:::start_time"]=""
operation_parameters_collection_type["usageModerations:::end_time"]=""
operation_parameters_collection_type["usageModerations:::bucket_width"]=""
operation_parameters_collection_type["usageModerations:::project_ids"]="multi"
operation_parameters_collection_type["usageModerations:::user_ids"]="multi"
operation_parameters_collection_type["usageModerations:::api_key_ids"]="multi"
operation_parameters_collection_type["usageModerations:::models"]="multi"
operation_parameters_collection_type["usageModerations:::group_by"]="multi"
operation_parameters_collection_type["usageModerations:::limit"]=""
operation_parameters_collection_type["usageModerations:::page"]=""
operation_parameters_collection_type["usageVectorStores:::start_time"]=""
operation_parameters_collection_type["usageVectorStores:::end_time"]=""
operation_parameters_collection_type["usageVectorStores:::bucket_width"]=""
operation_parameters_collection_type["usageVectorStores:::project_ids"]="multi"
operation_parameters_collection_type["usageVectorStores:::group_by"]="multi"
operation_parameters_collection_type["usageVectorStores:::limit"]=""
operation_parameters_collection_type["usageVectorStores:::page"]=""
operation_parameters_collection_type["deleteUser:::user_id"]=""
operation_parameters_collection_type["listUsers:::limit"]=""
operation_parameters_collection_type["listUsers:::after"]=""
operation_parameters_collection_type["modifyUser:::user_id"]=""
operation_parameters_collection_type["modifyUser:::UserRoleUpdateRequest"]=""
operation_parameters_collection_type["retrieveUser:::user_id"]=""
operation_parameters_collection_type["cancelVectorStoreFileBatch:::vector_store_id"]=""
operation_parameters_collection_type["cancelVectorStoreFileBatch:::batch_id"]=""
operation_parameters_collection_type["createVectorStore:::CreateVectorStoreRequest"]=""
operation_parameters_collection_type["createVectorStoreFile:::vector_store_id"]=""
operation_parameters_collection_type["createVectorStoreFile:::CreateVectorStoreFileRequest"]=""
operation_parameters_collection_type["createVectorStoreFileBatch:::vector_store_id"]=""
operation_parameters_collection_type["createVectorStoreFileBatch:::CreateVectorStoreFileBatchRequest"]=""
operation_parameters_collection_type["deleteVectorStore:::vector_store_id"]=""
operation_parameters_collection_type["deleteVectorStoreFile:::vector_store_id"]=""
operation_parameters_collection_type["deleteVectorStoreFile:::file_id"]=""
operation_parameters_collection_type["getVectorStore:::vector_store_id"]=""
operation_parameters_collection_type["getVectorStoreFile:::vector_store_id"]=""
operation_parameters_collection_type["getVectorStoreFile:::file_id"]=""
operation_parameters_collection_type["getVectorStoreFileBatch:::vector_store_id"]=""
operation_parameters_collection_type["getVectorStoreFileBatch:::batch_id"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::vector_store_id"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::batch_id"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::limit"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::order"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::after"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::before"]=""
operation_parameters_collection_type["listFilesInVectorStoreBatch:::filter"]=""
operation_parameters_collection_type["listVectorStoreFiles:::vector_store_id"]=""
operation_parameters_collection_type["listVectorStoreFiles:::limit"]=""
operation_parameters_collection_type["listVectorStoreFiles:::order"]=""
operation_parameters_collection_type["listVectorStoreFiles:::after"]=""
operation_parameters_collection_type["listVectorStoreFiles:::before"]=""
operation_parameters_collection_type["listVectorStoreFiles:::filter"]=""
operation_parameters_collection_type["listVectorStores:::limit"]=""
operation_parameters_collection_type["listVectorStores:::order"]=""
operation_parameters_collection_type["listVectorStores:::after"]=""
operation_parameters_collection_type["listVectorStores:::before"]=""
operation_parameters_collection_type["modifyVectorStore:::vector_store_id"]=""
operation_parameters_collection_type["modifyVectorStore:::UpdateVectorStoreRequest"]=""


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    if [[ $RAW_BODY == "1" ]]; then
        echo "-d '${body_parameters["RAW_BODY"]}'"
    else
        local body_json="-d '{"
        local count=0
        for key in "${!body_parameters[@]}"; do
            if [[ $((count++)) -gt 0 ]]; then
                body_json+=", "
            fi
            body_json+="\"${key}\": ${body_parameters[${key}]}"
        done
        body_json+="}'"

        if [[ "${#body_parameters[@]}" -eq 0 ]]; then
            echo ""
        else
            echo "${body_json}"
        fi
    fi
}

##############################################################################
#
# Converts an associative array into form urlencoded string
#
##############################################################################
body_parameters_to_form_urlencoded() {
    local body_form_urlencoded="-d '"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_form_urlencoded+="&"
        fi
        body_form_urlencoded+="${key}=${body_parameters[${key}]}"
    done
    body_form_urlencoded+="'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_form_urlencoded}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    for qparam in "${query_params[@]}"; do
        if [[ "${operation_parameters[$qparam]}" == "" ]]; then
            continue
        fi

        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")



        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'multi' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            if [[ -n "${query_request_part}" ]]; then
                query_request_part+="&"
            fi
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}OpenAI API command line client (API version 2.3.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Authentication methods${OFF}"
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[assistants]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}cancelRun${OFF};Cancels a run that is 'in_progress'. (AUTH)
  ${CYAN}createAssistant${OFF};Create an assistant with a model and instructions. (AUTH)
  ${CYAN}createMessage${OFF};Create a message. (AUTH)
  ${CYAN}createRun${OFF};Create a run. (AUTH)
  ${CYAN}createThread${OFF};Create a thread. (AUTH)
  ${CYAN}createThreadAndRun${OFF};Create a thread and run it in one request. (AUTH)
  ${CYAN}deleteAssistant${OFF};Delete an assistant. (AUTH)
  ${CYAN}deleteMessage${OFF};Deletes a message. (AUTH)
  ${CYAN}deleteThread${OFF};Delete a thread. (AUTH)
  ${CYAN}getAssistant${OFF};Retrieves an assistant. (AUTH)
  ${CYAN}getMessage${OFF};Retrieve a message. (AUTH)
  ${CYAN}getRun${OFF};Retrieves a run. (AUTH)
  ${CYAN}getRunStep${OFF};Retrieves a run step. (AUTH)
  ${CYAN}getThread${OFF};Retrieves a thread. (AUTH)
  ${CYAN}listAssistants${OFF};Returns a list of assistants. (AUTH)
  ${CYAN}listMessages${OFF};Returns a list of messages for a given thread. (AUTH)
  ${CYAN}listRunSteps${OFF};Returns a list of run steps belonging to a run. (AUTH)
  ${CYAN}listRuns${OFF};Returns a list of runs belonging to a thread. (AUTH)
  ${CYAN}modifyAssistant${OFF};Modifies an assistant. (AUTH)
  ${CYAN}modifyMessage${OFF};Modifies a message. (AUTH)
  ${CYAN}modifyRun${OFF};Modifies a run. (AUTH)
  ${CYAN}modifyThread${OFF};Modifies a thread. (AUTH)
  ${CYAN}submitToolOuputsToRun${OFF};When a run has the 'status: \"requires_action\"' and 'required_action.type' is 'submit_tool_outputs', this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[audio]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createSpeech${OFF};Generates audio from the input text. (AUTH)
  ${CYAN}createTranscription${OFF};Transcribes audio into the input language. (AUTH)
  ${CYAN}createTranslation${OFF};Translates audio into English. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[auditLogs]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}listAuditLogs${OFF};List user actions and configuration changes within this organization. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[batch]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}cancelBatch${OFF};Cancels an in-progress batch. The batch will be in status 'cancelling' for up to 10 minutes, before changing to 'cancelled', where it will have partial results (if any) available in the output file. (AUTH)
  ${CYAN}createBatch${OFF};Creates and executes a batch from an uploaded file of requests (AUTH)
  ${CYAN}listBatches${OFF};List your organization's batches. (AUTH)
  ${CYAN}retrieveBatch${OFF};Retrieves a batch. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[chat]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createChatCompletion${OFF};Creates a model response for the given chat conversation. Learn more in the
[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),
and [audio](/docs/guides/audio) guides.

Parameter support can differ depending on the model used to generate the
response, particularly for newer reasoning models. Parameters that are only
supported for reasoning models are noted below. For the current state of 
unsupported parameters in reasoning models, 
[refer to the reasoning guide](/docs/guides/reasoning). (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[completions]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createCompletion${OFF};Creates a completion for the provided prompt and parameters. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[default]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}adminApiKeysCreate${OFF};Create an organization admin API key (AUTH)
  ${CYAN}adminApiKeysDelete${OFF};Delete an organization admin API key (AUTH)
  ${CYAN}adminApiKeysGet${OFF};Retrieve a single organization API key (AUTH)
  ${CYAN}adminApiKeysList${OFF};List organization API keys (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[embeddings]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createEmbedding${OFF};Creates an embedding vector representing the input text. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[files]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createFile${OFF};Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.

The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.

The Fine-tuning API only supports '.jsonl' files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.

The Batch API only supports '.jsonl' files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).

Please [contact us](https://help.openai.com/) if you need to increase these storage limits. (AUTH)
  ${CYAN}deleteFile${OFF};Delete a file. (AUTH)
  ${CYAN}downloadFile${OFF};Returns the contents of the specified file. (AUTH)
  ${CYAN}listFiles${OFF};Returns a list of files. (AUTH)
  ${CYAN}retrieveFile${OFF};Returns information about a specific file. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[fineTuning]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}cancelFineTuningJob${OFF};Immediately cancel a fine-tune job. (AUTH)
  ${CYAN}createFineTuningJob${OFF};Creates a fine-tuning job which begins the process of creating a new model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about fine-tuning](/docs/guides/fine-tuning) (AUTH)
  ${CYAN}listFineTuningEvents${OFF};Get status updates for a fine-tuning job. (AUTH)
  ${CYAN}listFineTuningJobCheckpoints${OFF};List checkpoints for a fine-tuning job. (AUTH)
  ${CYAN}listPaginatedFineTuningJobs${OFF};List your organization's fine-tuning jobs (AUTH)
  ${CYAN}retrieveFineTuningJob${OFF};Get info about a fine-tuning job.

[Learn more about fine-tuning](/docs/guides/fine-tuning) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[images]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createImage${OFF};Creates an image given a prompt. (AUTH)
  ${CYAN}createImageEdit${OFF};Creates an edited or extended image given an original image and a prompt. (AUTH)
  ${CYAN}createImageVariation${OFF};Creates a variation of a given image. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[invites]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteInvite${OFF};Delete an invite. If the invite has already been accepted, it cannot be deleted. (AUTH)
  ${CYAN}inviteUser${OFF};Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. (AUTH)
  ${CYAN}listInvites${OFF};Returns a list of invites in the organization. (AUTH)
  ${CYAN}retrieveInvite${OFF};Retrieves an invite. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[models]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteModel${OFF};Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. (AUTH)
  ${CYAN}listModels${OFF};Lists the currently available models, and provides basic information about each one such as the owner and availability. (AUTH)
  ${CYAN}retrieveModel${OFF};Retrieves a model instance, providing basic information about the model such as the owner and permissioning. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[moderations]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createModeration${OFF};Classifies if text and/or image inputs are potentially harmful. Learn
more in the [moderation guide](/docs/guides/moderation). (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[projects]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}archiveProject${OFF};Archives a project in the organization. Archived projects cannot be used or updated. (AUTH)
  ${CYAN}createProject${OFF};Create a new project in the organization. Projects can be created and archived, but cannot be deleted. (AUTH)
  ${CYAN}createProjectServiceAccount${OFF};Creates a new service account in the project. This also returns an unredacted API key for the service account. (AUTH)
  ${CYAN}createProjectUser${OFF};Adds a user to the project. Users must already be members of the organization to be added to a project. (AUTH)
  ${CYAN}deleteProjectApiKey${OFF};Deletes an API key from the project. (AUTH)
  ${CYAN}deleteProjectServiceAccount${OFF};Deletes a service account from the project. (AUTH)
  ${CYAN}deleteProjectUser${OFF};Deletes a user from the project. (AUTH)
  ${CYAN}listProjectApiKeys${OFF};Returns a list of API keys in the project. (AUTH)
  ${CYAN}listProjectRateLimits${OFF};Returns the rate limits per model for a project. (AUTH)
  ${CYAN}listProjectServiceAccounts${OFF};Returns a list of service accounts in the project. (AUTH)
  ${CYAN}listProjectUsers${OFF};Returns a list of users in the project. (AUTH)
  ${CYAN}listProjects${OFF};Returns a list of projects. (AUTH)
  ${CYAN}modifyProject${OFF};Modifies a project in the organization. (AUTH)
  ${CYAN}modifyProjectUser${OFF};Modifies a user's role in the project. (AUTH)
  ${CYAN}retrieveProject${OFF};Retrieves a project. (AUTH)
  ${CYAN}retrieveProjectApiKey${OFF};Retrieves an API key in the project. (AUTH)
  ${CYAN}retrieveProjectServiceAccount${OFF};Retrieves a service account in the project. (AUTH)
  ${CYAN}retrieveProjectUser${OFF};Retrieves a user in the project. (AUTH)
  ${CYAN}updateProjectRateLimits${OFF};Updates a project rate limit. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[realtime]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createRealtimeSession${OFF};Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
'session.update' client event.

It responds with a session object, plus a 'client_secret' key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[uploads]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}addUploadPart${OFF};Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. 

Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.

It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). (AUTH)
  ${CYAN}cancelUpload${OFF};Cancels the Upload. No Parts may be added after an Upload is cancelled. (AUTH)
  ${CYAN}completeUpload${OFF};Completes the [Upload](/docs/api-reference/uploads/object). 

Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.

You can specify the order of the Parts by passing in an ordered list of the Part IDs.

The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. (AUTH)
  ${CYAN}createUpload${OFF};Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.

Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.

For certain 'purpose's, the correct 'mime_type' must be specified. Please refer to documentation for the supported MIME types for your use case:
- [Assistants](/docs/assistants/tools/file-search#supported-files)

For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[usage]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}usageAudioSpeeches${OFF};Get audio speeches usage details for the organization. (AUTH)
  ${CYAN}usageAudioTranscriptions${OFF};Get audio transcriptions usage details for the organization. (AUTH)
  ${CYAN}usageCodeInterpreterSessions${OFF};Get code interpreter sessions usage details for the organization. (AUTH)
  ${CYAN}usageCompletions${OFF};Get completions usage details for the organization. (AUTH)
  ${CYAN}usageCosts${OFF};Get costs details for the organization. (AUTH)
  ${CYAN}usageEmbeddings${OFF};Get embeddings usage details for the organization. (AUTH)
  ${CYAN}usageImages${OFF};Get images usage details for the organization. (AUTH)
  ${CYAN}usageModerations${OFF};Get moderations usage details for the organization. (AUTH)
  ${CYAN}usageVectorStores${OFF};Get vector stores usage details for the organization. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[users]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteUser${OFF};Deletes a user from the organization. (AUTH)
  ${CYAN}listUsers${OFF};Lists all of the users in the organization. (AUTH)
  ${CYAN}modifyUser${OFF};Modifies a user's role in the organization. (AUTH)
  ${CYAN}retrieveUser${OFF};Retrieves a user by their identifier. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[vectorStores]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}cancelVectorStoreFileBatch${OFF};Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. (AUTH)
  ${CYAN}createVectorStore${OFF};Create a vector store. (AUTH)
  ${CYAN}createVectorStoreFile${OFF};Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). (AUTH)
  ${CYAN}createVectorStoreFileBatch${OFF};Create a vector store file batch. (AUTH)
  ${CYAN}deleteVectorStore${OFF};Delete a vector store. (AUTH)
  ${CYAN}deleteVectorStoreFile${OFF};Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. (AUTH)
  ${CYAN}getVectorStore${OFF};Retrieves a vector store. (AUTH)
  ${CYAN}getVectorStoreFile${OFF};Retrieves a vector store file. (AUTH)
  ${CYAN}getVectorStoreFileBatch${OFF};Retrieves a vector store file batch. (AUTH)
  ${CYAN}listFilesInVectorStoreBatch${OFF};Returns a list of vector store files in a batch. (AUTH)
  ${CYAN}listVectorStoreFiles${OFF};Returns a list of vector store files. (AUTH)
  ${CYAN}listVectorStores${OFF};Returns a list of vector stores. (AUTH)
  ${CYAN}modifyVectorStore${OFF};Modifies a vector store. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://api.openai.com')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodetected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}OpenAI API command line client (API version 2.3.0)${OFF}"
    echo ""
    echo -e "License: MIT"
    echo -e "Contact: blah+oapicf@cliffano.com"
    echo ""
read -r -d '' appdescription <<EOF

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
EOF
echo "$appdescription" | paste -sd' ' - | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}OpenAI API command line client (API version 2.3.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for cancelRun operation
#
##############################################################################
print_cancelRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelRun - Cancels a run that is 'in_progress'.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to which this run belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run to cancel. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createAssistant operation
#
##############################################################################
print_createAssistant_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createAssistant - Create an assistant with a model and instructions.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createMessage operation
#
##############################################################################
print_createMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createMessage - Create a message.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) to create a message for. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createRun operation
#
##############################################################################
print_createRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createRun - Create a run.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to run. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.${YELLOW} Specify as: include[]=value1 include[]=value2 include[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createThread operation
#
##############################################################################
print_createThread_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createThread - Create a thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createThreadAndRun operation
#
##############################################################################
print_createThreadAndRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createThreadAndRun - Create a thread and run it in one request.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteAssistant operation
#
##############################################################################
print_deleteAssistant_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteAssistant - Delete an assistant.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant to delete. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteMessage operation
#
##############################################################################
print_deleteMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteMessage - Deletes a message.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to which this message belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the message to delete. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteThread operation
#
##############################################################################
print_deleteThread_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteThread - Delete a thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to delete. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAssistant operation
#
##############################################################################
print_getAssistant_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssistant - Retrieves an assistant.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant to retrieve. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getMessage operation
#
##############################################################################
print_getMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMessage - Retrieve a message.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) to which this message belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the message to retrieve. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getRun operation
#
##############################################################################
print_getRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getRun - Retrieves a run.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) that was run. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run to retrieve. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getRunStep operation
#
##############################################################################
print_getRunStep_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getRunStep - Retrieves a run step.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to which the run and run step belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run to which the run step belongs. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}step_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run step to retrieve. ${YELLOW}Specify as: step_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.${YELLOW} Specify as: include[]=value1 include[]=value2 include[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getThread operation
#
##############################################################################
print_getThread_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getThread - Retrieves a thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to retrieve. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listAssistants operation
#
##############################################################################
print_listAssistants_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listAssistants - Returns a list of assistants.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listMessages operation
#
##############################################################################
print_listMessages_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listMessages - Returns a list of messages for a given thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) the messages belong to. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter messages by the run ID that generated them.${YELLOW} Specify as: run_id=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listRunSteps operation
#
##############################################################################
print_listRunSteps_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listRunSteps - Returns a list of run steps belonging to a run.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread the run and run steps belong to. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run the run steps belong to. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - A list of additional fields to include in the response. Currently the only supported value is 'step_details.tool_calls[*].file_search.results[*].content' to fetch the file search result content.

See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.${YELLOW} Specify as: include[]=value1 include[]=value2 include[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listRuns operation
#
##############################################################################
print_listRuns_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listRuns - Returns a list of runs belonging to a thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread the run belongs to. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyAssistant operation
#
##############################################################################
print_modifyAssistant_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyAssistant - Modifies an assistant.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant to modify. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyMessage operation
#
##############################################################################
print_modifyMessage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyMessage - Modifies a message.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to which this message belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the message to modify. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyRun operation
#
##############################################################################
print_modifyRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyRun - Modifies a run.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) that was run. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run to modify. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyThread operation
#
##############################################################################
print_modifyThread_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyThread - Modifies a thread.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to modify. Only the 'metadata' can be modified. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for submitToolOuputsToRun operation
#
##############################################################################
print_submitToolOuputsToRun_help() {
    echo ""
    echo -e "${BOLD}${WHITE}submitToolOuputsToRun - When a run has the 'status: \"requires_action\"' and 'required_action.type' is 'submit_tool_outputs', this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the [thread](/docs/api-reference/threads) to which this run belongs. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}run_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the run that requires the tool output submission. ${YELLOW}Specify as: run_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createSpeech operation
#
##############################################################################
print_createSpeech_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createSpeech - Generates audio from the input text.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
        echo -e "       ${BOLD}${WHITE}Response headers${OFF}"
        echo -e "       ${BLUE}Transfer-Encoding${OFF} - chunked" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/        /'
}
##############################################################################
#
# Print help for createTranscription operation
#
##############################################################################
print_createTranscription_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createTranscription - Transcribes audio into the input language.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createTranslation operation
#
##############################################################################
print_createTranslation_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createTranslation - Translates audio into English.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listAuditLogs operation
#
##############################################################################
print_listAuditLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listAuditLogs - List user actions and configuration changes within this organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}effective_at${OFF} ${BLUE}[ListAuditLogsEffectiveAtParameter]${OFF} ${CYAN}(default: null)${OFF} - Return only events whose 'effective_at' (Unix seconds) is in this range.${YELLOW} Specify as: effective_at=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only events for these projects.${YELLOW} Specify as: project_ids[]=value1 project_ids[]=value2 project_ids[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}event_types[]${OFF} ${BLUE}[array[AuditLogEventType]]${OFF} ${CYAN}(default: null)${OFF} - Return only events with a 'type' in one of these values. For example, 'project.created'. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).${YELLOW} Specify as: event_types[]=value1 event_types[]=value2 event_types[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}actor_ids[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.${YELLOW} Specify as: actor_ids[]=value1 actor_ids[]=value2 actor_ids[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}actor_emails[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only events performed by users with these emails.${YELLOW} Specify as: actor_emails[]=value1 actor_emails[]=value2 actor_emails[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}resource_ids[]${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only events performed on these targets. For example, a project ID updated.${YELLOW} Specify as: resource_ids[]=value1 resource_ids[]=value2 resource_ids[]=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Audit logs listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for cancelBatch operation
#
##############################################################################
print_cancelBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelBatch - Cancels an in-progress batch. The batch will be in status 'cancelling' for up to 10 minutes, before changing to 'cancelled', where it will have partial results (if any) available in the output file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the batch to cancel. ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Batch is cancelling. Returns the cancelling batch's details.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createBatch operation
#
##############################################################################
print_createBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createBatch - Creates and executes a batch from an uploaded file of requests${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Batch created successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listBatches operation
#
##############################################################################
print_listBatches_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listBatches - List your organization's batches.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Batch listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveBatch operation
#
##############################################################################
print_retrieveBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveBatch - Retrieves a batch.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the batch to retrieve. ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Batch retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createChatCompletion operation
#
##############################################################################
print_createChatCompletion_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createChatCompletion - Creates a model response for the given chat conversation. Learn more in the
[text generation](/docs/guides/text-generation), [vision](/docs/guides/vision),
and [audio](/docs/guides/audio) guides.

Parameter support can differ depending on the model used to generate the
response, particularly for newer reasoning models. Parameters that are only
supported for reasoning models are noted below. For the current state of 
unsupported parameters in reasoning models, 
[refer to the reasoning guide](/docs/guides/reasoning).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createCompletion operation
#
##############################################################################
print_createCompletion_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createCompletion - Creates a completion for the provided prompt and parameters.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adminApiKeysCreate operation
#
##############################################################################
print_adminApiKeysCreate_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adminApiKeysCreate - Create an organization admin API key${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new admin-level API key for the organization." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The newly created admin API key.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adminApiKeysDelete operation
#
##############################################################################
print_adminApiKeysDelete_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adminApiKeysDelete - Delete an organization admin API key${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete the specified admin API key." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}key_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} -  ${YELLOW}Specify as: key_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Confirmation that the API key was deleted.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adminApiKeysGet operation
#
##############################################################################
print_adminApiKeysGet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adminApiKeysGet - Retrieve a single organization API key${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get details for a specific organization API key by its ID." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}key_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} -  ${YELLOW}Specify as: key_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Details of the requested API key.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for adminApiKeysList operation
#
##############################################################################
print_adminApiKeysList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}adminApiKeysList - List organization API keys${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Retrieve a paginated list of organization admin API keys." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - ${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: asc)${OFF} - ${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - ${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;A list of organization API keys.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createEmbedding operation
#
##############################################################################
print_createEmbedding_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createEmbedding - Creates an embedding vector representing the input text.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createFile operation
#
##############################################################################
print_createFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createFile - Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.

The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.

The Fine-tuning API only supports '.jsonl' files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.

The Batch API only supports '.jsonl' files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).

Please [contact us](https://help.openai.com/) if you need to increase these storage limits.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteFile operation
#
##############################################################################
print_deleteFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteFile - Delete a file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file to use for this request. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for downloadFile operation
#
##############################################################################
print_downloadFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}downloadFile - Returns the contents of the specified file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file to use for this request. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listFiles operation
#
##############################################################################
print_listFiles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listFiles - Returns a list of files.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}purpose${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Only return files with the given purpose.${YELLOW} Specify as: purpose=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 10000)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveFile operation
#
##############################################################################
print_retrieveFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveFile - Returns information about a specific file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file to use for this request. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for cancelFineTuningJob operation
#
##############################################################################
print_cancelFineTuningJob_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelFineTuningJob - Immediately cancel a fine-tune job.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}fine_tuning_job_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the fine-tuning job to cancel. ${YELLOW}Specify as: fine_tuning_job_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createFineTuningJob operation
#
##############################################################################
print_createFineTuningJob_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.

Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.

[Learn more about fine-tuning](/docs/guides/fine-tuning)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listFineTuningEvents operation
#
##############################################################################
print_listFineTuningEvents_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listFineTuningEvents - Get status updates for a fine-tuning job.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}fine_tuning_job_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the fine-tuning job to get events for. ${YELLOW}Specify as: fine_tuning_job_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Identifier for the last event from the previous pagination request.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - Number of events to retrieve.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listFineTuningJobCheckpoints operation
#
##############################################################################
print_listFineTuningJobCheckpoints_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listFineTuningJobCheckpoints - List checkpoints for a fine-tuning job.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}fine_tuning_job_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the fine-tuning job to get checkpoints for. ${YELLOW}Specify as: fine_tuning_job_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Identifier for the last checkpoint ID from the previous pagination request.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 10)${OFF} - Number of checkpoints to retrieve.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listPaginatedFineTuningJobs operation
#
##############################################################################
print_listPaginatedFineTuningJobs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listPaginatedFineTuningJobs - List your organization's fine-tuning jobs${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Identifier for the last job from the previous pagination request.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - Number of fine-tuning jobs to retrieve.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveFineTuningJob operation
#
##############################################################################
print_retrieveFineTuningJob_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveFineTuningJob - Get info about a fine-tuning job.

[Learn more about fine-tuning](/docs/guides/fine-tuning)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}fine_tuning_job_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the fine-tuning job. ${YELLOW}Specify as: fine_tuning_job_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createImage operation
#
##############################################################################
print_createImage_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createImage - Creates an image given a prompt.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createImageEdit operation
#
##############################################################################
print_createImageEdit_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createImageEdit - Creates an edited or extended image given an original image and a prompt.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createImageVariation operation
#
##############################################################################
print_createImageVariation_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createImageVariation - Creates a variation of a given image.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteInvite operation
#
##############################################################################
print_deleteInvite_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteInvite - Delete an invite. If the invite has already been accepted, it cannot be deleted.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}invite_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the invite to delete. ${YELLOW}Specify as: invite_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Invite deleted successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for inviteUser operation
#
##############################################################################
print_inviteUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}inviteUser - Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The invite request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User invited successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listInvites operation
#
##############################################################################
print_listInvites_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listInvites - Returns a list of invites in the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Invites listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveInvite operation
#
##############################################################################
print_retrieveInvite_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveInvite - Retrieves an invite.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}invite_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the invite to retrieve. ${YELLOW}Specify as: invite_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Invite retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteModel operation
#
##############################################################################
print_deleteModel_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteModel - Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}model${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The model to delete ${YELLOW}Specify as: model=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listModels operation
#
##############################################################################
print_listModels_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveModel operation
#
##############################################################################
print_retrieveModel_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}model${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the model to use for this request ${YELLOW}Specify as: model=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createModeration operation
#
##############################################################################
print_createModeration_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createModeration - Classifies if text and/or image inputs are potentially harmful. Learn
more in the [moderation guide](/docs/guides/moderation).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for archiveProject operation
#
##############################################################################
print_archiveProject_help() {
    echo ""
    echo -e "${BOLD}${WHITE}archiveProject - Archives a project in the organization. Archived projects cannot be used or updated.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project archived successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createProject operation
#
##############################################################################
print_createProject_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createProject - Create a new project in the organization. Projects can be created and archived, but cannot be deleted.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project create request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project created successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createProjectServiceAccount operation
#
##############################################################################
print_createProjectServiceAccount_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createProjectServiceAccount - Creates a new service account in the project. This also returns an unredacted API key for the service account.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project service account create request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project service account created successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response when project is archived.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createProjectUser operation
#
##############################################################################
print_createProjectUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createProjectUser - Adds a user to the project. Users must already be members of the organization to be added to a project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project user create request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User added to project successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response for various conditions.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteProjectApiKey operation
#
##############################################################################
print_deleteProjectApiKey_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteProjectApiKey - Deletes an API key from the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}key_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the API key. ${YELLOW}Specify as: key_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project API key deleted successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response for various conditions.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteProjectServiceAccount operation
#
##############################################################################
print_deleteProjectServiceAccount_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteProjectServiceAccount - Deletes a service account from the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the service account. ${YELLOW}Specify as: service_account_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project service account deleted successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteProjectUser operation
#
##############################################################################
print_deleteProjectUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteProjectUser - Deletes a user from the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project user deleted successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response for various conditions.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listProjectApiKeys operation
#
##############################################################################
print_listProjectApiKeys_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listProjectApiKeys - Returns a list of API keys in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project API keys listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listProjectRateLimits operation
#
##############################################################################
print_listProjectRateLimits_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listProjectRateLimits - Returns the rate limits per model for a project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 100)${OFF} - A limit on the number of objects to be returned. The default is 100.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project rate limits listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listProjectServiceAccounts operation
#
##############################################################################
print_listProjectServiceAccounts_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listProjectServiceAccounts - Returns a list of service accounts in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project service accounts listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response when project is archived.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listProjectUsers operation
#
##############################################################################
print_listProjectUsers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listProjectUsers - Returns a list of users in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project users listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response when project is archived.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listProjects operation
#
##############################################################################
print_listProjects_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listProjects - Returns a list of projects.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include_archived${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: false)${OFF} - If 'true' returns all projects including those that have been 'archived'. Archived projects are not included by default.${YELLOW} Specify as: include_archived=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Projects listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyProject operation
#
##############################################################################
print_modifyProject_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyProject - Modifies a project in the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project update request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project updated successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response when updating the default project.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyProjectUser operation
#
##############################################################################
print_modifyProjectUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyProjectUser - Modifies a user's role in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project user update request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project user's role updated successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response for various conditions.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveProject operation
#
##############################################################################
print_retrieveProject_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveProject - Retrieves a project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveProjectApiKey operation
#
##############################################################################
print_retrieveProjectApiKey_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveProjectApiKey - Retrieves an API key in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}key_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the API key. ${YELLOW}Specify as: key_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project API key retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveProjectServiceAccount operation
#
##############################################################################
print_retrieveProjectServiceAccount_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveProjectServiceAccount - Retrieves a service account in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}service_account_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the service account. ${YELLOW}Specify as: service_account_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project service account retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveProjectUser operation
#
##############################################################################
print_retrieveProjectUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveProjectUser - Retrieves a user in the project.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project user retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateProjectRateLimits operation
#
##############################################################################
print_updateProjectRateLimits_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateProjectRateLimits - Updates a project rate limit.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}project_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the project. ${YELLOW}Specify as: project_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}rate_limit_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the rate limit. ${YELLOW}Specify as: rate_limit_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The project rate limit update request payload." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Project rate limit updated successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=400
    echo -e "${result_color_table[${code:0:1}]}  400;Error response for various conditions.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createRealtimeSession operation
#
##############################################################################
print_createRealtimeSession_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createRealtimeSession - Create an ephemeral API token for use in client-side applications with the
Realtime API. Can be configured with the same session parameters as the
'session.update' client event.

It responds with a session object, plus a 'client_secret' key which contains
a usable ephemeral API token that can be used to authenticate browser clients
for the Realtime API.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Create an ephemeral API key with the given session configuration." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Session created successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addUploadPart operation
#
##############################################################################
print_addUploadPart_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addUploadPart - Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload. 

Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.

It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}upload_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the Upload. ${YELLOW}Specify as: upload_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for cancelUpload operation
#
##############################################################################
print_cancelUpload_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelUpload - Cancels the Upload. No Parts may be added after an Upload is cancelled.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}upload_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the Upload. ${YELLOW}Specify as: upload_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for completeUpload operation
#
##############################################################################
print_completeUpload_help() {
    echo ""
    echo -e "${BOLD}${WHITE}completeUpload - Completes the [Upload](/docs/api-reference/uploads/object). 

Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.

You can specify the order of the Parts by passing in an ordered list of the Part IDs.

The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}upload_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the Upload. ${YELLOW}Specify as: upload_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createUpload operation
#
##############################################################################
print_createUpload_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createUpload - Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.

Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.

For certain 'purpose's, the correct 'mime_type' must be specified. Please refer to documentation for the supported MIME types for your use case:
- [Assistants](/docs/assistants/tools/file-search#supported-files)

For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageAudioSpeeches operation
#
##############################################################################
print_usageAudioSpeeches_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageAudioSpeeches - Get audio speeches usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageAudioTranscriptions operation
#
##############################################################################
print_usageAudioTranscriptions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageAudioTranscriptions - Get audio transcriptions usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageCodeInterpreterSessions operation
#
##############################################################################
print_usageCodeInterpreterSessions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageCodeInterpreterSessions - Get code interpreter sessions usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id'.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageCompletions operation
#
##############################################################################
print_usageCompletions_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageCompletions - Get completions usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}batch${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - If 'true', return batch jobs only. If 'false', return non-batch jobs only. By default, return both.${YELLOW} Specify as: batch=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model', 'batch' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageCosts operation
#
##############################################################################
print_usageCosts_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageCosts - Get costs details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently only '1d' is supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only costs for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the costs by the specified fields. Support fields include 'project_id', 'line_item' and any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 7)${OFF} - A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Costs data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageEmbeddings operation
#
##############################################################################
print_usageEmbeddings_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageEmbeddings - Get embeddings usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageImages operation
#
##############################################################################
print_usageImages_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageImages - Get images usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sources${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usages for these sources. Possible values are 'image.generation', 'image.edit', 'image.variation' or any combination of them.${YELLOW} Specify as: sources=value1 sources=value2 sources=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sizes${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usages for these image sizes. Possible values are '256x256', '512x512', '1024x1024', '1792x1792', '1024x1792' or any combination of them.${YELLOW} Specify as: sizes=value1 sizes=value2 sizes=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model', 'size', 'source' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageModerations operation
#
##############################################################################
print_usageModerations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageModerations - Get moderations usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}user_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these users.${YELLOW} Specify as: user_ids=value1 user_ids=value2 user_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}api_key_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these API keys.${YELLOW} Specify as: api_key_ids=value1 api_key_ids=value2 api_key_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}models${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these models.${YELLOW} Specify as: models=value1 models=value2 models=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for usageVectorStores operation
#
##############################################################################
print_usageVectorStores_help() {
    echo ""
    echo -e "${BOLD}${WHITE}usageVectorStores - Get vector stores usage details for the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Start time (Unix seconds) of the query time range, inclusive.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - End time (Unix seconds) of the query time range, exclusive.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}bucket_width${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: 1d)${OFF} - Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'.${YELLOW} Specify as: bucket_width=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}project_ids${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Return only usage for these projects.${YELLOW} Specify as: project_ids=value1 project_ids=value2 project_ids=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_by${OFF} ${BLUE}[array[string]]${OFF} ${CYAN}(default: null)${OFF} - Group the usage data by the specified fields. Support fields include 'project_id'.${YELLOW} Specify as: group_by=value1 group_by=value2 group_by=...${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}page${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response.${YELLOW} Specify as: page=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Usage data retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteUser operation
#
##############################################################################
print_deleteUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteUser - Deletes a user from the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User deleted successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listUsers operation
#
##############################################################################
print_listUsers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listUsers - Lists all of the users in the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Users listed successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyUser operation
#
##############################################################################
print_modifyUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyUser - Modifies a user's role in the organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - The new user role to modify. This must be one of 'owner' or 'member'." | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User role updated successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for retrieveUser operation
#
##############################################################################
print_retrieveUser_help() {
    echo ""
    echo -e "${BOLD}${WHITE}retrieveUser - Retrieves a user by their identifier.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}user_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the user. ${YELLOW}Specify as: user_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User retrieved successfully.${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for cancelVectorStoreFileBatch operation
#
##############################################################################
print_cancelVectorStoreFileBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}cancelVectorStoreFileBatch - Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the file batch belongs to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file batch to cancel. ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createVectorStore operation
#
##############################################################################
print_createVectorStore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createVectorStore - Create a vector store.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createVectorStoreFile operation
#
##############################################################################
print_createVectorStoreFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createVectorStoreFile - Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store for which to create a File. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createVectorStoreFileBatch operation
#
##############################################################################
print_createVectorStoreFileBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createVectorStoreFileBatch - Create a vector store file batch.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store for which to create a File Batch. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteVectorStore operation
#
##############################################################################
print_deleteVectorStore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteVectorStore - Delete a vector store.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store to delete. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteVectorStoreFile operation
#
##############################################################################
print_deleteVectorStoreFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteVectorStoreFile - Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the file belongs to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file to delete. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVectorStore operation
#
##############################################################################
print_getVectorStore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVectorStore - Retrieves a vector store.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store to retrieve. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVectorStoreFile operation
#
##############################################################################
print_getVectorStoreFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVectorStoreFile - Retrieves a vector store file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the file belongs to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file being retrieved. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVectorStoreFileBatch operation
#
##############################################################################
print_getVectorStoreFileBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVectorStoreFileBatch - Retrieves a vector store file batch.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the file batch belongs to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file batch being retrieved. ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listFilesInVectorStoreBatch operation
#
##############################################################################
print_listFilesInVectorStoreBatch_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listFilesInVectorStoreBatch - Returns a list of vector store files in a batch.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the files belong to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}batch_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file batch that the files belong to. ${YELLOW}Specify as: batch_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter by file status. One of 'in_progress', 'completed', 'failed', 'cancelled'.${YELLOW} Specify as: filter=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listVectorStoreFiles operation
#
##############################################################################
print_listVectorStoreFiles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listVectorStoreFiles - Returns a list of vector store files.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store that the files belong to. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}filter${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Filter by file status. One of 'in_progress', 'completed', 'failed', 'cancelled'.${YELLOW} Specify as: filter=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listVectorStores operation
#
##############################################################################
print_listVectorStores_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listVectorStores - Returns a list of vector stores.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyVectorStore operation
#
##############################################################################
print_modifyVectorStore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyVectorStore - Modifies a vector store.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vector_store_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the vector store to modify. ${YELLOW}Specify as: vector_store_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call cancelRun operation
#
##############################################################################
call_cancelRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createAssistant operation
#
##############################################################################
call_createAssistant() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createMessage operation
#
##############################################################################
call_createMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createRun operation
#
##############################################################################
call_createRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include[]  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createThread operation
#
##############################################################################
call_createThread() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createThreadAndRun operation
#
##############################################################################
call_createThreadAndRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/runs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteAssistant operation
#
##############################################################################
call_deleteAssistant() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteMessage operation
#
##############################################################################
call_deleteMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteThread operation
#
##############################################################################
call_deleteThread() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAssistant operation
#
##############################################################################
call_getAssistant() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getMessage operation
#
##############################################################################
call_getMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getRun operation
#
##############################################################################
call_getRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getRunStep operation
#
##############################################################################
call_getRunStep() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id step_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(include[]  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getThread operation
#
##############################################################################
call_getThread() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listAssistants operation
#
##############################################################################
call_listAssistants() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before  )
    local path

    if ! path=$(build_request_path "/v1/assistants" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listMessages operation
#
##############################################################################
call_listMessages() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before run_id  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listRunSteps operation
#
##############################################################################
call_listRunSteps() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before include[]  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}/steps" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listRuns operation
#
##############################################################################
call_listRuns() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call modifyAssistant operation
#
##############################################################################
call_modifyAssistant() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call modifyMessage operation
#
##############################################################################
call_modifyMessage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages/{message_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call modifyRun operation
#
##############################################################################
call_modifyRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call modifyThread operation
#
##############################################################################
call_modifyThread() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call submitToolOuputsToRun operation
#
##############################################################################
call_submitToolOuputsToRun() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id run_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createSpeech operation
#
##############################################################################
call_createSpeech() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/audio/speech" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createTranscription operation
#
##############################################################################
call_createTranscription() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/audio/transcriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createTranslation operation
#
##############################################################################
call_createTranslation() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/audio/translations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listAuditLogs operation
#
##############################################################################
call_listAuditLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(effective_at project_ids[] event_types[] actor_ids[] actor_emails[] resource_ids[] limit after before  )
    local path

    if ! path=$(build_request_path "/v1/organization/audit_logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call cancelBatch operation
#
##############################################################################
call_cancelBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/batches/{batch_id}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createBatch operation
#
##############################################################################
call_createBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/batches" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call listBatches operation
#
##############################################################################
call_listBatches() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(after limit  )
    local path

    if ! path=$(build_request_path "/v1/batches" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveBatch operation
#
##############################################################################
call_retrieveBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/batches/{batch_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createChatCompletion operation
#
##############################################################################
call_createChatCompletion() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/chat/completions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createCompletion operation
#
##############################################################################
call_createCompletion() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/completions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adminApiKeysCreate operation
#
##############################################################################
call_adminApiKeysCreate() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/admin_api_keys" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call adminApiKeysDelete operation
#
##############################################################################
call_adminApiKeysDelete() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(key_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/admin_api_keys/{key_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adminApiKeysGet operation
#
##############################################################################
call_adminApiKeysGet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(key_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/admin_api_keys/{key_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call adminApiKeysList operation
#
##############################################################################
call_adminApiKeysList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(after order limit  )
    local path

    if ! path=$(build_request_path "/v1/organization/admin_api_keys" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createEmbedding operation
#
##############################################################################
call_createEmbedding() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/embeddings" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createFile operation
#
##############################################################################
call_createFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/files" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteFile operation
#
##############################################################################
call_deleteFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/files/{file_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call downloadFile operation
#
##############################################################################
call_downloadFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/files/{file_id}/content" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listFiles operation
#
##############################################################################
call_listFiles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(purpose limit order after  )
    local path

    if ! path=$(build_request_path "/v1/files" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveFile operation
#
##############################################################################
call_retrieveFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/files/{file_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call cancelFineTuningJob operation
#
##############################################################################
call_cancelFineTuningJob() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(fine_tuning_job_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createFineTuningJob operation
#
##############################################################################
call_createFineTuningJob() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call listFineTuningEvents operation
#
##############################################################################
call_listFineTuningEvents() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(fine_tuning_job_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(after limit  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs/{fine_tuning_job_id}/events" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listFineTuningJobCheckpoints operation
#
##############################################################################
call_listFineTuningJobCheckpoints() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(fine_tuning_job_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(after limit  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listPaginatedFineTuningJobs operation
#
##############################################################################
call_listPaginatedFineTuningJobs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(after limit  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveFineTuningJob operation
#
##############################################################################
call_retrieveFineTuningJob() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(fine_tuning_job_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/fine_tuning/jobs/{fine_tuning_job_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createImage operation
#
##############################################################################
call_createImage() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/images/generations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createImageEdit operation
#
##############################################################################
call_createImageEdit() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/images/edits" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createImageVariation operation
#
##############################################################################
call_createImageVariation() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/images/variations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteInvite operation
#
##############################################################################
call_deleteInvite() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(invite_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/invites/{invite_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call inviteUser operation
#
##############################################################################
call_inviteUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/invites" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call listInvites operation
#
##############################################################################
call_listInvites() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after  )
    local path

    if ! path=$(build_request_path "/v1/organization/invites" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveInvite operation
#
##############################################################################
call_retrieveInvite() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(invite_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/invites/{invite_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteModel operation
#
##############################################################################
call_deleteModel() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(model)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/models/{model}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listModels operation
#
##############################################################################
call_listModels() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/models" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveModel operation
#
##############################################################################
call_retrieveModel() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(model)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/models/{model}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createModeration operation
#
##############################################################################
call_createModeration() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/moderations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call archiveProject operation
#
##############################################################################
call_archiveProject() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/archive" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createProject operation
#
##############################################################################
call_createProject() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createProjectServiceAccount operation
#
##############################################################################
call_createProjectServiceAccount() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/service_accounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createProjectUser operation
#
##############################################################################
call_createProjectUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteProjectApiKey operation
#
##############################################################################
call_deleteProjectApiKey() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id key_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/api_keys/{key_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteProjectServiceAccount operation
#
##############################################################################
call_deleteProjectServiceAccount() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id service_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteProjectUser operation
#
##############################################################################
call_deleteProjectUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listProjectApiKeys operation
#
##############################################################################
call_listProjectApiKeys() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/api_keys" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listProjectRateLimits operation
#
##############################################################################
call_listProjectRateLimits() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after before  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/rate_limits" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listProjectServiceAccounts operation
#
##############################################################################
call_listProjectServiceAccounts() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/service_accounts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listProjectUsers operation
#
##############################################################################
call_listProjectUsers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listProjects operation
#
##############################################################################
call_listProjects() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after include_archived  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call modifyProject operation
#
##############################################################################
call_modifyProject() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call modifyProjectUser operation
#
##############################################################################
call_modifyProjectUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call retrieveProject operation
#
##############################################################################
call_retrieveProject() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveProjectApiKey operation
#
##############################################################################
call_retrieveProjectApiKey() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id key_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/api_keys/{key_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveProjectServiceAccount operation
#
##############################################################################
call_retrieveProjectServiceAccount() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id service_account_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/service_accounts/{service_account_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call retrieveProjectUser operation
#
##############################################################################
call_retrieveProjectUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateProjectRateLimits operation
#
##############################################################################
call_updateProjectRateLimits() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(project_id rate_limit_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createRealtimeSession operation
#
##############################################################################
call_createRealtimeSession() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/realtime/sessions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call addUploadPart operation
#
##############################################################################
call_addUploadPart() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(upload_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/uploads/{upload_id}/parts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    body_form_urlencoded=$(body_parameters_to_form_urlencoded)
    if [[ "$print_curl" = true ]]; then
        echo "curl ${body_form_urlencoded} ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${body_form_urlencoded} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call cancelUpload operation
#
##############################################################################
call_cancelUpload() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(upload_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/uploads/{upload_id}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call completeUpload operation
#
##############################################################################
call_completeUpload() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(upload_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/uploads/{upload_id}/complete" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createUpload operation
#
##############################################################################
call_createUpload() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/uploads" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call usageAudioSpeeches operation
#
##############################################################################
call_usageAudioSpeeches() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids user_ids api_key_ids models group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/audio_speeches" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageAudioTranscriptions operation
#
##############################################################################
call_usageAudioTranscriptions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids user_ids api_key_ids models group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/audio_transcriptions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageCodeInterpreterSessions operation
#
##############################################################################
call_usageCodeInterpreterSessions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/code_interpreter_sessions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageCompletions operation
#
##############################################################################
call_usageCompletions() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids user_ids api_key_ids models batch group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/completions" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageCosts operation
#
##############################################################################
call_usageCosts() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/costs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageEmbeddings operation
#
##############################################################################
call_usageEmbeddings() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids user_ids api_key_ids models group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/embeddings" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageImages operation
#
##############################################################################
call_usageImages() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width sources sizes project_ids user_ids api_key_ids models group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/images" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageModerations operation
#
##############################################################################
call_usageModerations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids user_ids api_key_ids models group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/moderations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call usageVectorStores operation
#
##############################################################################
call_usageVectorStores() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(start_time end_time bucket_width project_ids group_by limit page  )
    local path

    if ! path=$(build_request_path "/v1/organization/usage/vector_stores" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteUser operation
#
##############################################################################
call_deleteUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listUsers operation
#
##############################################################################
call_listUsers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit after  )
    local path

    if ! path=$(build_request_path "/v1/organization/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call modifyUser operation
#
##############################################################################
call_modifyUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call retrieveUser operation
#
##############################################################################
call_retrieveUser() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(user_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/organization/users/{user_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call cancelVectorStoreFileBatch operation
#
##############################################################################
call_cancelVectorStoreFileBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createVectorStore operation
#
##############################################################################
call_createVectorStore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createVectorStoreFile operation
#
##############################################################################
call_createVectorStoreFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/files" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createVectorStoreFileBatch operation
#
##############################################################################
call_createVectorStoreFileBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/file_batches" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteVectorStore operation
#
##############################################################################
call_deleteVectorStore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteVectorStoreFile operation
#
##############################################################################
call_deleteVectorStoreFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/files/{file_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVectorStore operation
#
##############################################################################
call_getVectorStore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVectorStoreFile operation
#
##############################################################################
call_getVectorStoreFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/files/{file_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVectorStoreFileBatch operation
#
##############################################################################
call_getVectorStoreFileBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listFilesInVectorStoreBatch operation
#
##############################################################################
call_listFilesInVectorStoreBatch() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id batch_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before filter  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listVectorStoreFiles operation
#
##############################################################################
call_listVectorStoreFiles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before filter  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}/files" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listVectorStores operation
#
##############################################################################
call_listVectorStores() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call modifyVectorStore operation
#
##############################################################################
call_modifyVectorStore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vector_store_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/vector_stores/{vector_store_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambiguously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    cancelRun)
    operation="cancelRun"
    ;;
    createAssistant)
    operation="createAssistant"
    ;;
    createMessage)
    operation="createMessage"
    ;;
    createRun)
    operation="createRun"
    ;;
    createThread)
    operation="createThread"
    ;;
    createThreadAndRun)
    operation="createThreadAndRun"
    ;;
    deleteAssistant)
    operation="deleteAssistant"
    ;;
    deleteMessage)
    operation="deleteMessage"
    ;;
    deleteThread)
    operation="deleteThread"
    ;;
    getAssistant)
    operation="getAssistant"
    ;;
    getMessage)
    operation="getMessage"
    ;;
    getRun)
    operation="getRun"
    ;;
    getRunStep)
    operation="getRunStep"
    ;;
    getThread)
    operation="getThread"
    ;;
    listAssistants)
    operation="listAssistants"
    ;;
    listMessages)
    operation="listMessages"
    ;;
    listRunSteps)
    operation="listRunSteps"
    ;;
    listRuns)
    operation="listRuns"
    ;;
    modifyAssistant)
    operation="modifyAssistant"
    ;;
    modifyMessage)
    operation="modifyMessage"
    ;;
    modifyRun)
    operation="modifyRun"
    ;;
    modifyThread)
    operation="modifyThread"
    ;;
    submitToolOuputsToRun)
    operation="submitToolOuputsToRun"
    ;;
    createSpeech)
    operation="createSpeech"
    ;;
    createTranscription)
    operation="createTranscription"
    ;;
    createTranslation)
    operation="createTranslation"
    ;;
    listAuditLogs)
    operation="listAuditLogs"
    ;;
    cancelBatch)
    operation="cancelBatch"
    ;;
    createBatch)
    operation="createBatch"
    ;;
    listBatches)
    operation="listBatches"
    ;;
    retrieveBatch)
    operation="retrieveBatch"
    ;;
    createChatCompletion)
    operation="createChatCompletion"
    ;;
    createCompletion)
    operation="createCompletion"
    ;;
    adminApiKeysCreate)
    operation="adminApiKeysCreate"
    ;;
    adminApiKeysDelete)
    operation="adminApiKeysDelete"
    ;;
    adminApiKeysGet)
    operation="adminApiKeysGet"
    ;;
    adminApiKeysList)
    operation="adminApiKeysList"
    ;;
    createEmbedding)
    operation="createEmbedding"
    ;;
    createFile)
    operation="createFile"
    ;;
    deleteFile)
    operation="deleteFile"
    ;;
    downloadFile)
    operation="downloadFile"
    ;;
    listFiles)
    operation="listFiles"
    ;;
    retrieveFile)
    operation="retrieveFile"
    ;;
    cancelFineTuningJob)
    operation="cancelFineTuningJob"
    ;;
    createFineTuningJob)
    operation="createFineTuningJob"
    ;;
    listFineTuningEvents)
    operation="listFineTuningEvents"
    ;;
    listFineTuningJobCheckpoints)
    operation="listFineTuningJobCheckpoints"
    ;;
    listPaginatedFineTuningJobs)
    operation="listPaginatedFineTuningJobs"
    ;;
    retrieveFineTuningJob)
    operation="retrieveFineTuningJob"
    ;;
    createImage)
    operation="createImage"
    ;;
    createImageEdit)
    operation="createImageEdit"
    ;;
    createImageVariation)
    operation="createImageVariation"
    ;;
    deleteInvite)
    operation="deleteInvite"
    ;;
    inviteUser)
    operation="inviteUser"
    ;;
    listInvites)
    operation="listInvites"
    ;;
    retrieveInvite)
    operation="retrieveInvite"
    ;;
    deleteModel)
    operation="deleteModel"
    ;;
    listModels)
    operation="listModels"
    ;;
    retrieveModel)
    operation="retrieveModel"
    ;;
    createModeration)
    operation="createModeration"
    ;;
    archiveProject)
    operation="archiveProject"
    ;;
    createProject)
    operation="createProject"
    ;;
    createProjectServiceAccount)
    operation="createProjectServiceAccount"
    ;;
    createProjectUser)
    operation="createProjectUser"
    ;;
    deleteProjectApiKey)
    operation="deleteProjectApiKey"
    ;;
    deleteProjectServiceAccount)
    operation="deleteProjectServiceAccount"
    ;;
    deleteProjectUser)
    operation="deleteProjectUser"
    ;;
    listProjectApiKeys)
    operation="listProjectApiKeys"
    ;;
    listProjectRateLimits)
    operation="listProjectRateLimits"
    ;;
    listProjectServiceAccounts)
    operation="listProjectServiceAccounts"
    ;;
    listProjectUsers)
    operation="listProjectUsers"
    ;;
    listProjects)
    operation="listProjects"
    ;;
    modifyProject)
    operation="modifyProject"
    ;;
    modifyProjectUser)
    operation="modifyProjectUser"
    ;;
    retrieveProject)
    operation="retrieveProject"
    ;;
    retrieveProjectApiKey)
    operation="retrieveProjectApiKey"
    ;;
    retrieveProjectServiceAccount)
    operation="retrieveProjectServiceAccount"
    ;;
    retrieveProjectUser)
    operation="retrieveProjectUser"
    ;;
    updateProjectRateLimits)
    operation="updateProjectRateLimits"
    ;;
    createRealtimeSession)
    operation="createRealtimeSession"
    ;;
    addUploadPart)
    operation="addUploadPart"
    ;;
    cancelUpload)
    operation="cancelUpload"
    ;;
    completeUpload)
    operation="completeUpload"
    ;;
    createUpload)
    operation="createUpload"
    ;;
    usageAudioSpeeches)
    operation="usageAudioSpeeches"
    ;;
    usageAudioTranscriptions)
    operation="usageAudioTranscriptions"
    ;;
    usageCodeInterpreterSessions)
    operation="usageCodeInterpreterSessions"
    ;;
    usageCompletions)
    operation="usageCompletions"
    ;;
    usageCosts)
    operation="usageCosts"
    ;;
    usageEmbeddings)
    operation="usageEmbeddings"
    ;;
    usageImages)
    operation="usageImages"
    ;;
    usageModerations)
    operation="usageModerations"
    ;;
    usageVectorStores)
    operation="usageVectorStores"
    ;;
    deleteUser)
    operation="deleteUser"
    ;;
    listUsers)
    operation="listUsers"
    ;;
    modifyUser)
    operation="modifyUser"
    ;;
    retrieveUser)
    operation="retrieveUser"
    ;;
    cancelVectorStoreFileBatch)
    operation="cancelVectorStoreFileBatch"
    ;;
    createVectorStore)
    operation="createVectorStore"
    ;;
    createVectorStoreFile)
    operation="createVectorStoreFile"
    ;;
    createVectorStoreFileBatch)
    operation="createVectorStoreFileBatch"
    ;;
    deleteVectorStore)
    operation="deleteVectorStore"
    ;;
    deleteVectorStoreFile)
    operation="deleteVectorStoreFile"
    ;;
    getVectorStore)
    operation="getVectorStore"
    ;;
    getVectorStoreFile)
    operation="getVectorStoreFile"
    ;;
    getVectorStoreFileBatch)
    operation="getVectorStoreFileBatch"
    ;;
    listFilesInVectorStoreBatch)
    operation="listFilesInVectorStoreBatch"
    ;;
    listVectorStoreFiles)
    operation="listVectorStoreFiles"
    ;;
    listVectorStores)
    operation="listVectorStores"
    ;;
    modifyVectorStore)
    operation="modifyVectorStore"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    --body=*)
    # Parse value of body as argument and convert it into only
    # the raw body content
    if [[ "$operation" ]]; then
        IFS='--body=' read -r body_value <<< "$key"
        body_value=${body_value##--body=}
        body_parameters["RAW_BODY"]="${body_value}"
        RAW_BODY=1
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without quotes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +([^=]):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    cancelRun)
    call_cancelRun
    ;;
    createAssistant)
    call_createAssistant
    ;;
    createMessage)
    call_createMessage
    ;;
    createRun)
    call_createRun
    ;;
    createThread)
    call_createThread
    ;;
    createThreadAndRun)
    call_createThreadAndRun
    ;;
    deleteAssistant)
    call_deleteAssistant
    ;;
    deleteMessage)
    call_deleteMessage
    ;;
    deleteThread)
    call_deleteThread
    ;;
    getAssistant)
    call_getAssistant
    ;;
    getMessage)
    call_getMessage
    ;;
    getRun)
    call_getRun
    ;;
    getRunStep)
    call_getRunStep
    ;;
    getThread)
    call_getThread
    ;;
    listAssistants)
    call_listAssistants
    ;;
    listMessages)
    call_listMessages
    ;;
    listRunSteps)
    call_listRunSteps
    ;;
    listRuns)
    call_listRuns
    ;;
    modifyAssistant)
    call_modifyAssistant
    ;;
    modifyMessage)
    call_modifyMessage
    ;;
    modifyRun)
    call_modifyRun
    ;;
    modifyThread)
    call_modifyThread
    ;;
    submitToolOuputsToRun)
    call_submitToolOuputsToRun
    ;;
    createSpeech)
    call_createSpeech
    ;;
    createTranscription)
    call_createTranscription
    ;;
    createTranslation)
    call_createTranslation
    ;;
    listAuditLogs)
    call_listAuditLogs
    ;;
    cancelBatch)
    call_cancelBatch
    ;;
    createBatch)
    call_createBatch
    ;;
    listBatches)
    call_listBatches
    ;;
    retrieveBatch)
    call_retrieveBatch
    ;;
    createChatCompletion)
    call_createChatCompletion
    ;;
    createCompletion)
    call_createCompletion
    ;;
    adminApiKeysCreate)
    call_adminApiKeysCreate
    ;;
    adminApiKeysDelete)
    call_adminApiKeysDelete
    ;;
    adminApiKeysGet)
    call_adminApiKeysGet
    ;;
    adminApiKeysList)
    call_adminApiKeysList
    ;;
    createEmbedding)
    call_createEmbedding
    ;;
    createFile)
    call_createFile
    ;;
    deleteFile)
    call_deleteFile
    ;;
    downloadFile)
    call_downloadFile
    ;;
    listFiles)
    call_listFiles
    ;;
    retrieveFile)
    call_retrieveFile
    ;;
    cancelFineTuningJob)
    call_cancelFineTuningJob
    ;;
    createFineTuningJob)
    call_createFineTuningJob
    ;;
    listFineTuningEvents)
    call_listFineTuningEvents
    ;;
    listFineTuningJobCheckpoints)
    call_listFineTuningJobCheckpoints
    ;;
    listPaginatedFineTuningJobs)
    call_listPaginatedFineTuningJobs
    ;;
    retrieveFineTuningJob)
    call_retrieveFineTuningJob
    ;;
    createImage)
    call_createImage
    ;;
    createImageEdit)
    call_createImageEdit
    ;;
    createImageVariation)
    call_createImageVariation
    ;;
    deleteInvite)
    call_deleteInvite
    ;;
    inviteUser)
    call_inviteUser
    ;;
    listInvites)
    call_listInvites
    ;;
    retrieveInvite)
    call_retrieveInvite
    ;;
    deleteModel)
    call_deleteModel
    ;;
    listModels)
    call_listModels
    ;;
    retrieveModel)
    call_retrieveModel
    ;;
    createModeration)
    call_createModeration
    ;;
    archiveProject)
    call_archiveProject
    ;;
    createProject)
    call_createProject
    ;;
    createProjectServiceAccount)
    call_createProjectServiceAccount
    ;;
    createProjectUser)
    call_createProjectUser
    ;;
    deleteProjectApiKey)
    call_deleteProjectApiKey
    ;;
    deleteProjectServiceAccount)
    call_deleteProjectServiceAccount
    ;;
    deleteProjectUser)
    call_deleteProjectUser
    ;;
    listProjectApiKeys)
    call_listProjectApiKeys
    ;;
    listProjectRateLimits)
    call_listProjectRateLimits
    ;;
    listProjectServiceAccounts)
    call_listProjectServiceAccounts
    ;;
    listProjectUsers)
    call_listProjectUsers
    ;;
    listProjects)
    call_listProjects
    ;;
    modifyProject)
    call_modifyProject
    ;;
    modifyProjectUser)
    call_modifyProjectUser
    ;;
    retrieveProject)
    call_retrieveProject
    ;;
    retrieveProjectApiKey)
    call_retrieveProjectApiKey
    ;;
    retrieveProjectServiceAccount)
    call_retrieveProjectServiceAccount
    ;;
    retrieveProjectUser)
    call_retrieveProjectUser
    ;;
    updateProjectRateLimits)
    call_updateProjectRateLimits
    ;;
    createRealtimeSession)
    call_createRealtimeSession
    ;;
    addUploadPart)
    call_addUploadPart
    ;;
    cancelUpload)
    call_cancelUpload
    ;;
    completeUpload)
    call_completeUpload
    ;;
    createUpload)
    call_createUpload
    ;;
    usageAudioSpeeches)
    call_usageAudioSpeeches
    ;;
    usageAudioTranscriptions)
    call_usageAudioTranscriptions
    ;;
    usageCodeInterpreterSessions)
    call_usageCodeInterpreterSessions
    ;;
    usageCompletions)
    call_usageCompletions
    ;;
    usageCosts)
    call_usageCosts
    ;;
    usageEmbeddings)
    call_usageEmbeddings
    ;;
    usageImages)
    call_usageImages
    ;;
    usageModerations)
    call_usageModerations
    ;;
    usageVectorStores)
    call_usageVectorStores
    ;;
    deleteUser)
    call_deleteUser
    ;;
    listUsers)
    call_listUsers
    ;;
    modifyUser)
    call_modifyUser
    ;;
    retrieveUser)
    call_retrieveUser
    ;;
    cancelVectorStoreFileBatch)
    call_cancelVectorStoreFileBatch
    ;;
    createVectorStore)
    call_createVectorStore
    ;;
    createVectorStoreFile)
    call_createVectorStoreFile
    ;;
    createVectorStoreFileBatch)
    call_createVectorStoreFileBatch
    ;;
    deleteVectorStore)
    call_deleteVectorStore
    ;;
    deleteVectorStoreFile)
    call_deleteVectorStoreFile
    ;;
    getVectorStore)
    call_getVectorStore
    ;;
    getVectorStoreFile)
    call_getVectorStoreFile
    ;;
    getVectorStoreFileBatch)
    call_getVectorStoreFileBatch
    ;;
    listFilesInVectorStoreBatch)
    call_listFilesInVectorStoreBatch
    ;;
    listVectorStoreFiles)
    call_listVectorStoreFiles
    ;;
    listVectorStores)
    call_listVectorStores
    ;;
    modifyVectorStore)
    call_modifyVectorStore
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
