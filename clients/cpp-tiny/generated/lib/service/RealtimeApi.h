#ifndef TINY_CPP_CLIENT_RealtimeApi_H_
#define TINY_CPP_CLIENT_RealtimeApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "RealtimeSessionCreateRequest.h"
#include "RealtimeSessionCreateResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class RealtimeApi : public Service {
public:
    RealtimeApi() = default;

    virtual ~RealtimeApi() = default;

    /**
    * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. .
    *
    * 
    * \param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration. *Required*
    */
    Response<
                RealtimeSessionCreateResponse
        >
    createRealtimeSession(
            
            RealtimeSessionCreateRequest realtimeSessionCreateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_RealtimeApi_H_ */