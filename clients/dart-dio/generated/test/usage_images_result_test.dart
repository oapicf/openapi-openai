import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UsageImagesResult
void main() {
  final instance = UsageImagesResultBuilder();
  // TODO add properties to the builder and call build()

  group(UsageImagesResult, () {
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The number of images processed.
    // int images
    test('to test the property `images`', () async {
      // TODO
    });

    // The count of requests made to the model.
    // int numModelRequests
    test('to test the property `numModelRequests`', () async {
      // TODO
    });

    // When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
    // String source_
    test('to test the property `source_`', () async {
      // TODO
    });

    // When `group_by=size`, this field provides the image size of the grouped usage result.
    // String size
    test('to test the property `size`', () async {
      // TODO
    });

    // When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    // String projectId
    test('to test the property `projectId`', () async {
      // TODO
    });

    // When `group_by=user_id`, this field provides the user ID of the grouped usage result.
    // String userId
    test('to test the property `userId`', () async {
      // TODO
    });

    // When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
    // String apiKeyId
    test('to test the property `apiKeyId`', () async {
      // TODO
    });

    // When `group_by=model`, this field provides the model name of the grouped usage result.
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

  });
}
