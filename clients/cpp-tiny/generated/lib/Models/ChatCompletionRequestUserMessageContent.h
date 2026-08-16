
/*
 * ChatCompletionRequestUserMessage_content.h
 *
 * The contents of the user message. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_content_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_content_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestUserMessageContentPart.h"

namespace Tiny {


/*! \brief The contents of the user message. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestUserMessage_content{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestUserMessage_content();
    ChatCompletionRequestUserMessage_content(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestUserMessage_content();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_content_H_ */
