import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateAssistantRequestToolResourcesFileSearch
void main() {
  final instance = CreateAssistantRequestToolResourcesFileSearchBuilder();
  // TODO add properties to the builder and call build()

  group(CreateAssistantRequestToolResourcesFileSearch, () {
    // The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
    // BuiltList<String> vectorStoreIds
    test('to test the property `vectorStoreIds`', () async {
      // TODO
    });

    // A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
    // BuiltList<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores
    test('to test the property `vectorStores`', () async {
      // TODO
    });

  });
}
