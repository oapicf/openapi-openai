#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdminApiKey.h"
#include "Admin_api_keys_create_request.h"
#include "Admin_api_keys_delete_200_response.h"
#include "ApiKeyList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Create an organization admin API key. *Synchronous*
 *
 * Create a new admin-level API key for the organization.
 * \param adminApiKeysCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysCreateSync(char * accessToken,
	std::shared_ptr<Admin_api_keys_create_request> adminApiKeysCreateRequest, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData);

/*! \brief Create an organization admin API key. *Asynchronous*
 *
 * Create a new admin-level API key for the organization.
 * \param adminApiKeysCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysCreateAsync(char * accessToken,
	std::shared_ptr<Admin_api_keys_create_request> adminApiKeysCreateRequest, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData);


/*! \brief Delete an organization admin API key. *Synchronous*
 *
 * Delete the specified admin API key.
 * \param keyId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysDeleteSync(char * accessToken,
	std::string keyId, 
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
	, void* userData);

/*! \brief Delete an organization admin API key. *Asynchronous*
 *
 * Delete the specified admin API key.
 * \param keyId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysDeleteAsync(char * accessToken,
	std::string keyId, 
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
	, void* userData);


/*! \brief Retrieve a single organization API key. *Synchronous*
 *
 * Get details for a specific organization API key by its ID.
 * \param keyId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysGetSync(char * accessToken,
	std::string keyId, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData);

/*! \brief Retrieve a single organization API key. *Asynchronous*
 *
 * Get details for a specific organization API key by its ID.
 * \param keyId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysGetAsync(char * accessToken,
	std::string keyId, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData);


/*! \brief List organization API keys. *Synchronous*
 *
 * Retrieve a paginated list of organization admin API keys.
 * \param after 
 * \param order 
 * \param limit 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysListSync(char * accessToken,
	std::string after, std::string order, int limit, 
	void(* handler)(ApiKeyList, Error, void* )
	, void* userData);

/*! \brief List organization API keys. *Asynchronous*
 *
 * Retrieve a paginated list of organization admin API keys.
 * \param after 
 * \param order 
 * \param limit 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adminApiKeysListAsync(char * accessToken,
	std::string after, std::string order, int limit, 
	void(* handler)(ApiKeyList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
