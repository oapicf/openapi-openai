import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for VectorStoreExpirationAfter
void main() {
  final instance = VectorStoreExpirationAfterBuilder();
  // TODO add properties to the builder and call build()

  group(VectorStoreExpirationAfter, () {
    // Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
    // String anchor
    test('to test the property `anchor`', () async {
      // TODO
    });

    // The number of days after the anchor time that the vector store will expire.
    // int days
    test('to test the property `days`', () async {
      // TODO
    });

  });
}
