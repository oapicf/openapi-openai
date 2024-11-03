import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Image
void main() {
  final instance = ImageBuilder();
  // TODO add properties to the builder and call build()

  group(Image, () {
    // The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
    // String b64Json
    test('to test the property `b64Json`', () async {
      // TODO
    });

    // The URL of the generated image, if `response_format` is `url` (default).
    // String url
    test('to test the property `url`', () async {
      // TODO
    });

    // The prompt that was used to generate the image, if there was any revision to the prompt.
    // String revisedPrompt
    test('to test the property `revisedPrompt`', () async {
      // TODO
    });

  });
}
