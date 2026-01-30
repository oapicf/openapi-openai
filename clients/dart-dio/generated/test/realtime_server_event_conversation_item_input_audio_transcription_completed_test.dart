import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
void main() {
  final instance = RealtimeServerEventConversationItemInputAudioTranscriptionCompletedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventConversationItemInputAudioTranscriptionCompleted, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.input_audio_transcription.completed`. 
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the user message item containing the audio.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // The index of the content part containing the audio.
    // int contentIndex
    test('to test the property `contentIndex`', () async {
      // TODO
    });

    // The transcribed text.
    // String transcript
    test('to test the property `transcript`', () async {
      // TODO
    });

  });
}
