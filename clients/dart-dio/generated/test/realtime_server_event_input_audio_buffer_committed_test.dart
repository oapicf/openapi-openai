import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventInputAudioBufferCommitted
void main() {
  final instance = RealtimeServerEventInputAudioBufferCommittedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventInputAudioBufferCommitted, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `input_audio_buffer.committed`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the preceding item after which the new item will be inserted. 
    // String previousItemId
    test('to test the property `previousItemId`', () async {
      // TODO
    });

    // The ID of the user message item that will be created.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

  });
}
