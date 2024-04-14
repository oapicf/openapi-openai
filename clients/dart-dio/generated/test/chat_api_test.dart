import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ChatApi
void main() {
  final instance = Openapi().getChatApi();

  group(ChatApi, () {
    // Creates a model response for the given chat conversation.
    //
    //Future<CreateChatCompletionResponse> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) async
    test('test createChatCompletion', () async {
      // TODO
    });

  });
}
