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
operation_parameters_minimum_occurrences["createAssistantFile:::assistant_id"]=1
operation_parameters_minimum_occurrences["createAssistantFile:::CreateAssistantFileRequest"]=1
operation_parameters_minimum_occurrences["createMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["createMessage:::CreateMessageRequest"]=1
operation_parameters_minimum_occurrences["createRun:::thread_id"]=1
operation_parameters_minimum_occurrences["createRun:::CreateRunRequest"]=1
operation_parameters_minimum_occurrences["createThread:::CreateThreadRequest"]=0
operation_parameters_minimum_occurrences["createThreadAndRun:::CreateThreadAndRunRequest"]=1
operation_parameters_minimum_occurrences["deleteAssistant:::assistant_id"]=1
operation_parameters_minimum_occurrences["deleteAssistantFile:::assistant_id"]=1
operation_parameters_minimum_occurrences["deleteAssistantFile:::file_id"]=1
operation_parameters_minimum_occurrences["deleteThread:::thread_id"]=1
operation_parameters_minimum_occurrences["getAssistant:::assistant_id"]=1
operation_parameters_minimum_occurrences["getAssistantFile:::assistant_id"]=1
operation_parameters_minimum_occurrences["getAssistantFile:::file_id"]=1
operation_parameters_minimum_occurrences["getMessage:::thread_id"]=1
operation_parameters_minimum_occurrences["getMessage:::message_id"]=1
operation_parameters_minimum_occurrences["getMessageFile:::thread_id"]=1
operation_parameters_minimum_occurrences["getMessageFile:::message_id"]=1
operation_parameters_minimum_occurrences["getMessageFile:::file_id"]=1
operation_parameters_minimum_occurrences["getRun:::thread_id"]=1
operation_parameters_minimum_occurrences["getRun:::run_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::thread_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::run_id"]=1
operation_parameters_minimum_occurrences["getRunStep:::step_id"]=1
operation_parameters_minimum_occurrences["getThread:::thread_id"]=1
operation_parameters_minimum_occurrences["listAssistantFiles:::assistant_id"]=1
operation_parameters_minimum_occurrences["listAssistantFiles:::limit"]=0
operation_parameters_minimum_occurrences["listAssistantFiles:::order"]=0
operation_parameters_minimum_occurrences["listAssistantFiles:::after"]=0
operation_parameters_minimum_occurrences["listAssistantFiles:::before"]=0
operation_parameters_minimum_occurrences["listAssistants:::limit"]=0
operation_parameters_minimum_occurrences["listAssistants:::order"]=0
operation_parameters_minimum_occurrences["listAssistants:::after"]=0
operation_parameters_minimum_occurrences["listAssistants:::before"]=0
operation_parameters_minimum_occurrences["listMessageFiles:::thread_id"]=1
operation_parameters_minimum_occurrences["listMessageFiles:::message_id"]=1
operation_parameters_minimum_occurrences["listMessageFiles:::limit"]=0
operation_parameters_minimum_occurrences["listMessageFiles:::order"]=0
operation_parameters_minimum_occurrences["listMessageFiles:::after"]=0
operation_parameters_minimum_occurrences["listMessageFiles:::before"]=0
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
operation_parameters_minimum_occurrences["createChatCompletion:::CreateChatCompletionRequest"]=1
operation_parameters_minimum_occurrences["createCompletion:::CreateCompletionRequest"]=1
operation_parameters_minimum_occurrences["createEmbedding:::CreateEmbeddingRequest"]=1
operation_parameters_minimum_occurrences["createFile:::file"]=1
operation_parameters_minimum_occurrences["createFile:::purpose"]=1
operation_parameters_minimum_occurrences["deleteFile:::file_id"]=1
operation_parameters_minimum_occurrences["downloadFile:::file_id"]=1
operation_parameters_minimum_occurrences["listFiles:::purpose"]=0
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
operation_parameters_minimum_occurrences["deleteModel:::model"]=1
operation_parameters_minimum_occurrences["retrieveModel:::model"]=1
operation_parameters_minimum_occurrences["createModeration:::CreateModerationRequest"]=1

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
operation_parameters_maximum_occurrences["createAssistantFile:::assistant_id"]=0
operation_parameters_maximum_occurrences["createAssistantFile:::CreateAssistantFileRequest"]=0
operation_parameters_maximum_occurrences["createMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["createMessage:::CreateMessageRequest"]=0
operation_parameters_maximum_occurrences["createRun:::thread_id"]=0
operation_parameters_maximum_occurrences["createRun:::CreateRunRequest"]=0
operation_parameters_maximum_occurrences["createThread:::CreateThreadRequest"]=0
operation_parameters_maximum_occurrences["createThreadAndRun:::CreateThreadAndRunRequest"]=0
operation_parameters_maximum_occurrences["deleteAssistant:::assistant_id"]=0
operation_parameters_maximum_occurrences["deleteAssistantFile:::assistant_id"]=0
operation_parameters_maximum_occurrences["deleteAssistantFile:::file_id"]=0
operation_parameters_maximum_occurrences["deleteThread:::thread_id"]=0
operation_parameters_maximum_occurrences["getAssistant:::assistant_id"]=0
operation_parameters_maximum_occurrences["getAssistantFile:::assistant_id"]=0
operation_parameters_maximum_occurrences["getAssistantFile:::file_id"]=0
operation_parameters_maximum_occurrences["getMessage:::thread_id"]=0
operation_parameters_maximum_occurrences["getMessage:::message_id"]=0
operation_parameters_maximum_occurrences["getMessageFile:::thread_id"]=0
operation_parameters_maximum_occurrences["getMessageFile:::message_id"]=0
operation_parameters_maximum_occurrences["getMessageFile:::file_id"]=0
operation_parameters_maximum_occurrences["getRun:::thread_id"]=0
operation_parameters_maximum_occurrences["getRun:::run_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::thread_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::run_id"]=0
operation_parameters_maximum_occurrences["getRunStep:::step_id"]=0
operation_parameters_maximum_occurrences["getThread:::thread_id"]=0
operation_parameters_maximum_occurrences["listAssistantFiles:::assistant_id"]=0
operation_parameters_maximum_occurrences["listAssistantFiles:::limit"]=0
operation_parameters_maximum_occurrences["listAssistantFiles:::order"]=0
operation_parameters_maximum_occurrences["listAssistantFiles:::after"]=0
operation_parameters_maximum_occurrences["listAssistantFiles:::before"]=0
operation_parameters_maximum_occurrences["listAssistants:::limit"]=0
operation_parameters_maximum_occurrences["listAssistants:::order"]=0
operation_parameters_maximum_occurrences["listAssistants:::after"]=0
operation_parameters_maximum_occurrences["listAssistants:::before"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::thread_id"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::message_id"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::limit"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::order"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::after"]=0
operation_parameters_maximum_occurrences["listMessageFiles:::before"]=0
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
operation_parameters_maximum_occurrences["createChatCompletion:::CreateChatCompletionRequest"]=0
operation_parameters_maximum_occurrences["createCompletion:::CreateCompletionRequest"]=0
operation_parameters_maximum_occurrences["createEmbedding:::CreateEmbeddingRequest"]=0
operation_parameters_maximum_occurrences["createFile:::file"]=0
operation_parameters_maximum_occurrences["createFile:::purpose"]=0
operation_parameters_maximum_occurrences["deleteFile:::file_id"]=0
operation_parameters_maximum_occurrences["downloadFile:::file_id"]=0
operation_parameters_maximum_occurrences["listFiles:::purpose"]=0
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
operation_parameters_maximum_occurrences["deleteModel:::model"]=0
operation_parameters_maximum_occurrences["retrieveModel:::model"]=0
operation_parameters_maximum_occurrences["createModeration:::CreateModerationRequest"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["cancelRun:::thread_id"]=""
operation_parameters_collection_type["cancelRun:::run_id"]=""
operation_parameters_collection_type["createAssistant:::CreateAssistantRequest"]=""
operation_parameters_collection_type["createAssistantFile:::assistant_id"]=""
operation_parameters_collection_type["createAssistantFile:::CreateAssistantFileRequest"]=""
operation_parameters_collection_type["createMessage:::thread_id"]=""
operation_parameters_collection_type["createMessage:::CreateMessageRequest"]=""
operation_parameters_collection_type["createRun:::thread_id"]=""
operation_parameters_collection_type["createRun:::CreateRunRequest"]=""
operation_parameters_collection_type["createThread:::CreateThreadRequest"]=""
operation_parameters_collection_type["createThreadAndRun:::CreateThreadAndRunRequest"]=""
operation_parameters_collection_type["deleteAssistant:::assistant_id"]=""
operation_parameters_collection_type["deleteAssistantFile:::assistant_id"]=""
operation_parameters_collection_type["deleteAssistantFile:::file_id"]=""
operation_parameters_collection_type["deleteThread:::thread_id"]=""
operation_parameters_collection_type["getAssistant:::assistant_id"]=""
operation_parameters_collection_type["getAssistantFile:::assistant_id"]=""
operation_parameters_collection_type["getAssistantFile:::file_id"]=""
operation_parameters_collection_type["getMessage:::thread_id"]=""
operation_parameters_collection_type["getMessage:::message_id"]=""
operation_parameters_collection_type["getMessageFile:::thread_id"]=""
operation_parameters_collection_type["getMessageFile:::message_id"]=""
operation_parameters_collection_type["getMessageFile:::file_id"]=""
operation_parameters_collection_type["getRun:::thread_id"]=""
operation_parameters_collection_type["getRun:::run_id"]=""
operation_parameters_collection_type["getRunStep:::thread_id"]=""
operation_parameters_collection_type["getRunStep:::run_id"]=""
operation_parameters_collection_type["getRunStep:::step_id"]=""
operation_parameters_collection_type["getThread:::thread_id"]=""
operation_parameters_collection_type["listAssistantFiles:::assistant_id"]=""
operation_parameters_collection_type["listAssistantFiles:::limit"]=""
operation_parameters_collection_type["listAssistantFiles:::order"]=""
operation_parameters_collection_type["listAssistantFiles:::after"]=""
operation_parameters_collection_type["listAssistantFiles:::before"]=""
operation_parameters_collection_type["listAssistants:::limit"]=""
operation_parameters_collection_type["listAssistants:::order"]=""
operation_parameters_collection_type["listAssistants:::after"]=""
operation_parameters_collection_type["listAssistants:::before"]=""
operation_parameters_collection_type["listMessageFiles:::thread_id"]=""
operation_parameters_collection_type["listMessageFiles:::message_id"]=""
operation_parameters_collection_type["listMessageFiles:::limit"]=""
operation_parameters_collection_type["listMessageFiles:::order"]=""
operation_parameters_collection_type["listMessageFiles:::after"]=""
operation_parameters_collection_type["listMessageFiles:::before"]=""
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
operation_parameters_collection_type["createChatCompletion:::CreateChatCompletionRequest"]=""
operation_parameters_collection_type["createCompletion:::CreateCompletionRequest"]=""
operation_parameters_collection_type["createEmbedding:::CreateEmbeddingRequest"]=""
operation_parameters_collection_type["createFile:::file"]=""
operation_parameters_collection_type["createFile:::purpose"]=""
operation_parameters_collection_type["deleteFile:::file_id"]=""
operation_parameters_collection_type["downloadFile:::file_id"]=""
operation_parameters_collection_type["listFiles:::purpose"]=""
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
operation_parameters_collection_type["deleteModel:::model"]=""
operation_parameters_collection_type["retrieveModel:::model"]=""
operation_parameters_collection_type["createModeration:::CreateModerationRequest"]=""


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

${BOLD}${WHITE}OpenAI API command line client (API version 2.0.0)${OFF}

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
  ${CYAN}createAssistantFile${OFF};Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants). (AUTH)
  ${CYAN}createMessage${OFF};Create a message. (AUTH)
  ${CYAN}createRun${OFF};Create a run. (AUTH)
  ${CYAN}createThread${OFF};Create a thread. (AUTH)
  ${CYAN}createThreadAndRun${OFF};Create a thread and run it in one request. (AUTH)
  ${CYAN}deleteAssistant${OFF};Delete an assistant. (AUTH)
  ${CYAN}deleteAssistantFile${OFF};Delete an assistant file. (AUTH)
  ${CYAN}deleteThread${OFF};Delete a thread. (AUTH)
  ${CYAN}getAssistant${OFF};Retrieves an assistant. (AUTH)
  ${CYAN}getAssistantFile${OFF};Retrieves an AssistantFile. (AUTH)
  ${CYAN}getMessage${OFF};Retrieve a message. (AUTH)
  ${CYAN}getMessageFile${OFF};Retrieves a message file. (AUTH)
  ${CYAN}getRun${OFF};Retrieves a run. (AUTH)
  ${CYAN}getRunStep${OFF};Retrieves a run step. (AUTH)
  ${CYAN}getThread${OFF};Retrieves a thread. (AUTH)
  ${CYAN}listAssistantFiles${OFF};Returns a list of assistant files. (AUTH)
  ${CYAN}listAssistants${OFF};Returns a list of assistants. (AUTH)
  ${CYAN}listMessageFiles${OFF};Returns a list of message files. (AUTH)
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
    echo -e "${BOLD}${WHITE}[chat]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createChatCompletion${OFF};Creates a model response for the given chat conversation. (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[completions]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createCompletion${OFF};Creates a completion for the provided prompt and parameters. (AUTH)
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
  ${CYAN}createFile${OFF};Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports '.jsonl' files.

Please [contact us](https://help.openai.com/) if you need to increase these storage limits. (AUTH)
  ${CYAN}deleteFile${OFF};Delete a file. (AUTH)
  ${CYAN}downloadFile${OFF};Returns the contents of the specified file. (AUTH)
  ${CYAN}listFiles${OFF};Returns a list of files that belong to the user's organization. (AUTH)
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
  ${CYAN}createModeration${OFF};Classifies if text is potentially harmful. (AUTH)
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
    echo -e "${BOLD}${WHITE}OpenAI API command line client (API version 2.0.0)${OFF}"
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
    echo -e "${BOLD}OpenAI API command line client (API version 2.0.0)${OFF}"
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
# Print help for createAssistantFile operation
#
##############################################################################
print_createAssistantFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createAssistantFile - Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant for which to create a File. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
# Print help for deleteAssistantFile operation
#
##############################################################################
print_deleteAssistantFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteAssistantFile - Delete an assistant file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant that the file belongs to. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file to delete. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
# Print help for getAssistantFile operation
#
##############################################################################
print_getAssistantFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssistantFile - Retrieves an AssistantFile.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant who the file belongs to. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file we're getting. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
# Print help for getMessageFile operation
#
##############################################################################
print_getMessageFile_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMessageFile - Retrieves a message file.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread to which the message and File belong. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the message the file belongs to. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}file_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the file being retrieved. ${YELLOW}Specify as: file_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
# Print help for listAssistantFiles operation
#
##############################################################################
print_listAssistantFiles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listAssistantFiles - Returns a list of assistant files.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}assistant_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the assistant the file belongs to. ${YELLOW}Specify as: assistant_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;OK${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listMessageFiles operation
#
##############################################################################
print_listMessageFiles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listMessageFiles - Returns a list of message files.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}thread_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the thread that the message and files belong to. ${YELLOW}Specify as: thread_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}message_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - The ID of the message that the files belongs to. ${YELLOW}Specify as: message_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: 20)${OFF} - A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}order${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: desc)${OFF} - Sort order by the 'created_at' timestamp of the objects. 'asc' for ascending order and 'desc' for descending order.${YELLOW} Specify as: order=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}after${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.${YELLOW} Specify as: after=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
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
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
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
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
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
    echo -e "  * ${GREEN}before${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - A cursor for use in pagination. 'before' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.${YELLOW} Specify as: before=value${OFF}" \
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
# Print help for createChatCompletion operation
#
##############################################################################
print_createChatCompletion_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createChatCompletion - Creates a model response for the given chat conversation.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
    echo -e "${BOLD}${WHITE}createFile - Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.

The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports '.jsonl' files.

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
    echo -e "${BOLD}${WHITE}listFiles - Returns a list of files that belong to the user's organization.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}purpose${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Only return files with the given purpose.${YELLOW} Specify as: purpose=value${OFF}" \
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
    echo -e "${BOLD}${WHITE}createModeration - Classifies if text is potentially harmful.${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
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
# Call createAssistantFile operation
#
##############################################################################
call_createAssistantFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}/files" path_parameter_names query_parameter_names); then
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
    local query_parameter_names=(  )
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
# Call deleteAssistantFile operation
#
##############################################################################
call_deleteAssistantFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}/files/{file_id}" path_parameter_names query_parameter_names); then
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
# Call getAssistantFile operation
#
##############################################################################
call_getAssistantFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}/files/{file_id}" path_parameter_names query_parameter_names); then
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
# Call getMessageFile operation
#
##############################################################################
call_getMessageFile() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id message_id file_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}" path_parameter_names query_parameter_names); then
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
    local query_parameter_names=(  )
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
# Call listAssistantFiles operation
#
##############################################################################
call_listAssistantFiles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(assistant_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before  )
    local path

    if ! path=$(build_request_path "/v1/assistants/{assistant_id}/files" path_parameter_names query_parameter_names); then
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
# Call listMessageFiles operation
#
##############################################################################
call_listMessageFiles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(thread_id message_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit order after before  )
    local path

    if ! path=$(build_request_path "/v1/threads/{thread_id}/messages/{message_id}/files" path_parameter_names query_parameter_names); then
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
    local query_parameter_names=(limit order after before  )
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
    local query_parameter_names=(purpose  )
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
    createAssistantFile)
    operation="createAssistantFile"
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
    deleteAssistantFile)
    operation="deleteAssistantFile"
    ;;
    deleteThread)
    operation="deleteThread"
    ;;
    getAssistant)
    operation="getAssistant"
    ;;
    getAssistantFile)
    operation="getAssistantFile"
    ;;
    getMessage)
    operation="getMessage"
    ;;
    getMessageFile)
    operation="getMessageFile"
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
    listAssistantFiles)
    operation="listAssistantFiles"
    ;;
    listAssistants)
    operation="listAssistants"
    ;;
    listMessageFiles)
    operation="listMessageFiles"
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
    createChatCompletion)
    operation="createChatCompletion"
    ;;
    createCompletion)
    operation="createCompletion"
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
    createAssistantFile)
    call_createAssistantFile
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
    deleteAssistantFile)
    call_deleteAssistantFile
    ;;
    deleteThread)
    call_deleteThread
    ;;
    getAssistant)
    call_getAssistant
    ;;
    getAssistantFile)
    call_getAssistantFile
    ;;
    getMessage)
    call_getMessage
    ;;
    getMessageFile)
    call_getMessageFile
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
    listAssistantFiles)
    call_listAssistantFiles
    ;;
    listAssistants)
    call_listAssistants
    ;;
    listMessageFiles)
    call_listMessageFiles
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
    createChatCompletion)
    call_createChatCompletion
    ;;
    createCompletion)
    call_createCompletion
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
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
