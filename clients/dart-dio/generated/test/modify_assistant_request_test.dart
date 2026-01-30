import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ModifyAssistantRequest
void main() {
  final instance = ModifyAssistantRequestBuilder();
  // TODO add properties to the builder and call build()

  group(ModifyAssistantRequest, () {
    // String model
    test('to test the property `model`', () async {
      // TODO
    });

    // The name of the assistant. The maximum length is 256 characters. 
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // The description of the assistant. The maximum length is 512 characters. 
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    // String instructions
    test('to test the property `instructions`', () async {
      // TODO
    });

    // A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
    // BuiltList<AssistantObjectToolsInner> tools (default value: ListBuilder())
    test('to test the property `tools`', () async {
      // TODO
    });

    // ModifyAssistantRequestToolResources toolResources
    test('to test the property `toolResources`', () async {
      // TODO
    });

    // Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
    // JsonObject metadata
    test('to test the property `metadata`', () async {
      // TODO
    });

    // What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
    // num temperature (default value: 1)
    test('to test the property `temperature`', () async {
      // TODO
    });

    // An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
    // num topP (default value: 1)
    test('to test the property `topP`', () async {
      // TODO
    });

    // AssistantsApiResponseFormatOption responseFormat
    test('to test the property `responseFormat`', () async {
      // TODO
    });

  });
}
