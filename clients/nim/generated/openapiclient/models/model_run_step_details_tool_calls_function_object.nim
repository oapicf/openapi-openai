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

import model_run_step_details_tool_calls_function_object_function

type `Type`* {.pure.} = enum
  Function

type RunStepDetailsToolCallsFunctionObject* = object
  ## 
  id*: string ## The ID of the tool call object.
  `type`*: `Type` ## The type of tool call. This is always going to be `function` for this type of tool call.
  function*: RunStepDetailsToolCallsFunctionObject_function

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.Function: "function"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.Function: "function"
