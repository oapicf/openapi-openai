import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CompleteUploadRequest
void main() {
  final instance = CompleteUploadRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CompleteUploadRequest, () {
    // The ordered list of Part IDs. 
    // BuiltList<String> partIds
    test('to test the property `partIds`', () async {
      // TODO
    });

    // The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
    // String md5
    test('to test the property `md5`', () async {
      // TODO
    });

  });
}
