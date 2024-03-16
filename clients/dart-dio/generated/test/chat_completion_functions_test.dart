import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ChatCompletionFunctions
void main() {
  final instance = ChatCompletionFunctionsBuilder();
  // TODO add properties to the builder and call build()

  group(ChatCompletionFunctions, () {
    // The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The description of what the function does.
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
    // BuiltMap<String, JsonObject> parameters
    test('to test the property `parameters`', () async {
      // TODO
    });

  });
}
