import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for FineTuneChatRequestInput
void main() {
  final instance = FineTuneChatRequestInputBuilder();
  // TODO add properties to the builder and call build()

  group(FineTuneChatRequestInput, () {
    // BuiltList<FineTuneChatRequestInputMessagesInner> messages
    test('to test the property `messages`', () async {
      // TODO
    });

    // A list of tools the model may generate JSON inputs for.
    // BuiltList<ChatCompletionTool> tools
    test('to test the property `tools`', () async {
      // TODO
    });

    // Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
    // bool parallelToolCalls (default value: true)
    test('to test the property `parallelToolCalls`', () async {
      // TODO
    });

    // A list of functions the model may generate JSON inputs for.
    // BuiltList<ChatCompletionFunctions> functions
    test('to test the property `functions`', () async {
      // TODO
    });

  });
}
