=begin
#OpenAI API

#The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

The version of the OpenAPI document: 2.0.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenApiOpenAIClient::EmbeddingsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'EmbeddingsApi' do
  before do
    # run before each test
    @api_instance = OpenApiOpenAIClient::EmbeddingsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EmbeddingsApi' do
    it 'should create an instance of EmbeddingsApi' do
      expect(@api_instance).to be_instance_of(OpenApiOpenAIClient::EmbeddingsApi)
    end
  end

  # unit tests for create_embedding
  # Creates an embedding vector representing the input text.
  # @param create_embedding_request 
  # @param [Hash] opts the optional parameters
  # @return [CreateEmbeddingResponse]
  describe 'create_embedding test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end