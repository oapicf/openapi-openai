#ifndef TINY_CPP_CLIENT_ModerationsApi_H_
#define TINY_CPP_CLIENT_ModerationsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateModerationRequest.h"
#include "CreateModerationResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ModerationsApi : public Service {
public:
    ModerationsApi() = default;

    virtual ~ModerationsApi() = default;

    /**
    * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). .
    *
    * 
    * \param createModerationRequest  *Required*
    */
    Response<
                CreateModerationResponse
        >
    createModeration(
            
            CreateModerationRequest createModerationRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ModerationsApi_H_ */