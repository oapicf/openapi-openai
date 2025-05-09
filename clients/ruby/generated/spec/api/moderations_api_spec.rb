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

# Unit tests for OpenApiOpenAIClient::ModerationsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ModerationsApi' do
  before do
    # run before each test
    @api_instance = OpenApiOpenAIClient::ModerationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ModerationsApi' do
    it 'should create an instance of ModerationsApi' do
      expect(@api_instance).to be_instance_of(OpenApiOpenAIClient::ModerationsApi)
    end
  end

  # unit tests for create_moderation
  # Classifies if text is potentially harmful.
  # @param create_moderation_request 
  # @param [Hash] opts the optional parameters
  # @return [CreateModerationResponse]
  describe 'create_moderation test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
