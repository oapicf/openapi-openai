import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for AuditLogActor
void main() {
  final instance = AuditLogActorBuilder();
  // TODO add properties to the builder and call build()

  group(AuditLogActor, () {
    // The type of actor. Is either `session` or `api_key`.
    // String type
    test('to test the property `type`', () async {
      // TODO
    });

    // AuditLogActorSession session
    test('to test the property `session`', () async {
      // TODO
    });

    // AuditLogActorApiKey apiKey
    test('to test the property `apiKey`', () async {
      // TODO
    });

  });
}
