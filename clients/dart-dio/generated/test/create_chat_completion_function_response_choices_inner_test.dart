import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionFunctionResponseChoicesInner
void main() {
  final instance = CreateChatCompletionFunctionResponseChoicesInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionFunctionResponseChoicesInner, () {
    // The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
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

  });
}
