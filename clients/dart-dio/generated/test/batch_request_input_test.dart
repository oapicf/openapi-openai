import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for BatchRequestInput
void main() {
  final instance = BatchRequestInputBuilder();
  // TODO add properties to the builder and call build()

  group(BatchRequestInput, () {
    // A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
    // String customId
    test('to test the property `customId`', () async {
      // TODO
    });

    // The HTTP method to be used for the request. Currently only `POST` is supported.
    // String method
    test('to test the property `method`', () async {
      // TODO
    });

    // The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
    // String url
    test('to test the property `url`', () async {
      // TODO
    });

  });
}
