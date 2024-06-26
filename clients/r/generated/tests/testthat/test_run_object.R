# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test RunObject")

model_instance <- RunObject$new()

test_that("id", {
  # tests for the property `id` (character)
  # The identifier, which can be referenced in API endpoints.

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("object", {
  # tests for the property `object` (character)
  # The object type, which is always &#x60;thread.run&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`object`, "EXPECTED_RESULT")
})

test_that("created_at", {
  # tests for the property `created_at` (integer)
  # The Unix timestamp (in seconds) for when the run was created.

  # uncomment below to test the property
  #expect_equal(model.instance$`created_at`, "EXPECTED_RESULT")
})

test_that("thread_id", {
  # tests for the property `thread_id` (character)
  # The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`thread_id`, "EXPECTED_RESULT")
})

test_that("assistant_id", {
  # tests for the property `assistant_id` (character)
  # The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`assistant_id`, "EXPECTED_RESULT")
})

test_that("status", {
  # tests for the property `status` (character)
  # The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.

  # uncomment below to test the property
  #expect_equal(model.instance$`status`, "EXPECTED_RESULT")
})

test_that("required_action", {
  # tests for the property `required_action` (RunObjectRequiredAction)

  # uncomment below to test the property
  #expect_equal(model.instance$`required_action`, "EXPECTED_RESULT")
})

test_that("last_error", {
  # tests for the property `last_error` (RunObjectLastError)

  # uncomment below to test the property
  #expect_equal(model.instance$`last_error`, "EXPECTED_RESULT")
})

test_that("expires_at", {
  # tests for the property `expires_at` (integer)
  # The Unix timestamp (in seconds) for when the run will expire.

  # uncomment below to test the property
  #expect_equal(model.instance$`expires_at`, "EXPECTED_RESULT")
})

test_that("started_at", {
  # tests for the property `started_at` (integer)
  # The Unix timestamp (in seconds) for when the run was started.

  # uncomment below to test the property
  #expect_equal(model.instance$`started_at`, "EXPECTED_RESULT")
})

test_that("cancelled_at", {
  # tests for the property `cancelled_at` (integer)
  # The Unix timestamp (in seconds) for when the run was cancelled.

  # uncomment below to test the property
  #expect_equal(model.instance$`cancelled_at`, "EXPECTED_RESULT")
})

test_that("failed_at", {
  # tests for the property `failed_at` (integer)
  # The Unix timestamp (in seconds) for when the run failed.

  # uncomment below to test the property
  #expect_equal(model.instance$`failed_at`, "EXPECTED_RESULT")
})

test_that("completed_at", {
  # tests for the property `completed_at` (integer)
  # The Unix timestamp (in seconds) for when the run was completed.

  # uncomment below to test the property
  #expect_equal(model.instance$`completed_at`, "EXPECTED_RESULT")
})

test_that("incomplete_details", {
  # tests for the property `incomplete_details` (RunObjectIncompleteDetails)

  # uncomment below to test the property
  #expect_equal(model.instance$`incomplete_details`, "EXPECTED_RESULT")
})

test_that("model", {
  # tests for the property `model` (character)
  # The model that the [assistant](/docs/api-reference/assistants) used for this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`model`, "EXPECTED_RESULT")
})

test_that("instructions", {
  # tests for the property `instructions` (character)
  # The instructions that the [assistant](/docs/api-reference/assistants) used for this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`instructions`, "EXPECTED_RESULT")
})

test_that("tools", {
  # tests for the property `tools` (array[AssistantObjectToolsInner])
  # The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`tools`, "EXPECTED_RESULT")
})

test_that("file_ids", {
  # tests for the property `file_ids` (array[character])
  # The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.

  # uncomment below to test the property
  #expect_equal(model.instance$`file_ids`, "EXPECTED_RESULT")
})

test_that("metadata", {
  # tests for the property `metadata` (object)
  # Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

  # uncomment below to test the property
  #expect_equal(model.instance$`metadata`, "EXPECTED_RESULT")
})

test_that("usage", {
  # tests for the property `usage` (RunCompletionUsage)

  # uncomment below to test the property
  #expect_equal(model.instance$`usage`, "EXPECTED_RESULT")
})

test_that("temperature", {
  # tests for the property `temperature` (numeric)
  # The sampling temperature used for this run. If not set, defaults to 1.

  # uncomment below to test the property
  #expect_equal(model.instance$`temperature`, "EXPECTED_RESULT")
})

test_that("max_prompt_tokens", {
  # tests for the property `max_prompt_tokens` (integer)
  # The maximum number of prompt tokens specified to have been used over the course of the run. 

  # uncomment below to test the property
  #expect_equal(model.instance$`max_prompt_tokens`, "EXPECTED_RESULT")
})

test_that("max_completion_tokens", {
  # tests for the property `max_completion_tokens` (integer)
  # The maximum number of completion tokens specified to have been used over the course of the run. 

  # uncomment below to test the property
  #expect_equal(model.instance$`max_completion_tokens`, "EXPECTED_RESULT")
})

test_that("truncation_strategy", {
  # tests for the property `truncation_strategy` (TruncationObject)

  # uncomment below to test the property
  #expect_equal(model.instance$`truncation_strategy`, "EXPECTED_RESULT")
})

test_that("tool_choice", {
  # tests for the property `tool_choice` (AssistantsApiToolChoiceOption)

  # uncomment below to test the property
  #expect_equal(model.instance$`tool_choice`, "EXPECTED_RESULT")
})

test_that("response_format", {
  # tests for the property `response_format` (AssistantsApiResponseFormatOption)

  # uncomment below to test the property
  #expect_equal(model.instance$`response_format`, "EXPECTED_RESULT")
})
