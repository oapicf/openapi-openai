#ifndef TINY_CPP_CLIENT_CompletionsApi_H_
#define TINY_CPP_CLIENT_CompletionsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateCompletionRequest.h"
#include "CreateCompletionResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CompletionsApi : public Service {
public:
    CompletionsApi() = default;

    virtual ~CompletionsApi() = default;

    /**
    * Creates a completion for the provided prompt and parameters..
    *
    * 
    * \param createCompletionRequest  *Required*
    */
    Response<
                CreateCompletionResponse
        >
    createCompletion(
            
            CreateCompletionRequest createCompletionRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CompletionsApi_H_ */