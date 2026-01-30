import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Upload
void main() {
  final instance = UploadBuilder();
  // TODO add properties to the builder and call build()

  group(Upload, () {
    // The Upload unique identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the Upload was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The name of the file to be uploaded.
    // String filename
    test('to test the property `filename`', () async {
      // TODO
    });

    // The intended number of bytes to be uploaded.
    // int bytes
    test('to test the property `bytes`', () async {
      // TODO
    });

    // The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
    // String purpose
    test('to test the property `purpose`', () async {
      // TODO
    });

    // The status of the Upload.
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the Upload was created.
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

    // The object type, which is always \"upload\".
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // OpenAIFile file
    test('to test the property `file`', () async {
      // TODO
    });

  });
}
