# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test SubmitToolOutputsRunRequestToolOutputsInner")

model_instance <- SubmitToolOutputsRunRequestToolOutputsInner$new()

test_that("tool_call_id", {
  # tests for the property `tool_call_id` (character)
  # The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for.

  # uncomment below to test the property
  #expect_equal(model.instance$`tool_call_id`, "EXPECTED_RESULT")
})

test_that("output", {
  # tests for the property `output` (character)
  # The output of the tool call to be submitted to continue the run.

  # uncomment below to test the property
  #expect_equal(model.instance$`output`, "EXPECTED_RESULT")
})
