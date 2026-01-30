import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventInputAudioBufferSpeechStarted
void main() {
  final instance = RealtimeServerEventInputAudioBufferSpeechStartedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventInputAudioBufferSpeechStarted, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `input_audio_buffer.speech_started`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
    // int audioStartMs
    test('to test the property `audioStartMs`', () async {
      // TODO
    });

    // The ID of the user message item that will be created when speech stops. 
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

  });
}
