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

# Unit tests for OpenAPIClient::RunObjectLastError
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenAPIClient::RunObjectLastError do

  describe "test an instance of RunObjectLastError" do
    it "should create an instance of RunObjectLastError" do
      #instance = OpenAPIClient::RunObjectLastError.new
      #expect(instance).to be_instance_of(OpenAPIClient::RunObjectLastError)
    end
  end
  describe "test attribute 'code'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
      # validator = Petstore::EnumTest::EnumAttributeValidator.new("String", ["server_error", "rate_limit_exceeded", "invalid_prompt"])
      # validator.allowable_values.each do |value|
      #   expect { instance.code = value }.not_to raise_error
      # end
    end
  end

  describe "test attribute 'message'" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
