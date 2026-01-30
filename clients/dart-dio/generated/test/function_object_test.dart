import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for FunctionObject
void main() {
  final instance = FunctionObjectBuilder();
  // TODO add properties to the builder and call build()

  group(FunctionObject, () {
    // A description of what the function does, used by the model to choose when and how to call the function.
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
    // BuiltMap<String, JsonObject> parameters
    test('to test the property `parameters`', () async {
      // TODO
    });

    // Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
    // bool strict (default value: false)
    test('to test the property `strict`', () async {
      // TODO
    });

  });
}
