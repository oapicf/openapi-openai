import { User } from './user';


export interface UserListResponse { 
  object: UserListResponse.ObjectEnum;
  data: Array<User>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace UserListResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


