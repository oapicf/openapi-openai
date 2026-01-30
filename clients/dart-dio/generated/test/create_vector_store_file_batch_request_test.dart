import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateVectorStoreFileBatchRequest
void main() {
  final instance = CreateVectorStoreFileBatchRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateVectorStoreFileBatchRequest, () {
    // A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
    // BuiltList<String> fileIds
    test('to test the property `fileIds`', () async {
      // TODO
    });

    // ChunkingStrategyRequestParam chunkingStrategy
    test('to test the property `chunkingStrategy`', () async {
      // TODO
    });

  });
}
