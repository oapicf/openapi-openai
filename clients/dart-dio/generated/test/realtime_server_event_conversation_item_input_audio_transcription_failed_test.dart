import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventConversationItemInputAudioTranscriptionFailed
void main() {
  final instance = RealtimeServerEventConversationItemInputAudioTranscriptionFailedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventConversationItemInputAudioTranscriptionFailed, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.input_audio_transcription.failed`. 
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the user message item.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // The index of the content part containing the audio.
    // int contentIndex
    test('to test the property `contentIndex`', () async {
      // TODO
    });

    // RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error
    test('to test the property `error`', () async {
      // TODO
    });

  });
}
