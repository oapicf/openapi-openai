# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test RunStepDetailsToolCallsCodeOutputLogsObject")

model_instance <- RunStepDetailsToolCallsCodeOutputLogsObject$new()

test_that("type", {
  # tests for the property `type` (character)
  # Always &#x60;logs&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`type`, "EXPECTED_RESULT")
})

test_that("logs", {
  # tests for the property `logs` (character)
  # The text output from the Code Interpreter tool call.

  # uncomment below to test the property
  #expect_equal(model.instance$`logs`, "EXPECTED_RESULT")
})
