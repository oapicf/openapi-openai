import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for VectorStoreObject
void main() {
  final instance = VectorStoreObjectBuilder();
  // TODO add properties to the builder and call build()

  group(VectorStoreObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `vector_store`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the vector store was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The name of the vector store.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The total number of bytes used by the files in the vector store.
    // int usageBytes
    test('to test the property `usageBytes`', () async {
      // TODO
    });

    // VectorStoreObjectFileCounts fileCounts
    test('to test the property `fileCounts`', () async {
      // TODO
    });

    // The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // VectorStoreExpirationAfter expiresAfter
    test('to test the property `expiresAfter`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the vector store will expire.
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the vector store was last active.
    // int lastActiveAt
    test('to test the property `lastActiveAt`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

  });
}
