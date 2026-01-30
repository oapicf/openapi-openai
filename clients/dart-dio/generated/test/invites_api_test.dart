import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for InvitesApi
void main() {
  final instance = Openapi().getInvitesApi();

  group(InvitesApi, () {
    // Delete an invite. If the invite has already been accepted, it cannot be deleted.
    //
    //Future<InviteDeleteResponse> deleteInvite(String inviteId) async
    test('test deleteInvite', () async {
      // TODO
    });

    // Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    //
    //Future<Invite> inviteUser(InviteRequest inviteRequest) async
    test('test inviteUser', () async {
      // TODO
    });

    // Returns a list of invites in the organization.
    //
    //Future<InviteListResponse> listInvites({ int limit, String after }) async
    test('test listInvites', () async {
      // TODO
    });

    // Retrieves an invite.
    //
    //Future<Invite> retrieveInvite(String inviteId) async
    test('test retrieveInvite', () async {
      // TODO
    });

  });
}
