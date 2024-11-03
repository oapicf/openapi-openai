=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateTranscriptionResponseVerboseJson < ApplicationRecord
  validates_presence_of :language
  validates_presence_of :duration
  validates_presence_of :text

  serialize :words, Array
  serialize :segments, Array
end
