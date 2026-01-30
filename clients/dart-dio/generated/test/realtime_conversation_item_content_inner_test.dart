import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeConversationItemContentInner
void main() {
  final instance = RealtimeConversationItemContentInnerBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeConversationItemContentInner, () {
    // The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The text content, used for `input_text` and `text` content types. 
    // String text
    test('to test the property `text`', () async {
      // TODO
    });

    // ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Base64-encoded audio bytes, used for `input_audio` content type. 
    // String audio
    test('to test the property `audio`', () async {
      // TODO
    });

    // The transcript of the audio, used for `input_audio` content type. 
    // String transcript
    test('to test the property `transcript`', () async {
      // TODO
    });

  });
}
