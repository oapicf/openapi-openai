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

import model_run_tool_call_object_function

type `Type`* {.pure.} = enum
  Function

type RunToolCallObject* = object
  ## Tool call objects
  id*: string ## The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
  `type`*: `Type` ## The type of tool call the output is required for. For now, this is always `function`.
  function*: RunToolCallObject_function

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.Function: "function"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.Function: "function"