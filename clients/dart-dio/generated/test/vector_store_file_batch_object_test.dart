import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for VectorStoreFileBatchObject
void main() {
  final instance = VectorStoreFileBatchObjectBuilder();
  // TODO add properties to the builder and call build()

  group(VectorStoreFileBatchObject, () {
    // The identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The object type, which is always `vector_store.file_batch`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the vector store files batch was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
    // String vectorStoreId
    test('to test the property `vectorStoreId`', () async {
      // TODO
    });

    // The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // VectorStoreFileBatchObjectFileCounts fileCounts
    test('to test the property `fileCounts`', () async {
      // TODO
    });

  });
}
