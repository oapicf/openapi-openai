import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateImageRequest
void main() {
  final instance = CreateImageRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateImageRequest, () {
    // A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
    // String prompt
    test('to test the property `prompt`', () async {
      // TODO
    });

    // CreateImageRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
    // int n (default value: 1)
    test('to test the property `n`', () async {
      // TODO
    });

    // The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    // String quality (default value: 'standard')
    test('to test the property `quality`', () async {
      // TODO
    });

    // The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    // String responseFormat (default value: 'url')
    test('to test the property `responseFormat`', () async {
      // TODO
    });

    // The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    // String size (default value: '1024x1024')
    test('to test the property `size`', () async {
      // TODO
    });

    // The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    // String style (default value: 'vivid')
    test('to test the property `style`', () async {
      // TODO
    });

    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    // String user
    test('to test the property `user`', () async {
      // TODO
    });

  });
}
