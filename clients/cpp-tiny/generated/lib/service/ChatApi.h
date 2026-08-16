#ifndef TINY_CPP_CLIENT_ChatApi_H_
#define TINY_CPP_CLIENT_ChatApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateChatCompletionRequest.h"
#include "CreateChatCompletionResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ChatApi : public Service {
public:
    ChatApi() = default;

    virtual ~ChatApi() = default;

    /**
    * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). .
    *
    * 
    * \param createChatCompletionRequest  *Required*
    */
    Response<
                CreateChatCompletionResponse
        >
    createChatCompletion(
            
            CreateChatCompletionRequest createChatCompletionRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ChatApi_H_ */