import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ChatCompletionStreamOptions
void main() {
  final instance = ChatCompletionStreamOptionsBuilder();
  // TODO add properties to the builder and call build()

  group(ChatCompletionStreamOptions, () {
    // If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
    // bool includeUsage
    test('to test the property `includeUsage`', () async {
      // TODO
    });

  });
}
