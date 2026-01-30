import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ListAuditLogsEffectiveAtParameter
void main() {
  final instance = ListAuditLogsEffectiveAtParameterBuilder();
  // TODO add properties to the builder and call build()

  group(ListAuditLogsEffectiveAtParameter, () {
    // Return only events whose `effective_at` (Unix seconds) is greater than this value.
    // int gt
    test('to test the property `gt`', () async {
      // TODO
    });

    // Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
    // int gte
    test('to test the property `gte`', () async {
      // TODO
    });

    // Return only events whose `effective_at` (Unix seconds) is less than this value.
    // int lt
    test('to test the property `lt`', () async {
      // TODO
    });

    // Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
    // int lte
    test('to test the property `lte`', () async {
      // TODO
    });

  });
}
