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


type CreateModerationResponseResultsInnerCategories* = object
  ## A list of the categories, and whether they are flagged or not.
  hate*: bool ## Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  hateThreatening*: bool ## Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  harassment*: bool ## Content that expresses, incites, or promotes harassing language towards any target.
  harassmentThreatening*: bool ## Harassment content that also includes violence or serious harm towards any target.
  selfHarm*: bool ## Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  selfHarmIntent*: bool ## Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  selfHarmInstructions*: bool ## Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  sexual*: bool ## Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  sexualMinors*: bool ## Sexual content that includes an individual who is under 18 years old.
  violence*: bool ## Content that depicts death, violence, or physical injury.
  violenceGraphic*: bool ## Content that depicts death, violence, or physical injury in graphic detail.
