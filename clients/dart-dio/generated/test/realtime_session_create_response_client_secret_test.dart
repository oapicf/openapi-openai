import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for RealtimeSessionCreateResponseClientSecret
void main() {
  final instance = RealtimeSessionCreateResponseClientSecretBuilder();
  // TODO add properties to the builder and call build()

  group(RealtimeSessionCreateResponseClientSecret, () {
    // Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
    // String value
    test('to test the property `value`', () async {
      // TODO
    });

    // Timestamp for when the token expires. Currently, all tokens expire after one minute. 
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

  });
}
