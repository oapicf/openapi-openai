# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::RunStepStreamEventOneOf6
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenAPIClient::RunStepStreamEventOneOf6 do

  describe "test an instance of RunStepStreamEventOneOf6" do
    it "should create an instance of RunStepStreamEventOneOf6" do
      #instance = OpenAPIClient::RunStepStreamEventOneOf6.new
      #expect(instance).to be_instance_of(OpenAPIClient::RunStepStreamEventOneOf6)
    end
  end
  describe "test attribute 'event'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["thread.run.step.expired"])
      # validator.allowable_values.each do |value|
      #   expect { instance.event = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'data'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
