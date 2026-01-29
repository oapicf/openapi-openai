import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunObjectLastError
void main() {
  final instance = RunObjectLastErrorBuilder();
  // TODO add properties to the builder and call build()

  group(RunObjectLastError, () {
    // One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
    // String code
    test('to test the property `code`', () async {
      // TODO
    });

    // A human-readable description of the error.
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

  });
}
