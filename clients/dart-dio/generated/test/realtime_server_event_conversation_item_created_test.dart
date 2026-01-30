import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeServerEventConversationItemCreated
void main() {
  final instance = RealtimeServerEventConversationItemCreatedBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeServerEventConversationItemCreated, () {
    // The unique ID of the server event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.created`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
    // String previousItemId
    test('to test the property `previousItemId`', () async {
      // TODO
    });

    // RealtimeConversationItem item
    test('to test the property `item`', () async {
      // TODO
    });

  });
}
