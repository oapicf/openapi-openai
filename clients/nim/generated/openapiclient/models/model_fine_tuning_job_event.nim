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


type Level* {.pure.} = enum
  Info
  Warn
  Error

type `Object`* {.pure.} = enum
  FineTuningJobEvent

type FineTuningJobEvent* = object
  ## Fine-tuning job event object
  id*: string
  createdAt*: int
  level*: Level
  message*: string
  `object`*: `Object`

func `%`*(v: Level): JsonNode =
  let str = case v:
    of Level.Info: "info"
    of Level.Warn: "warn"
    of Level.Error: "error"

  JsonNode(kind: JString, str: str)

func `$`*(v: Level): string =
  result = case v:
    of Level.Info: "info"
    of Level.Warn: "warn"
    of Level.Error: "error"

func `%`*(v: `Object`): JsonNode =
  let str = case v:
    of `Object`.FineTuningJobEvent: "fine_tuning.job.event"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Object`): string =
  result = case v:
    of `Object`.FineTuningJobEvent: "fine_tuning.job.event"