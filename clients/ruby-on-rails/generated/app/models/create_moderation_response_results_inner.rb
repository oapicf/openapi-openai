=begin
OpenAI API

APIs for sampling from and fine-tuning language models

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class CreateModerationResponseResultsInner < ApplicationRecord
  validates_presence_of :flagged
  validates_presence_of :categories
  validates_presence_of :category_scores

end