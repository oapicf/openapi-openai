/*
 * ChatCompletionRequestUserMessage.h
 *
 * 
 */

#ifndef _ChatCompletionRequestUserMessage_H_
#define _ChatCompletionRequestUserMessage_H_


#include <string>
#include "ChatCompletionRequestUserMessage_content.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestUserMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestUserMessage();
	ChatCompletionRequestUserMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestUserMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string role;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestUserMessage_H_ */
