=begin
#OpenAI API

#The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.9.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenApiOpenAIClient::ModelsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ModelsApi' do
  before do
    # run before each test
    @api_instance = OpenApiOpenAIClient::ModelsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ModelsApi' do
    it 'should create an instance of ModelsApi' do
      expect(@api_instance).to be_instance_of(OpenApiOpenAIClient::ModelsApi)
    end
  end

  # unit tests for delete_model
  # Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
  # @param model The model to delete
  # @param [Hash] opts the optional parameters
  # @return [DeleteModelResponse]
  describe 'delete_model test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for list_models
  # Lists the currently available models, and provides basic information about each one such as the owner and availability.
  # @param [Hash] opts the optional parameters
  # @return [ListModelsResponse]
  describe 'list_models test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for retrieve_model
  # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
  # @param model The ID of the model to use for this request
  # @param [Hash] opts the optional parameters
  # @return [Model]
  describe 'retrieve_model test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
