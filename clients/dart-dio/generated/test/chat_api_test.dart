import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ChatApi
void main() {
  final instance = Openapi().getChatApi();

  group(ChatApi, () {
    // Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    //
    //Future<CreateChatCompletionResponse> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) async
    test('test createChatCompletion', () async {
      // TODO
    });

  });
}
