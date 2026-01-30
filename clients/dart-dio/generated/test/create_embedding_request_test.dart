import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateEmbeddingRequest
void main() {
  final instance = CreateEmbeddingRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateEmbeddingRequest, () {
    // CreateEmbeddingRequestInput input
    test('to test the property `input`', () async {
      // TODO
    });

    // CreateEmbeddingRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    // String encodingFormat (default value: 'float')
    test('to test the property `encodingFormat`', () async {
      // TODO
    });

    // The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
    // int dimensions
    test('to test the property `dimensions`', () async {
      // TODO
    });

    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    // String user
    test('to test the property `user`', () async {
      // TODO
    });

  });
}
