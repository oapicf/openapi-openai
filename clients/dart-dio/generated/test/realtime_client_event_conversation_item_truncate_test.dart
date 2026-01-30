import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeClientEventConversationItemTruncate
void main() {
  final instance = RealtimeClientEventConversationItemTruncateBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeClientEventConversationItemTruncate, () {
    // Optional client-generated ID used to identify this event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.truncate`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // The index of the content part to truncate. Set this to 0.
    // int contentIndex
    test('to test the property `contentIndex`', () async {
      // TODO
    });

    // Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
    // int audioEndMs
    test('to test the property `audioEndMs`', () async {
      // TODO
    });

  });
}
