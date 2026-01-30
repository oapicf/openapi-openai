import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventRateLimitsUpdatedRateLimitsInner
void main() {
  final instance = RealtimeServerEventRateLimitsUpdatedRateLimitsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventRateLimitsUpdatedRateLimitsInner, () {
    // The name of the rate limit (`requests`, `tokens`). 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The maximum allowed value for the rate limit.
    // int limit
    test('to test the property `limit`', () async {
      // TODO
    });

    // The remaining value before the limit is reached.
    // int remaining
    test('to test the property `remaining`', () async {
      // TODO
    });

    // Seconds until the rate limit resets.
    // num resetSeconds
    test('to test the property `resetSeconds`', () async {
      // TODO
    });

  });
}
