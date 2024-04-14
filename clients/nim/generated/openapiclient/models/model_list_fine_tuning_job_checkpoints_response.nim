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

import model_fine_tuning_job_checkpoint

type `Object`* {.pure.} = enum
  List

type ListFineTuningJobCheckpointsResponse* = object
  ## 
  data*: seq[FineTuningJobCheckpoint]
  `object`*: `Object`
  firstId*: string
  lastId*: string
  hasMore*: bool

func `%`*(v: `Object`): JsonNode =
  let str = case v:
    of `Object`.List: "list"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Object`): string =
  result = case v:
    of `Object`.List: "list"
