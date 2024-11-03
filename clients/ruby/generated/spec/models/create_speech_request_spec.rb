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
require 'date'

# Unit tests for OpenApiOpenAIClient::CreateSpeechRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenApiOpenAIClient::CreateSpeechRequest do
  let(:instance) { OpenApiOpenAIClient::CreateSpeechRequest.new }

  describe 'test an instance of CreateSpeechRequest' do
    it 'should create an instance of CreateSpeechRequest' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenApiOpenAIClient::CreateSpeechRequest)
    end
  end

  describe 'test attribute "model"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "input"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  describe 'test attribute "voice"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["alloy", "echo", "fable", "onyx", "nova", "shimmer"])
      # validator.allowable_values.each do |value|
      #   expect { instance.voice = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "response_format"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["mp3", "opus", "aac", "flac", "wav", "pcm"])
      # validator.allowable_values.each do |value|
      #   expect { instance.response_format = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "speed"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
