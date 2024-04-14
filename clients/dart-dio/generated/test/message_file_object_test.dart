import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for MessageFileObject
void main() {
  final instance = MessageFileObjectBuilder();
  // TODO add properties to the builder and call build()

  group(MessageFileObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `thread.message.file`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the message file was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
    // String messageId
    test('to test the property `messageId`', () async {
      // TODO
    });

  });
}
