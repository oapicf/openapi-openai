import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventConversationItemTruncated
void main() {
  final instance = RealtimeServerEventConversationItemTruncatedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventConversationItemTruncated, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.truncated`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the assistant message item that was truncated.
    // String itemId
    test('to test the property `itemId`', () async {
      // TODO
    });

    // The index of the content part that was truncated.
    // int contentIndex
    test('to test the property `contentIndex`', () async {
      // TODO
    });

    // The duration up to which the audio was truncated, in milliseconds. 
    // int audioEndMs
    test('to test the property `audioEndMs`', () async {
      // TODO
    });

  });
}
