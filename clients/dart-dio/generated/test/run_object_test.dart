import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunObject
void main() {
  final instance = RunObjectBuilder();
  // TODO add properties to the builder and call build()

  group(RunObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `thread.run`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
    // String threadId
    test('to test the property `threadId`', () async {
      // TODO
    });

    // The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
    // String assistantId
    test('to test the property `assistantId`', () async {
      // TODO
    });

    // The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // RunObjectRequiredAction requiredAction
    test('to test the property `requiredAction`', () async {
      // TODO
    });

    // RunObjectLastError lastError
    test('to test the property `lastError`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run will expire.
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run was started.
    // int startedAt
    test('to test the property `startedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run was cancelled.
    // int cancelledAt
    test('to test the property `cancelledAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run failed.
    // int failedAt
    test('to test the property `failedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run was completed.
    // int completedAt
    test('to test the property `completedAt`', () async {
      // TODO
    });

    // RunObjectIncompleteDetails incompleteDetails
    test('to test the property `incompleteDetails`', () async {
      // TODO
    });

    // The model that the [assistant](/docs/api-reference/assistants) used for this run.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
    // String instructions
    test('to test the property `instructions`', () async {
      // TODO
    });

    // The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
    // BuiltList<AssistantObjectToolsInner> tools (default value: ListBuilder())
    test('to test the property `tools`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

    // RunCompletionUsage usage
    test('to test the property `usage`', () async {
      // TODO
    });

    // The sampling temperature used for this run. If not set, defaults to 1.
    // num temperature
    test('to test the property `temperature`', () async {
      // TODO
    });

    // The nucleus sampling value used for this run. If not set, defaults to 1.
    // num topP
    test('to test the property `topP`', () async {
      // TODO
    });

    // The maximum number of prompt tokens specified to have been used over the course of the run. 
    // int maxPromptTokens
    test('to test the property `maxPromptTokens`', () async {
      // TODO
    });

    // The maximum number of completion tokens specified to have been used over the course of the run. 
    // int maxCompletionTokens
    test('to test the property `maxCompletionTokens`', () async {
      // TODO
    });

    // TruncationObject truncationStrategy
    test('to test the property `truncationStrategy`', () async {
      // TODO
    });

    // AssistantsApiToolChoiceOption toolChoice
    test('to test the property `toolChoice`', () async {
      // TODO
    });

    // Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
    // bool parallelToolCalls (default value: true)
    test('to test the property `parallelToolCalls`', () async {
      // TODO
    });

    // AssistantsApiResponseFormatOption responseFormat
    test('to test the property `responseFormat`', () async {
      // TODO
    });

  });
}
