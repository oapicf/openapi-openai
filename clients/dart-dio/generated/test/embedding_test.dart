import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Embedding
void main() {
  final instance = EmbeddingBuilder();
  // TODO add properties to the builder and call build()

  group(Embedding, () {
    // The index of the embedding in the list of embeddings.
    // int index
    test('to test the property `index`', () async {
      // TODO
    });

    // The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
    // BuiltList<num> embedding
    test('to test the property `embedding`', () async {
      // TODO
    });

    // The object type, which is always \"embedding\".
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

  });
}
