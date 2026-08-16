
/*
 * ChatCompletionRequestToolMessage_content.h
 *
 * The contents of the tool message.
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_content_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_content_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestMessageContentPartText.h"

namespace Tiny {


/*! \brief The contents of the tool message.
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestToolMessage_content{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestToolMessage_content();
    ChatCompletionRequestToolMessage_content(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestToolMessage_content();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestToolMessage_content_H_ */
