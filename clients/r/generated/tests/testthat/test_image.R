# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Image")

model_instance <- Image$new()

test_that("b64_json", {
  # tests for the property `b64_json` (character)
  # The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`b64_json`, "EXPECTED_RESULT")
})

test_that("url", {
  # tests for the property `url` (character)
  # The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).

  # uncomment below to test the property
  #expect_equal(model.instance$`url`, "EXPECTED_RESULT")
})

test_that("revised_prompt", {
  # tests for the property `revised_prompt` (character)
  # The prompt that was used to generate the image, if there was any revision to the prompt.

  # uncomment below to test the property
  #expect_equal(model.instance$`revised_prompt`, "EXPECTED_RESULT")
})
