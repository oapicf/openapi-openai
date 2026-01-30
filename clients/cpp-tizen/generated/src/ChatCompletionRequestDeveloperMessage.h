/*
 * ChatCompletionRequestDeveloperMessage.h
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
 */

#ifndef _ChatCompletionRequestDeveloperMessage_H_
#define _ChatCompletionRequestDeveloperMessage_H_


#include <string>
#include "ChatCompletionRequestDeveloperMessage_content.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestDeveloperMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestDeveloperMessage();
	ChatCompletionRequestDeveloperMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestDeveloperMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string role;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestDeveloperMessage_H_ */
