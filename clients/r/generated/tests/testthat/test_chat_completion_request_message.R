# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ChatCompletionRequestMessage")

model_instance <- ChatCompletionRequestMessage$new()

test_that("content", {
  # tests for the property `content` (character)
  # The contents of the function message.

  # uncomment below to test the property
  #expect_equal(model.instance$`content`, "EXPECTED_RESULT")
})

test_that("role", {
  # tests for the property `role` (character)
  # The role of the messages author, in this case &#x60;function&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`role`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # The name of the function to call.

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

test_that("tool_call_id", {
  # tests for the property `tool_call_id` (character)
  # Tool call that this message is responding to.

  # uncomment below to test the property
  #expect_equal(model.instance$`tool_call_id`, "EXPECTED_RESULT")
})
