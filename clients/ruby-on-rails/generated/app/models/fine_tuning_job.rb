=begin
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class FineTuningJob < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :created_at
  validates_presence_of :error
  validates_presence_of :fine_tuned_model
  validates_presence_of :finished_at
  validates_presence_of :hyperparameters
  validates_presence_of :model
  validates_presence_of :object
  validates_presence_of :organization_id
  validates_presence_of :result_files
  validates_presence_of :status
  validates_presence_of :trained_tokens
  validates_presence_of :training_file
  validates_presence_of :validation_file
  validates_presence_of :seed

  serialize :result_files, Array
  serialize :integrations, Array
end
