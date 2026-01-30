import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeClientEventConversationItemCreate
void main() {
  final instance = RealtimeClientEventConversationItemCreateBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeClientEventConversationItemCreate, () {
    // Optional client-generated ID used to identify this event.
    // String eventId
    test('to test the property `eventId`', () async {
      // TODO
    });

    // The event type, must be `conversation.item.create`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
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
