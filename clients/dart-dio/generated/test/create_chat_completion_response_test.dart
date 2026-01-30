import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionResponse
void main() {
  final instance = CreateChatCompletionResponseBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionResponse, () {
    // A unique identifier for the chat completion.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // A list of chat completion choices. Can be more than one if `n` is greater than 1.
    // BuiltList<CreateChatCompletionResponseChoicesInner> choices
    test('to test the property `choices`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the chat completion was created.
    // int created
    test('to test the property `created`', () async {
      // TODO
    });

    // The model used for the chat completion.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
    // String serviceTier
    test('to test the property `serviceTier`', () async {
      // TODO
    });

    // This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    // String systemFingerprint
    test('to test the property `systemFingerprint`', () async {
      // TODO
    });

    // The object type, which is always `chat.completion`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // CompletionUsage usage
    test('to test the property `usage`', () async {
      // TODO
    });

  });
}
