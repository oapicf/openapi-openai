# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ChatCompletionRequestAssistantMessage")

model_instance <- ChatCompletionRequestAssistantMessage$new()

test_that("content", {
  # tests for the property `content` (character)
  # The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 

  # uncomment below to test the property
  #expect_equal(model.instance$`content`, "EXPECTED_RESULT")
})

test_that("role", {
  # tests for the property `role` (character)
  # The role of the messages author, in this case &#x60;assistant&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`role`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # An optional name for the participant. Provides the model information to differentiate between participants of the same role.

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("tool_calls", {
  # tests for the property `tool_calls` (array[ChatCompletionMessageToolCall])
  # The tool calls generated by the model, such as function calls.

  # uncomment below to test the property
  #expect_equal(model.instance$`tool_calls`, "EXPECTED_RESULT")
})

test_that("function_call", {
  # tests for the property `function_call` (ChatCompletionRequestAssistantMessageFunctionCall)

  # uncomment below to test the property
  #expect_equal(model.instance$`function_call`, "EXPECTED_RESULT")
})
