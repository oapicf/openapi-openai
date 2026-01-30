import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateThreadRequestToolResourcesFileSearchVectorStoresInner
void main() {
  final instance = CreateThreadRequestToolResourcesFileSearchVectorStoresInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CreateThreadRequestToolResourcesFileSearchVectorStoresInner, () {
    // A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
    // BuiltList<String> fileIds
    test('to test the property `fileIds`', () async {
      // TODO
    });

    // CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy
    test('to test the property `chunkingStrategy`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

  });
}
