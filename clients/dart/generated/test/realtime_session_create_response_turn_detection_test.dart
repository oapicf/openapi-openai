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

// tests for RealtimeSessionCreateResponseTurnDetection
void main() {
  // final instance = RealtimeSessionCreateResponseTurnDetection();

  group('test RealtimeSessionCreateResponseTurnDetection', () {
    // Type of turn detection, only `server_vad` is currently supported. 
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
    // num threshold
    test('to test the property `threshold`', () async {
      // TODO
    });

    // Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
    // int prefixPaddingMs
    test('to test the property `prefixPaddingMs`', () async {
      // TODO
    });

    // Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
    // int silenceDurationMs
    test('to test the property `silenceDurationMs`', () async {
      // TODO
    });


  });

}
