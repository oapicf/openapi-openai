import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunStepObjectStepDetails
void main() {
  final instance = RunStepObjectStepDetailsBuilder();
  // TODO add properties to the builder and call build()

  group(RunStepObjectStepDetails, () {
    // Always `message_creation`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // RunStepDetailsMessageCreationObjectMessageCreation messageCreation
    test('to test the property `messageCreation`', () async {
      // TODO
    });

    // An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
    // BuiltList<RunStepDetailsToolCallsObjectToolCallsInner> toolCalls
    test('to test the property `toolCalls`', () async {
      // TODO
    });

  });
}
