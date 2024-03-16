import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateEditRequest
void main() {
  final instance = CreateEditRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateEditRequest, () {
    // CreateEditRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // The input text to use as a starting point for the edit.
    // String input (default value: '')
    test('to test the property `input`', () async {
      // TODO
    });

    // The instruction that tells the model how to edit the prompt.
    // String instruction
    test('to test the property `instruction`', () async {
      // TODO
    });

    // How many edits to generate for the input and instruction.
    // int n (default value: 1)
    test('to test the property `n`', () async {
      // TODO
    });

    // What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    // num temperature (default value: 1)
    test('to test the property `temperature`', () async {
      // TODO
    });

    // An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    // num topP (default value: 1)
    test('to test the property `topP`', () async {
      // TODO
    });

  });
}
