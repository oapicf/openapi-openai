import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RunToolCallObject
void main() {
  final instance = RunToolCallObjectBuilder();
  // TODO add properties to the builder and call build()

  group(RunToolCallObject, () {
    // The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The type of tool call the output is required for. For now, this is always `function`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // RunToolCallObjectFunction function_
    test('to test the property `function_`', () async {
      // TODO
    });

  });
}
