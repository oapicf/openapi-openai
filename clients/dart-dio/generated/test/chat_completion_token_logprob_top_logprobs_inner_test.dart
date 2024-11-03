import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for ChatCompletionTokenLogprobTopLogprobsInner
void main() {
  final instance = ChatCompletionTokenLogprobTopLogprobsInnerBuilder();
  // TODO add properties to the builder and call build()

  group(ChatCompletionTokenLogprobTopLogprobsInner, () {
    // The token.
    // String token
    test('to test the property `token`', () async {
      // TODO
    });

    // The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    // num logprob
    test('to test the property `logprob`', () async {
      // TODO
    });

    // A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    // BuiltList<int> bytes
    test('to test the property `bytes`', () async {
      // TODO
    });

  });
}
