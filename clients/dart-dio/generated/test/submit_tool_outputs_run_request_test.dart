import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for SubmitToolOutputsRunRequest
void main() {
  final instance = SubmitToolOutputsRunRequestBuilder();
  // TODO add properties to the builder and call build()

  group(SubmitToolOutputsRunRequest, () {
    // A list of tools for which the outputs are being submitted.
    // BuiltList<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs
    test('to test the property `toolOutputs`', () async {
      // TODO
    });

    // If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
    // bool stream
    test('to test the property `stream`', () async {
      // TODO
    });

  });
}
