import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateCompletionResponse
void main() {
  final instance = CreateCompletionResponseBuilder();
  // TODO add properties to the builder and call build()

  group(CreateCompletionResponse, () {
    // A unique identifier for the completion.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The list of completion choices the model generated for the input prompt.
    // BuiltList<CreateCompletionResponseChoicesInner> choices
    test('to test the property `choices`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the completion was created.
    // int created
    test('to test the property `created`', () async {
      // TODO
    });

    // The model used for completion.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    // String systemFingerprint
    test('to test the property `systemFingerprint`', () async {
      // TODO
    });

    // The object type, which is always \"text_completion\"
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
