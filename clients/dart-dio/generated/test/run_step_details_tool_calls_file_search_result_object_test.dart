import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunStepDetailsToolCallsFileSearchResultObject
void main() {
  final instance = RunStepDetailsToolCallsFileSearchResultObjectBuilder();
  // TODO add properties to the builder and call build()

  group(RunStepDetailsToolCallsFileSearchResultObject, () {
    // The ID of the file that result was found in.
    // String fileId
    test('to test the property `fileId`', () async {
      // TODO
    });

    // The name of the file that result was found in.
    // String fileName
    test('to test the property `fileName`', () async {
      // TODO
    });

    // The score of the result. All values must be a floating point number between 0 and 1.
    // num score
    test('to test the property `score`', () async {
      // TODO
    });

    // The content of the result that was found. The content is only included if requested via the include query parameter.
    // BuiltList<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content
    test('to test the property `content`', () async {
      // TODO
    });

  });
}
