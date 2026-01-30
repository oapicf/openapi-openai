import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for UploadPart
void main() {
  final instance = UploadPartBuilder();
  // TODO add properties to the builder and call build()

  group(UploadPart, () {
    // The upload Part unique identifier, which can be referenced in API endpoints.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) for when the Part was created.
    // int createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // The ID of the Upload object that this Part was added to.
    // String uploadId
    test('to test the property `uploadId`', () async {
      // TODO
    });

    // The object type, which is always `upload.part`.
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

  });
}
