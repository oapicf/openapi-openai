import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeClientEventResponseCancel
void main() {
  final instance = RealtimeClientEventResponseCancelBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeClientEventResponseCancel, () {
    // Optional client-generated ID used to identify this event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `response.cancel`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
    // String responseId
    test('to test the property `responseId`', () async {
      // TODO
    });

  });
}
