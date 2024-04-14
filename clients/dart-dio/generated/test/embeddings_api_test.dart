import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for EmbeddingsApi
void main() {
  final instance = Openapi().getEmbeddingsApi();

  group(EmbeddingsApi, () {
    // Creates an embedding vector representing the input text.
    //
    //Future<CreateEmbeddingResponse> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) async
    test('test createEmbedding', () async {
      // TODO
    });

  });
}
