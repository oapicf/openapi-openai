import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Project, ProjectApiKey, ProjectApiKeyDeleteResponse, ProjectApiKeyListResponse, ProjectCreateRequest, ProjectListResponse, ProjectRateLimit, ProjectRateLimitListResponse, ProjectRateLimitUpdateRequest, ProjectServiceAccount, ProjectServiceAccountCreateRequest, ProjectServiceAccountCreateResponse, ProjectServiceAccountDeleteResponse, ProjectServiceAccountListResponse, ProjectUpdateRequest, ProjectUser, ProjectUserCreateRequest, ProjectUserDeleteResponse, ProjectUserListResponse, ProjectUserUpdateRequest,  } from '../models';


@Injectable()
export abstract class ProjectsApi {

  abstract archiveProject(projectId: string,  request: Request): Project | Promise<Project> | Observable<Project>;


  abstract createProject(projectCreateRequest: ProjectCreateRequest,  request: Request): Project | Promise<Project> | Observable<Project>;


  abstract createProjectServiceAccount(projectId: string, projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest,  request: Request): ProjectServiceAccountCreateResponse | Promise<ProjectServiceAccountCreateResponse> | Observable<ProjectServiceAccountCreateResponse>;


  abstract createProjectUser(projectId: string, projectUserCreateRequest: ProjectUserCreateRequest,  request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser>;


  abstract deleteProjectApiKey(projectId: string, keyId: string,  request: Request): ProjectApiKeyDeleteResponse | Promise<ProjectApiKeyDeleteResponse> | Observable<ProjectApiKeyDeleteResponse>;


  abstract deleteProjectServiceAccount(projectId: string, serviceAccountId: string,  request: Request): ProjectServiceAccountDeleteResponse | Promise<ProjectServiceAccountDeleteResponse> | Observable<ProjectServiceAccountDeleteResponse>;


  abstract deleteProjectUser(projectId: string, userId: string,  request: Request): ProjectUserDeleteResponse | Promise<ProjectUserDeleteResponse> | Observable<ProjectUserDeleteResponse>;


  abstract listProjectApiKeys(projectId: string, limit: number | undefined, after: string | undefined,  request: Request): ProjectApiKeyListResponse | Promise<ProjectApiKeyListResponse> | Observable<ProjectApiKeyListResponse>;


  abstract listProjectRateLimits(projectId: string, limit: number | undefined, after: string | undefined, before: string | undefined,  request: Request): ProjectRateLimitListResponse | Promise<ProjectRateLimitListResponse> | Observable<ProjectRateLimitListResponse>;


  abstract listProjectServiceAccounts(projectId: string, limit: number | undefined, after: string | undefined,  request: Request): ProjectServiceAccountListResponse | Promise<ProjectServiceAccountListResponse> | Observable<ProjectServiceAccountListResponse>;


  abstract listProjectUsers(projectId: string, limit: number | undefined, after: string | undefined,  request: Request): ProjectUserListResponse | Promise<ProjectUserListResponse> | Observable<ProjectUserListResponse>;


  abstract listProjects(limit: number | undefined, after: string | undefined, includeArchived: boolean | undefined,  request: Request): ProjectListResponse | Promise<ProjectListResponse> | Observable<ProjectListResponse>;


  abstract modifyProject(projectId: string, projectUpdateRequest: ProjectUpdateRequest,  request: Request): Project | Promise<Project> | Observable<Project>;


  abstract modifyProjectUser(projectId: string, userId: string, projectUserUpdateRequest: ProjectUserUpdateRequest,  request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser>;


  abstract retrieveProject(projectId: string,  request: Request): Project | Promise<Project> | Observable<Project>;


  abstract retrieveProjectApiKey(projectId: string, keyId: string,  request: Request): ProjectApiKey | Promise<ProjectApiKey> | Observable<ProjectApiKey>;


  abstract retrieveProjectServiceAccount(projectId: string, serviceAccountId: string,  request: Request): ProjectServiceAccount | Promise<ProjectServiceAccount> | Observable<ProjectServiceAccount>;


  abstract retrieveProjectUser(projectId: string, userId: string,  request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser>;


  abstract updateProjectRateLimits(projectId: string, rateLimitId: string, projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest,  request: Request): ProjectRateLimit | Promise<ProjectRateLimit> | Observable<ProjectRateLimit>;

} 