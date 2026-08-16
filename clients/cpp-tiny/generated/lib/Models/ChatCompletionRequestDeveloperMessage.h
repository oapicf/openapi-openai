
/*
 * ChatCompletionRequestDeveloperMessage.h
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestDeveloperMessage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestDeveloperMessage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestDeveloperMessage_content.h"

namespace Tiny {


/*! \brief Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestDeveloperMessage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestDeveloperMessage();
    ChatCompletionRequestDeveloperMessage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestDeveloperMessage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ChatCompletionRequestDeveloperMessage_content getContent();

	/*! \brief Set 
	 */
	void setContent(ChatCompletionRequestDeveloperMessage_content  content);
	/*! \brief Get The role of the messages author, in this case `developer`.
	 */
	std::string getRole();

	/*! \brief Set The role of the messages author, in this case `developer`.
	 */
	void setRole(std::string  role);
	/*! \brief Get An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	std::string getName();

	/*! \brief Set An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	 */
	void setName(std::string  name);


    private:
    ChatCompletionRequestDeveloperMessage_content content;
    std::string role{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestDeveloperMessage_H_ */
