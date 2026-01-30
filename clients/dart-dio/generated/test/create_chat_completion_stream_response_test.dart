import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionStreamResponse
void main() {
  final instance = CreateChatCompletionStreamResponseBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionStreamResponse, () {
    // A unique identifier for the chat completion. Each chunk has the same ID.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
    // BuiltList<CreateChatCompletionStreamResponseChoicesInner> choices
    test('to test the property `choices`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
    // int created
    test('to test the property `created`', () async {
      // TODO
    });

    // The model to generate the completion.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
    // String serviceTier
    test('to test the property `serviceTier`', () async {
      // TODO
    });

    // This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    // String systemFingerprint
    test('to test the property `systemFingerprint`', () async {
      // TODO
    });

    // The object type, which is always `chat.completion.chunk`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // CreateChatCompletionStreamResponseUsage usage
    test('to test the property `usage`', () async {
      // TODO
    });

  });
}
