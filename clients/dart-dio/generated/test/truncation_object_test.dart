import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for TruncationObject
void main() {
  final instance = TruncationObjectBuilder();
  // TODO add properties to the builder and call build()

  group(TruncationObject, () {
    // The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // The number of most recent messages from the thread when constructing the context for the run.
    // int lastMessages
    test('to test the property `lastMessages`', () async {
      // TODO
    });

  });
}
