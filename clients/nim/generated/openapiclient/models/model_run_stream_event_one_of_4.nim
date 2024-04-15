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

import model_run_object

type Event* {.pure.} = enum
  ThreadRunCompleted

type RunStreamEventOneOf4* = object
  ## Occurs when a [run](/docs/api-reference/runs/object) is completed.
  event*: Event
  data*: RunObject

func `%`*(v: Event): JsonNode =
  let str = case v:
    of Event.ThreadRunCompleted: "thread.run.completed"

  JsonNode(kind: JString, str: str)

func `$`*(v: Event): string =
  result = case v:
    of Event.ThreadRunCompleted: "thread.run.completed"