import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { ProjectsApi } from '../api';
import { Project, ProjectApiKey, ProjectApiKeyDeleteResponse, ProjectApiKeyListResponse, ProjectCreateRequest, ProjectListResponse, ProjectRateLimit, ProjectRateLimitListResponse, ProjectRateLimitUpdateRequest, ProjectServiceAccount, ProjectServiceAccountCreateRequest, ProjectServiceAccountCreateResponse, ProjectServiceAccountDeleteResponse, ProjectServiceAccountListResponse, ProjectUpdateRequest, ProjectUser, ProjectUserCreateRequest, ProjectUserDeleteResponse, ProjectUserListResponse, ProjectUserUpdateRequest,  } from '../models';

@Controller()
export class ProjectsApiController {
  constructor(private readonly projectsApi: ProjectsApi) {}

  @Post('/organization/projects/:project_id/archive')
  archiveProject(@Param('project_id') projectId: string, @Req() request: Request): Project | Promise<Project> | Observable<Project> {
    return this.projectsApi.archiveProject(projectId, request);
  }

  @Post('/organization/projects')
  createProject(@Body() projectCreateRequest: ProjectCreateRequest, @Req() request: Request): Project | Promise<Project> | Observable<Project> {
    return this.projectsApi.createProject(projectCreateRequest, request);
  }

  @Post('/organization/projects/:project_id/service_accounts')
  createProjectServiceAccount(@Param('project_id') projectId: string, @Body() projectServiceAccountCreateRequest: ProjectServiceAccountCreateRequest, @Req() request: Request): ProjectServiceAccountCreateResponse | Promise<ProjectServiceAccountCreateResponse> | Observable<ProjectServiceAccountCreateResponse> {
    return this.projectsApi.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest, request);
  }

  @Post('/organization/projects/:project_id/users')
  createProjectUser(@Param('project_id') projectId: string, @Body() projectUserCreateRequest: ProjectUserCreateRequest, @Req() request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser> {
    return this.projectsApi.createProjectUser(projectId, projectUserCreateRequest, request);
  }

  @Delete('/organization/projects/:project_id/api_keys/:key_id')
  deleteProjectApiKey(@Param('project_id') projectId: string, @Param('key_id') keyId: string, @Req() request: Request): ProjectApiKeyDeleteResponse | Promise<ProjectApiKeyDeleteResponse> | Observable<ProjectApiKeyDeleteResponse> {
    return this.projectsApi.deleteProjectApiKey(projectId, keyId, request);
  }

  @Delete('/organization/projects/:project_id/service_accounts/:service_account_id')
  deleteProjectServiceAccount(@Param('project_id') projectId: string, @Param('service_account_id') serviceAccountId: string, @Req() request: Request): ProjectServiceAccountDeleteResponse | Promise<ProjectServiceAccountDeleteResponse> | Observable<ProjectServiceAccountDeleteResponse> {
    return this.projectsApi.deleteProjectServiceAccount(projectId, serviceAccountId, request);
  }

  @Delete('/organization/projects/:project_id/users/:user_id')
  deleteProjectUser(@Param('project_id') projectId: string, @Param('user_id') userId: string, @Req() request: Request): ProjectUserDeleteResponse | Promise<ProjectUserDeleteResponse> | Observable<ProjectUserDeleteResponse> {
    return this.projectsApi.deleteProjectUser(projectId, userId, request);
  }

  @Get('/organization/projects/:project_id/api_keys')
  listProjectApiKeys(@Param('project_id') projectId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Req() request: Request): ProjectApiKeyListResponse | Promise<ProjectApiKeyListResponse> | Observable<ProjectApiKeyListResponse> {
    return this.projectsApi.listProjectApiKeys(projectId, limit, after, request);
  }

  @Get('/organization/projects/:project_id/rate_limits')
  listProjectRateLimits(@Param('project_id') projectId: string, @Query('limit', new DefaultValuePipe(100)) limit: number | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Req() request: Request): ProjectRateLimitListResponse | Promise<ProjectRateLimitListResponse> | Observable<ProjectRateLimitListResponse> {
    return this.projectsApi.listProjectRateLimits(projectId, limit, after, before, request);
  }

  @Get('/organization/projects/:project_id/service_accounts')
  listProjectServiceAccounts(@Param('project_id') projectId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Req() request: Request): ProjectServiceAccountListResponse | Promise<ProjectServiceAccountListResponse> | Observable<ProjectServiceAccountListResponse> {
    return this.projectsApi.listProjectServiceAccounts(projectId, limit, after, request);
  }

  @Get('/organization/projects/:project_id/users')
  listProjectUsers(@Param('project_id') projectId: string, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Req() request: Request): ProjectUserListResponse | Promise<ProjectUserListResponse> | Observable<ProjectUserListResponse> {
    return this.projectsApi.listProjectUsers(projectId, limit, after, request);
  }

  @Get('/organization/projects')
  listProjects(@Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Query('include_archived', new DefaultValuePipe(false)) includeArchived: boolean | undefined, @Req() request: Request): ProjectListResponse | Promise<ProjectListResponse> | Observable<ProjectListResponse> {
    return this.projectsApi.listProjects(limit, after, includeArchived, request);
  }

  @Post('/organization/projects/:project_id')
  modifyProject(@Param('project_id') projectId: string, @Body() projectUpdateRequest: ProjectUpdateRequest, @Req() request: Request): Project | Promise<Project> | Observable<Project> {
    return this.projectsApi.modifyProject(projectId, projectUpdateRequest, request);
  }

  @Post('/organization/projects/:project_id/users/:user_id')
  modifyProjectUser(@Param('project_id') projectId: string, @Param('user_id') userId: string, @Body() projectUserUpdateRequest: ProjectUserUpdateRequest, @Req() request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser> {
    return this.projectsApi.modifyProjectUser(projectId, userId, projectUserUpdateRequest, request);
  }

  @Get('/organization/projects/:project_id')
  retrieveProject(@Param('project_id') projectId: string, @Req() request: Request): Project | Promise<Project> | Observable<Project> {
    return this.projectsApi.retrieveProject(projectId, request);
  }

  @Get('/organization/projects/:project_id/api_keys/:key_id')
  retrieveProjectApiKey(@Param('project_id') projectId: string, @Param('key_id') keyId: string, @Req() request: Request): ProjectApiKey | Promise<ProjectApiKey> | Observable<ProjectApiKey> {
    return this.projectsApi.retrieveProjectApiKey(projectId, keyId, request);
  }

  @Get('/organization/projects/:project_id/service_accounts/:service_account_id')
  retrieveProjectServiceAccount(@Param('project_id') projectId: string, @Param('service_account_id') serviceAccountId: string, @Req() request: Request): ProjectServiceAccount | Promise<ProjectServiceAccount> | Observable<ProjectServiceAccount> {
    return this.projectsApi.retrieveProjectServiceAccount(projectId, serviceAccountId, request);
  }

  @Get('/organization/projects/:project_id/users/:user_id')
  retrieveProjectUser(@Param('project_id') projectId: string, @Param('user_id') userId: string, @Req() request: Request): ProjectUser | Promise<ProjectUser> | Observable<ProjectUser> {
    return this.projectsApi.retrieveProjectUser(projectId, userId, request);
  }

  @Post('/organization/projects/:project_id/rate_limits/:rate_limit_id')
  updateProjectRateLimits(@Param('project_id') projectId: string, @Param('rate_limit_id') rateLimitId: string, @Body() projectRateLimitUpdateRequest: ProjectRateLimitUpdateRequest, @Req() request: Request): ProjectRateLimit | Promise<ProjectRateLimit> | Observable<ProjectRateLimit> {
    return this.projectsApi.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest, request);
  }

} 