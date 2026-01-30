import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for InviteRequest
void main() {
  final instance = InviteRequestBuilder();
  // TODO add properties to the builder and call build()

  group(InviteRequest, () {
    // Send an email to this address
    // String email
    test('to test the property `email`', () async {
      // TODO
    });

    // `owner` or `reader`
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
    // BuiltList<InviteRequestProjectsInner> projects
    test('to test the property `projects`', () async {
      // TODO
    });

  });
}
