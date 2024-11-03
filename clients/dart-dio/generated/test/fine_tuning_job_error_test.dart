import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for FineTuningJobError
void main() {
  final instance = FineTuningJobErrorBuilder();
  // TODO add properties to the builder and call build()

  group(FineTuningJobError, () {
    // A machine-readable error code.
    // String code
    test('to test the property `code`', () async {
      // TODO
    });

    // A human-readable error message.
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

    // The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
    // String param
    test('to test the property `param`', () async {
      // TODO
    });

  });
}
