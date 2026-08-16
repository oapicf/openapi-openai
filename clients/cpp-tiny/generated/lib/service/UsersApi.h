#ifndef TINY_CPP_CLIENT_UsersApi_H_
#define TINY_CPP_CLIENT_UsersApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "User.h"
#include "UserDeleteResponse.h"
#include "UserListResponse.h"
#include "UserRoleUpdateRequest.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class UsersApi : public Service {
public:
    UsersApi() = default;

    virtual ~UsersApi() = default;

    /**
    * Deletes a user from the organization..
    *
    * 
    * \param userId The ID of the user. *Required*
    */
    Response<
                UserDeleteResponse
        >
    deleteUser(
            
            std::string userId
            
    );
    /**
    * Lists all of the users in the organization..
    *
    * 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                UserListResponse
        >
    listUsers(
            
            int limit
            , 
            
            std::string after
            
    );
    /**
    * Modifies a user's role in the organization..
    *
    * 
    * \param userId The ID of the user. *Required*
    * \param userRoleUpdateRequest The new user role to modify. This must be one of `owner` or `member`. *Required*
    */
    Response<
                User
        >
    modifyUser(
            
            std::string userId
            , 
            
            UserRoleUpdateRequest userRoleUpdateRequest
            
    );
    /**
    * Retrieves a user by their identifier..
    *
    * 
    * \param userId The ID of the user. *Required*
    */
    Response<
                User
        >
    retrieveUser(
            
            std::string userId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_UsersApi_H_ */