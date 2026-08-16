
/*
 * ChatCompletionRequestUserMessage.h
 *
 * Messages sent by an end user, containing prompts or additional context information. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestUserMessage_content.h"

namespace Tiny {


/*! \brief Messages sent by an end user, containing prompts or additional context information. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestUserMessage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestUserMessage();
    ChatCompletionRequestUserMessage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestUserMessage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ChatCompletionRequestUserMessage_content getContent();

	/*! \brief Set 
	 */
	void setContent(ChatCompletionRequestUserMessage_content  content);
	/*! \brief Get The role of the messages author, in this case `user`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `user`.
	 */
	void setRole(std::string  role);
	/*! \brief Get An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	std::string getName();

	/*! \brief Set An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	void setName(std::string  name);


    private:
    ChatCompletionRequestUserMessage_content content;
    std::string role{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestUserMessage_H_ */
