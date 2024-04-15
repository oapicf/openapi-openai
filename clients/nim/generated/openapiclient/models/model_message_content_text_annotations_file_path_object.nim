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

import model_message_content_text_annotations_file_path_object_file_path

type `Type`* {.pure.} = enum
  FilePath

type MessageContentTextAnnotationsFilePathObject* = object
  ## A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
  `type`*: `Type` ## Always `file_path`.
  text*: string ## The text in the message content that needs to be replaced.
  filePath*: MessageContentTextAnnotationsFilePathObject_file_path
  startIndex*: int
  endIndex*: int

func `%`*(v: `Type`): JsonNode =
  let str = case v:
    of `Type`.FilePath: "file_path"

  JsonNode(kind: JString, str: str)

func `$`*(v: `Type`): string =
  result = case v:
    of `Type`.FilePath: "file_path"