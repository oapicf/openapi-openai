import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeClientEventInputAudioBufferAppend
void main() {
  final instance = RealtimeClientEventInputAudioBufferAppendBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeClientEventInputAudioBufferAppend, () {
    // Optional client-generated ID used to identify this event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `input_audio_buffer.append`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
    // String audio
    test('to test the property `audio`', () async {
      // TODO
    });

  });
}
