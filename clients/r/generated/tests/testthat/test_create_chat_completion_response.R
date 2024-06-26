# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CreateChatCompletionResponse")

model_instance <- CreateChatCompletionResponse$new()

test_that("id", {
  # tests for the property `id` (character)
  # A unique identifier for the chat completion.

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("choices", {
  # tests for the property `choices` (array[CreateChatCompletionResponseChoicesInner])
  # A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.

  # uncomment below to test the property
  #expect_equal(model.instance$`choices`, "EXPECTED_RESULT")
})

test_that("created", {
  # tests for the property `created` (integer)
  # The Unix timestamp (in seconds) of when the chat completion was created.

  # uncomment below to test the property
  #expect_equal(model.instance$`created`, "EXPECTED_RESULT")
})

test_that("model", {
  # tests for the property `model` (character)
  # The model used for the chat completion.

  # uncomment below to test the property
  #expect_equal(model.instance$`model`, "EXPECTED_RESULT")
})

test_that("system_fingerprint", {
  # tests for the property `system_fingerprint` (character)
  # This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 

  # uncomment below to test the property
  #expect_equal(model.instance$`system_fingerprint`, "EXPECTED_RESULT")
})

test_that("object", {
  # tests for the property `object` (character)
  # The object type, which is always &#x60;chat.completion&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`object`, "EXPECTED_RESULT")
})

test_that("usage", {
  # tests for the property `usage` (CompletionUsage)

  # uncomment below to test the property
  #expect_equal(model.instance$`usage`, "EXPECTED_RESULT")
})
