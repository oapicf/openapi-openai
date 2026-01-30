import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for ProjectsApi
void main() {
  final instance = Openapi().getProjectsApi();

  group(ProjectsApi, () {
    // Archives a project in the organization. Archived projects cannot be used or updated.
    //
    //Future<Project> archiveProject(String projectId) async
    test('test archiveProject', () async {
      // TODO
    });

    // Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    //
    //Future<Project> createProject(ProjectCreateRequest projectCreateRequest) async
    test('test createProject', () async {
      // TODO
    });

    // Creates a new service account in the project. This also returns an unredacted API key for the service account.
    //
    //Future<ProjectServiceAccountCreateResponse> createProjectServiceAccount(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) async
    test('test createProjectServiceAccount', () async {
      // TODO
    });

    // Adds a user to the project. Users must already be members of the organization to be added to a project.
    //
    //Future<ProjectUser> createProjectUser(String projectId, ProjectUserCreateRequest projectUserCreateRequest) async
    test('test createProjectUser', () async {
      // TODO
    });

    // Deletes an API key from the project.
    //
    //Future<ProjectApiKeyDeleteResponse> deleteProjectApiKey(String projectId, String keyId) async
    test('test deleteProjectApiKey', () async {
      // TODO
    });

    // Deletes a service account from the project.
    //
    //Future<ProjectServiceAccountDeleteResponse> deleteProjectServiceAccount(String projectId, String serviceAccountId) async
    test('test deleteProjectServiceAccount', () async {
      // TODO
    });

    // Deletes a user from the project.
    //
    //Future<ProjectUserDeleteResponse> deleteProjectUser(String projectId, String userId) async
    test('test deleteProjectUser', () async {
      // TODO
    });

    // Returns a list of API keys in the project.
    //
    //Future<ProjectApiKeyListResponse> listProjectApiKeys(String projectId, { int limit, String after }) async
    test('test listProjectApiKeys', () async {
      // TODO
    });

    // Returns the rate limits per model for a project.
    //
    //Future<ProjectRateLimitListResponse> listProjectRateLimits(String projectId, { int limit, String after, String before }) async
    test('test listProjectRateLimits', () async {
      // TODO
    });

    // Returns a list of service accounts in the project.
    //
    //Future<ProjectServiceAccountListResponse> listProjectServiceAccounts(String projectId, { int limit, String after }) async
    test('test listProjectServiceAccounts', () async {
      // TODO
    });

    // Returns a list of users in the project.
    //
    //Future<ProjectUserListResponse> listProjectUsers(String projectId, { int limit, String after }) async
    test('test listProjectUsers', () async {
      // TODO
    });

    // Returns a list of projects.
    //
    //Future<ProjectListResponse> listProjects({ int limit, String after, bool includeArchived }) async
    test('test listProjects', () async {
      // TODO
    });

    // Modifies a project in the organization.
    //
    //Future<Project> modifyProject(String projectId, ProjectUpdateRequest projectUpdateRequest) async
    test('test modifyProject', () async {
      // TODO
    });

    // Modifies a user's role in the project.
    //
    //Future<ProjectUser> modifyProjectUser(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest) async
    test('test modifyProjectUser', () async {
      // TODO
    });

    // Retrieves a project.
    //
    //Future<Project> retrieveProject(String projectId) async
    test('test retrieveProject', () async {
      // TODO
    });

    // Retrieves an API key in the project.
    //
    //Future<ProjectApiKey> retrieveProjectApiKey(String projectId, String keyId) async
    test('test retrieveProjectApiKey', () async {
      // TODO
    });

    // Retrieves a service account in the project.
    //
    //Future<ProjectServiceAccount> retrieveProjectServiceAccount(String projectId, String serviceAccountId) async
    test('test retrieveProjectServiceAccount', () async {
      // TODO
    });

    // Retrieves a user in the project.
    //
    //Future<ProjectUser> retrieveProjectUser(String projectId, String userId) async
    test('test retrieveProjectUser', () async {
      // TODO
    });

    // Updates a project rate limit.
    //
    //Future<ProjectRateLimit> updateProjectRateLimits(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) async
    test('test updateProjectRateLimits', () async {
      // TODO
    });

  });
}
