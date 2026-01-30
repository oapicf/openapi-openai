import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateUploadRequest
void main() {
  final instance = CreateUploadRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateUploadRequest, () {
    // The name of the file to upload. 
    // String filename
    test('to test the property `filename`', () async {
      // TODO
    });

    // The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
    // String purpose
    test('to test the property `purpose`', () async {
      // TODO
    });

    // The number of bytes in the file you are uploading. 
    // int bytes
    test('to test the property `bytes`', () async {
      // TODO
    });

    // The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
    // String mimeType
    test('to test the property `mimeType`', () async {
      // TODO
    });

  });
}
