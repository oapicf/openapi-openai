import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ThreadObject
void main() {
  final instance = ThreadObjectBuilder();
  // TODO add properties to the builder and call build()

  group(ThreadObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `thread`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the thread was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

  });
}
