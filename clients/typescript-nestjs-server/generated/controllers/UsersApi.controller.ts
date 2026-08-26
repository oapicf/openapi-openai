import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { UsersApi } from '../api';
import { User, UserDeleteResponse, UserListResponse, UserRoleUpdateRequest,  } from '../models';

@Controller()
export class UsersApiController {
  constructor(private readonly usersApi: UsersApi) {}

  @Delete('/organization/users/:user_id')
  deleteUser(@Param('user_id') userId: string, @Req() request: Request): UserDeleteResponse | Promise<UserDeleteResponse> | Observable<UserDeleteResponse> {
    return this.usersApi.deleteUser(userId, request);
  }

  @Get('/organization/users')
  listUsers(@Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Req() request: Request): UserListResponse | Promise<UserListResponse> | Observable<UserListResponse> {
    return this.usersApi.listUsers(limit, after, request);
  }

  @Post('/organization/users/:user_id')
  modifyUser(@Param('user_id') userId: string, @Body() userRoleUpdateRequest: UserRoleUpdateRequest, @Req() request: Request): User | Promise<User> | Observable<User> {
    return this.usersApi.modifyUser(userId, userRoleUpdateRequest, request);
  }

  @Get('/organization/users/:user_id')
  retrieveUser(@Param('user_id') userId: string, @Req() request: Request): User | Promise<User> | Observable<User> {
    return this.usersApi.retrieveUser(userId, request);
  }

} 