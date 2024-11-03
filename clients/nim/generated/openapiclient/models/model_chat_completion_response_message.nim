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

import model_chat_completion_message_tool_call
import model_chat_completion_request_assistant_message_function_call

type Role* {.pure.} = enum
  Assistant

type ChatCompletionResponseMessage* = object
  ## A chat completion message generated by the model.
  content*: string ## The contents of the message.
  toolCalls*: seq[ChatCompletionMessageToolCall] ## The tool calls generated by the model, such as function calls.
  role*: Role ## The role of the author of this message.
  functionCall*: ChatCompletionRequestAssistantMessage_function_call

func `%`*(v: Role): JsonNode =
  let str = case v:
    of Role.Assistant: "assistant"

  JsonNode(kind: JString, str: str)

func `$`*(v: Role): string =
  result = case v:
    of Role.Assistant: "assistant"
