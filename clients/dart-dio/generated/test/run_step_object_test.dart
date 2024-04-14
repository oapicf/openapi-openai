import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunStepObject
void main() {
  final instance = RunStepObjectBuilder();
  // TODO add properties to the builder and call build()

  group(RunStepObject, () {
    // The identifier of the run step, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `thread.run.step`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run step was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    // String assistantId
    test('to test the property `assistantId`', () async {
      // TODO
    });

    // The ID of the [thread](/docs/api-reference/threads) that was run.
    // String threadId
    test('to test the property `threadId`', () async {
      // TODO
    });

    // The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    // String runId
    test('to test the property `runId`', () async {
      // TODO
    });

    // The type of run step, which can be either `message_creation` or `tool_calls`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // RunStepObjectStepDetails stepDetails
    test('to test the property `stepDetails`', () async {
      // TODO
    });

    // RunStepObjectLastError lastError
    test('to test the property `lastError`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    // int expiredAt
    test('to test the property `expiredAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run step was cancelled.
    // int cancelledAt
    test('to test the property `cancelledAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run step failed.
    // int failedAt
    test('to test the property `failedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the run step completed.
    // int completedAt
    test('to test the property `completedAt`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

    // RunStepCompletionUsage usage
    test('to test the property `usage`', () async {
      // TODO
    });

  });
}
