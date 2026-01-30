import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeSessionCreateResponseTurnDetection
void main() {
  final instance = RealtimeSessionCreateResponseTurnDetectionBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeSessionCreateResponseTurnDetection, () {
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
