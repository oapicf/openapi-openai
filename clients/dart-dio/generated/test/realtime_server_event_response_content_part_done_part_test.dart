import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventResponseContentPartDonePart
void main() {
  final instance = RealtimeServerEventResponseContentPartDonePartBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventResponseContentPartDonePart, () {
    // The content type (\"text\", \"audio\").
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The text content (if type is \"text\").
    // String text
    test('to test the property `text`', () async {
      // TODO
    });

    // Base64-encoded audio data (if type is \"audio\").
    // String audio
    test('to test the property `audio`', () async {
      // TODO
    });

    // The transcript of the audio (if type is \"audio\").
    // String transcript
    test('to test the property `transcript`', () async {
      // TODO
    });

  });
}
