import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateCompletionResponseChoicesInner
void main() {
  final instance = CreateCompletionResponseChoicesInnerBuilder();
  // TODO add properties to the builder and call build()

  group(CreateCompletionResponseChoicesInner, () {
    // The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    // String finishReason
    test('to test the property `finishReason`', () async {
      // TODO
    });

    // int index
    test('to test the property `index`', () async {
      // TODO
    });

    // CreateCompletionResponseChoicesInnerLogprobs logprobs
    test('to test the property `logprobs`', () async {
      // TODO
    });

    // String text
    test('to test the property `text`', () async {
      // TODO
    });

  });
}
