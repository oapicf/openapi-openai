import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventRateLimitsUpdated
void main() {
  final instance = RealtimeServerEventRateLimitsUpdatedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventRateLimitsUpdated, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `rate_limits.updated`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // List of rate limit information.
    // BuiltList<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> rateLimits
    test('to test the property `rateLimits`', () async {
      // TODO
    });

  });
}
