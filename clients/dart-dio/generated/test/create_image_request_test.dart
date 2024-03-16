import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateImageRequest
void main() {
  final instance = CreateImageRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateImageRequest, () {
    // A text description of the desired image(s). The maximum length is 1000 characters.
    // String prompt
    test('to test the property `prompt`', () async {
      // TODO
    });

    // The number of images to generate. Must be between 1 and 10.
    // int n (default value: 1)
    test('to test the property `n`', () async {
      // TODO
    });

    // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
    // String size (default value: '1024x1024')
    test('to test the property `size`', () async {
      // TODO
    });

    // The format in which the generated images are returned. Must be one of `url` or `b64_json`.
    // String responseFormat (default value: 'url')
    test('to test the property `responseFormat`', () async {
      // TODO
    });

    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    // String user
    test('to test the property `user`', () async {
      // TODO
    });

  });
}
