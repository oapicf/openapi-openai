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

import model_run_step_details_tool_calls_object_tool_calls_inner

type `Type`* {.pure.} = enum
  ToolCalls

type RunStepDetailsToolCallsObject* = object
  ## Details of the tool call.
  `type`*: `Type` ## Always `tool_calls`.
  toolCalls*: seq[RunStepDetailsToolCallsObject_tool_calls_inner] ## An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.ToolCalls: "tool_calls"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.ToolCalls: "tool_calls"