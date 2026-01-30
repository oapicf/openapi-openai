#ifndef _UsersManager_H_
#define _UsersManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "User.h"
#include "UserDeleteResponse.h"
#include "UserListResponse.h"
#include "UserRoleUpdateRequest.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Users Users
 * \ingroup Operations
 *  @{
 */
class UsersManager {
public:
	UsersManager();
	virtual ~UsersManager();

/*! \brief Deletes a user from the organization.. *Synchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteUserSync(char * accessToken,
	std::string userId, 
	void(* handler)(UserDeleteResponse, Error, void* )
	, void* userData);

/*! \brief Deletes a user from the organization.. *Asynchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteUserAsync(char * accessToken,
	std::string userId, 
	void(* handler)(UserDeleteResponse, Error, void* )
	, void* userData);


/*! \brief Lists all of the users in the organization.. *Synchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUsersSync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(UserListResponse, Error, void* )
	, void* userData);

/*! \brief Lists all of the users in the organization.. *Asynchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listUsersAsync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(UserListResponse, Error, void* )
	, void* userData);


/*! \brief Modifies a user's role in the organization.. *Synchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param userRoleUpdateRequest The new user role to modify. This must be one of `owner` or `member`. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyUserSync(char * accessToken,
	std::string userId, std::shared_ptr<UserRoleUpdateRequest> userRoleUpdateRequest, 
	void(* handler)(User, Error, void* )
	, void* userData);

/*! \brief Modifies a user's role in the organization.. *Asynchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param userRoleUpdateRequest The new user role to modify. This must be one of `owner` or `member`. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyUserAsync(char * accessToken,
	std::string userId, std::shared_ptr<UserRoleUpdateRequest> userRoleUpdateRequest, 
	void(* handler)(User, Error, void* )
	, void* userData);


/*! \brief Retrieves a user by their identifier.. *Synchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveUserSync(char * accessToken,
	std::string userId, 
	void(* handler)(User, Error, void* )
	, void* userData);

/*! \brief Retrieves a user by their identifier.. *Asynchronous*
 *
 * 
 * \param userId The ID of the user. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveUserAsync(char * accessToken,
	std::string userId, 
	void(* handler)(User, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* UsersManager_H_ */
