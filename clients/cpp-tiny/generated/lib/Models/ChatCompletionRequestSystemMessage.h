
/*
 * ChatCompletionRequestSystemMessage.h
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestSystemMessage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestSystemMessage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestSystemMessage_content.h"

namespace Tiny {


/*! \brief Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestSystemMessage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestSystemMessage();
    ChatCompletionRequestSystemMessage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestSystemMessage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ChatCompletionRequestSystemMessage_content getContent();

	/*! \brief Set 
	 */
	void setContent(ChatCompletionRequestSystemMessage_content  content);
	/*! \brief Get The role of the messages author, in this case `system`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `system`.
	 */
	void setRole(std::string  role);
	/*! \brief Get An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	std::string getName();

	/*! \brief Set An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	void setName(std::string  name);


    private:
    ChatCompletionRequestSystemMessage_content content;
    std::string role{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestSystemMessage_H_ */
