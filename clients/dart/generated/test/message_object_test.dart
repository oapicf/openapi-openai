//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for MessageObject
void main() {
  // final instance = MessageObject();

  group('test MessageObject', () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `thread.message`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the message was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The [thread](/docs/api-reference/threads) ID that this message belongs to.
    // String threadId
    test('to test the property `threadId`', () async {
      // TODO
    });

    // The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // MessageObjectIncompleteDetails incompleteDetails
    test('to test the property `incompleteDetails`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the message was completed.
    // int completedAt
    test('to test the property `completedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the message was marked as incomplete.
    // int incompleteAt
    test('to test the property `incompleteAt`', () async {
      // TODO
    });

    // The entity that produced the message. One of `user` or `assistant`.
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // The content of the message in array of text and/or images.
    // List<MessageObjectContentInner> content (default value: const [])
    test('to test the property `content`', () async {
      // TODO
    });

    // If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
    // String assistantId
    test('to test the property `assistantId`', () async {
      // TODO
    });

    // The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
    // String runId
    test('to test the property `runId`', () async {
      // TODO
    });

    // A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
    // List<String> fileIds (default value: const [])
    test('to test the property `fileIds`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    // Object metadata
    test('to test the property `metadata`', () async {
      // TODO
    });


  });

}
