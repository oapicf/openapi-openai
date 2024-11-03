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

import model_chat_completion_named_tool_choice_function

type `Type`* {.pure.} = enum
  Function
  CodeInterpreter
  Retrieval

type AssistantsApiNamedToolChoice* = object
  ## Specifies a tool the model should use. Use to force the model to call a specific tool.
  `type`*: `Type` ## The type of the tool. If type is `function`, the function name must be set
  function*: ChatCompletionNamedToolChoice_function

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.Function: "function"
    of `Type`.CodeInterpreter: "code_interpreter"
    of `Type`.Retrieval: "retrieval"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.Function: "function"
    of `Type`.CodeInterpreter: "code_interpreter"
    of `Type`.Retrieval: "retrieval"
