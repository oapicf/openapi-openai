import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AssistantObject
void main() {
  final instance = AssistantObjectBuilder();
  // TODO add properties to the builder and call build()

  group(AssistantObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `assistant`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the assistant was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The name of the assistant. The maximum length is 256 characters. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The description of the assistant. The maximum length is 512 characters. 
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    // String instructions
    test('to test the property `instructions`', () async {
      // TODO
    });

    // A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
    // BuiltList<AssistantObjectToolsInner> tools (default value: ListBuilder())
    test('to test the property `tools`', () async {
      // TODO
    });

    // A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
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
