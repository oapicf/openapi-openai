import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { User, UserDeleteResponse, UserListResponse, UserRoleUpdateRequest,  } from '../models';


@Injectable()
export abstract class UsersApi {

  abstract deleteUser(userId: string,  request: Request): UserDeleteResponse | Promise<UserDeleteResponse> | Observable<UserDeleteResponse>;


  abstract listUsers(limit: number | undefined, after: string | undefined,  request: Request): UserListResponse | Promise<UserListResponse> | Observable<UserListResponse>;


  abstract modifyUser(userId: string, userRoleUpdateRequest: UserRoleUpdateRequest,  request: Request): User | Promise<User> | Observable<User>;


  abstract retrieveUser(userId: string,  request: Request): User | Promise<User> | Observable<User>;

} 