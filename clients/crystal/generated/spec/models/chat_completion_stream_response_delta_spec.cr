# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::ChatCompletionStreamResponseDelta
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenAPIClient::ChatCompletionStreamResponseDelta do

  describe "test an instance of ChatCompletionStreamResponseDelta" do
    it "should create an instance of ChatCompletionStreamResponseDelta" do
      #instance = OpenAPIClient::ChatCompletionStreamResponseDelta.new
      #expect(instance).to be_instance_of(OpenAPIClient::ChatCompletionStreamResponseDelta)
    end
  end
  describe "test attribute 'content'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'function_call'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'tool_calls'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  describe "test attribute 'role'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["system", "user", "assistant", "tool"])
      # validator.allowable_values.each do |value|
      #   expect { instance.role = value }.not_to raise_error
      # end
    end
  end

end
