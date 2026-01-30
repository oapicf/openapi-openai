import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Batch
void main() {
  final instance = BatchBuilder();
  // TODO add properties to the builder and call build()

  group(Batch, () {
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `batch`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The OpenAI API endpoint used by the batch.
    // String endpoint
    test('to test the property `endpoint`', () async {
      // TODO
    });

    // BatchErrors errors
    test('to test the property `errors`', () async {
      // TODO
    });

    // The ID of the input file for the batch.
    // String inputFileId
    test('to test the property `inputFileId`', () async {
      // TODO
    });

    // The time frame within which the batch should be processed.
    // String completionWindow
    test('to test the property `completionWindow`', () async {
      // TODO
    });

    // The current status of the batch.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // The ID of the file containing the outputs of successfully executed requests.
    // String outputFileId
    test('to test the property `outputFileId`', () async {
      // TODO
    });

    // The ID of the file containing the outputs of requests with errors.
    // String errorFileId
    test('to test the property `errorFileId`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch started processing.
    // int inProgressAt
    test('to test the property `inProgressAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch will expire.
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch started finalizing.
    // int finalizingAt
    test('to test the property `finalizingAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch was completed.
    // int completedAt
    test('to test the property `completedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch failed.
    // int failedAt
    test('to test the property `failedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch expired.
    // int expiredAt
    test('to test the property `expiredAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch started cancelling.
    // int cancellingAt
    test('to test the property `cancellingAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the batch was cancelled.
    // int cancelledAt
    test('to test the property `cancelledAt`', () async {
      // TODO
    });

    // BatchRequestCounts requestCounts
    test('to test the property `requestCounts`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

  });
}
