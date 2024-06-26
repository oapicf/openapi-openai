#
# OpenAI API
# 
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_assistant_object_tools_inner
import model_assistants_api_response_format_option
import model_assistants_api_tool_choice_option
import model_create_message_request
import model_create_run_request_model
import model_object
import model_truncation_object

type CreateRunRequest* = object
  ## 
  assistantId*: string ## The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  model*: CreateRunRequest_model
  instructions*: string ## Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
  additionalInstructions*: string ## Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
  additionalMessages*: seq[CreateMessageRequest] ## Adds additional messages to the thread before creating the run.
  tools*: seq[AssistantObject_tools_inner] ## Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  metadata*: object ## Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  temperature*: float ## What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  stream*: bool ## If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  maxPromptTokens*: int ## The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  maxCompletionTokens*: int ## The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  truncationStrategy*: TruncationObject
  toolChoice*: AssistantsApiToolChoiceOption
  responseFormat*: AssistantsApiResponseFormatOption
