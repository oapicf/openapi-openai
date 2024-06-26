# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test FunctionObject")

model_instance <- FunctionObject$new()

test_that("description", {
  # tests for the property `description` (character)
  # A description of what the function does, used by the model to choose when and how to call the function.

  # uncomment below to test the property
  #expect_equal(model.instance$`description`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("parameters", {
  # tests for the property `parameters` (map(AnyType))
  # The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.

  # uncomment below to test the property
  #expect_equal(model.instance$`parameters`, "EXPECTED_RESULT")
})
