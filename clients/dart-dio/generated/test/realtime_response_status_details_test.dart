import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeResponseStatusDetails
void main() {
  final instance = RealtimeResponseStatusDetailsBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeResponseStatusDetails, () {
    // The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
    // String reason
    test('to test the property `reason`', () async {
      // TODO
    });

    // RealtimeResponseStatusDetailsError error
    test('to test the property `error`', () async {
      // TODO
    });

  });
}
