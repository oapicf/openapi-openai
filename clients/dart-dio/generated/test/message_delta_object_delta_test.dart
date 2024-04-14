import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for MessageDeltaObjectDelta
void main() {
  final instance = MessageDeltaObjectDeltaBuilder();
  // TODO add properties to the builder and call build()

  group(MessageDeltaObjectDelta, () {
    // The entity that produced the message. One of `user` or `assistant`.
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // The content of the message in array of text and/or images.
    // BuiltList<MessageDeltaObjectDeltaContentInner> content
    test('to test the property `content`', () async {
      // TODO
    });

    // A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
    // BuiltList<String> fileIds (default value: ListBuilder())
    test('to test the property `fileIds`', () async {
      // TODO
    });

  });
}
