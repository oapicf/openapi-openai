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


type TranscriptionSegment* = object
  ## 
  id*: int ## Unique identifier of the segment.
  seek*: int ## Seek offset of the segment.
  start*: float ## Start time of the segment in seconds.
  `end`*: float ## End time of the segment in seconds.
  text*: string ## Text content of the segment.
  tokens*: seq[int] ## Array of token IDs for the text content.
  temperature*: float ## Temperature parameter used for generating the segment.
  avgLogprob*: float ## Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  compressionRatio*: float ## Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  noSpeechProb*: float ## Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
