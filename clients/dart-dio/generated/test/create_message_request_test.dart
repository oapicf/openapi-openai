import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateMessageRequest
void main() {
  final instance = CreateMessageRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateMessageRequest, () {
    // The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // The content of the message.
    // String content
    test('to test the property `content`', () async {
      // TODO
    });

    // A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
    // BuiltList<String> fileIds (default value: ListBuilder())
    test('to test the property `fileIds`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

  });
}