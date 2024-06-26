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

import model_run_step_delta_object_delta

type `Object`* {.pure.} = enum
  ThreadRunStepDelta

type RunStepDeltaObject* = object
  ## Represents a run step delta i.e. any changed fields on a run step during streaming. 
  id*: string ## The identifier of the run step, which can be referenced in API endpoints.
  `object`*: `Object` ## The object type, which is always `thread.run.step.delta`.
  delta*: RunStepDeltaObject_delta

func `%`*(v: `Object`): JsonNode =
  let str = case v:
    of `Object`.ThreadRunStepDelta: "thread.run.step.delta"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Object`): string =
  result = case v:
    of `Object`.ThreadRunStepDelta: "thread.run.step.delta"
