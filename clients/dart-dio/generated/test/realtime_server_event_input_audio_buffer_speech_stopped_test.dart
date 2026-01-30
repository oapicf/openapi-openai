import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventInputAudioBufferSpeechStopped
void main() {
  final instance = RealtimeServerEventInputAudioBufferSpeechStoppedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventInputAudioBufferSpeechStopped, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `input_audio_buffer.speech_stopped`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
    // int audioEndMs
    test('to test the property `audioEndMs`', () async {
      // TODO
    });

    // The ID of the user message item that will be created.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

  });
}
