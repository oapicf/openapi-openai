import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Invite
void main() {
  final instance = InviteBuilder();
  // TODO add properties to the builder and call build()

  group(Invite, () {
    // The object type, which is always `organization.invite`
    // String object
    test('to test the property `object`', () async {
      // TODO
    });

    // The identifier, which can be referenced in API endpoints
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The email address of the individual to whom the invite was sent
    // String email
    test('to test the property `email`', () async {
      // TODO
    });

    // `owner` or `reader`
    // String role
    test('to test the property `role`', () async {
      // TODO
    });

    // `accepted`,`expired`, or `pending`
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the invite was sent.
    // int invitedAt
    test('to test the property `invitedAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the invite expires.
    // int expiresAt
    test('to test the property `expiresAt`', () async {
      // TODO
    });

    // The Unix timestamp (in seconds) of when the invite was accepted.
    // int acceptedAt
    test('to test the property `acceptedAt`', () async {
      // TODO
    });

    // The projects that were granted membership upon acceptance of the invite.
    // BuiltList<InviteProjectsInner> projects
    test('to test the property `projects`', () async {
      // TODO
    });

  });
}
