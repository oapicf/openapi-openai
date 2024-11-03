import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionResponseChoicesInner
void main() {
  final instance = CreateChatCompletionResponseChoicesInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionResponseChoicesInner, () {
    // The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
    // String finishReason
    test('to test the property `finishReason`', () async {
      // TODO
    });

    // The index of the choice in the list of choices.
    // int index
    test('to test the property `index`', () async {
      // TODO
    });

    // ChatCompletionResponseMessage message
    test('to test the property `message`', () async {
      // TODO
    });

    // CreateChatCompletionResponseChoicesInnerLogprobs logprobs
    test('to test the property `logprobs`', () async {
      // TODO
    });

  });
}
