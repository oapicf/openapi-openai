import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ChatCompletionRequestMessage
void main() {
  final instance = ChatCompletionRequestMessageBuilder();
  // TODO add properties to the builder and call build()

  group(ChatCompletionRequestMessage, () {
    // The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // The contents of the message. `content` is required for all messages except assistant messages with function calls.
    // String content
    test('to test the property `content`', () async {
      // TODO
    });

    // The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // ChatCompletionRequestMessageFunctionCall functionCall
    test('to test the property `functionCall`', () async {
      // TODO
    });

  });
}
