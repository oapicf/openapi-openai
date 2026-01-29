import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for CompletionsApi
void main() {
  final instance = Openapi().getCompletionsApi();

  group(CompletionsApi, () {
    // Creates a completion for the provided prompt and parameters.
    //
    //Future<CreateCompletionResponse> createCompletion(CreateCompletionRequest createCompletionRequest) async
    test('test createCompletion', () async {
      // TODO
    });

  });
}
