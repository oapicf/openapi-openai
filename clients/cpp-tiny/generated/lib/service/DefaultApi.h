#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdminApiKey.h"
#include "Admin_api_keys_create_request.h"
#include "Admin_api_keys_delete_200_response.h"
#include "ApiKeyList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi() = default;

    /**
    * Create an organization admin API key.
    *
    * Create a new admin-level API key for the organization.
    * \param adminApiKeysCreateRequest  *Required*
    */
    Response<
                AdminApiKey
        >
    adminApiKeysCreate(
            
            Admin_api_keys_create_request adminApiKeysCreateRequest
            
    );
    /**
    * Delete an organization admin API key.
    *
    * Delete the specified admin API key.
    * \param keyId  *Required*
    */
    Response<
                Admin_api_keys_delete_200_response
        >
    adminApiKeysDelete(
            
            std::string keyId
            
    );
    /**
    * Retrieve a single organization API key.
    *
    * Get details for a specific organization API key by its ID.
    * \param keyId  *Required*
    */
    Response<
                AdminApiKey
        >
    adminApiKeysGet(
            
            std::string keyId
            
    );
    /**
    * List organization API keys.
    *
    * Retrieve a paginated list of organization admin API keys.
    * \param after 
    * \param order 
    * \param limit 
    */
    Response<
                ApiKeyList
        >
    adminApiKeysList(
            
            std::string after
            , 
            
            std::string order
            , 
            
            int limit
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */