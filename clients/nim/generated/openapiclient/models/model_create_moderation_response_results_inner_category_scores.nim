#
# OpenAI API
# 
# APIs for sampling from and fine-tuning language models
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type CreateModerationResponseResultsInnerCategoryScores* = object
  ## 
  hate*: float
  hateThreatening*: float
  selfHarm*: float
  sexual*: float
  sexualMinors*: float
  violence*: float
  violenceGraphic*: float
