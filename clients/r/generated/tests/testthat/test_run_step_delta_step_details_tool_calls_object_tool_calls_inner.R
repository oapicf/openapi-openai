# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test RunStepDeltaStepDetailsToolCallsObjectToolCallsInner")

model_instance <- RunStepDeltaStepDetailsToolCallsObjectToolCallsInner$new()

test_that("index", {
  # tests for the property `index` (integer)
  # The index of the tool call in the tool calls array.

  # uncomment below to test the property
  #expect_equal(model.instance$`index`, "EXPECTED_RESULT")
})

test_that("id", {
  # tests for the property `id` (character)
  # The ID of the tool call object.

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("type", {
  # tests for the property `type` (character)
  # The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.

  # uncomment below to test the property
  #expect_equal(model.instance$`type`, "EXPECTED_RESULT")
})

test_that("code_interpreter", {
  # tests for the property `code_interpreter` (RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter)

  # uncomment below to test the property
  #expect_equal(model.instance$`code_interpreter`, "EXPECTED_RESULT")
})

test_that("retrieval", {
  # tests for the property `retrieval` (object)
  # For now, this is always going to be an empty object.

  # uncomment below to test the property
  #expect_equal(model.instance$`retrieval`, "EXPECTED_RESULT")
})

test_that("function", {
  # tests for the property `function` (RunStepDeltaStepDetailsToolCallsFunctionObjectFunction)

  # uncomment below to test the property
  #expect_equal(model.instance$`function`, "EXPECTED_RESULT")
})
