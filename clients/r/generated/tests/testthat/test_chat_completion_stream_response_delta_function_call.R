# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ChatCompletionStreamResponseDeltaFunctionCall")

model_instance <- ChatCompletionStreamResponseDeltaFunctionCall$new()

test_that("arguments", {
  # tests for the property `arguments` (character)
  # The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.

  # uncomment below to test the property
  #expect_equal(model.instance$`arguments`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # The name of the function to call.

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})
