# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner")

model_instance <- RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner$new()

test_that("index", {
  # tests for the property `index` (integer)
  # The index of the output in the outputs array.

  # uncomment below to test the property
  #expect_equal(model.instance$`index`, "EXPECTED_RESULT")
})

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

test_that("image", {
  # tests for the property `image` (RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage)

  # uncomment below to test the property
  #expect_equal(model.instance$`image`, "EXPECTED_RESULT")
})
