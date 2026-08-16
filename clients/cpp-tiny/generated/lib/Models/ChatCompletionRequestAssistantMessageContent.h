
/*
 * ChatCompletionRequestAssistantMessage_content.h
 *
 * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_content_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_content_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestAssistantMessageContentPart.h"

namespace Tiny {


/*! \brief The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestAssistantMessage_content{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestAssistantMessage_content();
    ChatCompletionRequestAssistantMessage_content(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestAssistantMessage_content();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestAssistantMessage_content_H_ */
