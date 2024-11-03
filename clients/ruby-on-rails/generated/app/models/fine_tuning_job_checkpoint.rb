=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class FineTuningJobCheckpoint < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :created_at
  validates_presence_of :fine_tuned_model_checkpoint
  validates_presence_of :step_number
  validates_presence_of :metrics
  validates_presence_of :fine_tuning_job_id
  validates_presence_of :object

end
