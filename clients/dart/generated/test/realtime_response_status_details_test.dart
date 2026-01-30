//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for RealtimeResponseStatusDetails
void main() {
  // final instance = RealtimeResponseStatusDetails();

  group('test RealtimeResponseStatusDetails', () {
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
