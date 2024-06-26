# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ChatCompletionRequestToolMessage")

model_instance <- ChatCompletionRequestToolMessage$new()

test_that("role", {
  # tests for the property `role` (character)
  # The role of the messages author, in this case &#x60;tool&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`role`, "EXPECTED_RESULT")
})

test_that("content", {
  # tests for the property `content` (character)
  # The contents of the tool message.

  # uncomment below to test the property
  #expect_equal(model.instance$`content`, "EXPECTED_RESULT")
})

test_that("tool_call_id", {
  # tests for the property `tool_call_id` (character)
  # Tool call that this message is responding to.

  # uncomment below to test the property
  #expect_equal(model.instance$`tool_call_id`, "EXPECTED_RESULT")
})
