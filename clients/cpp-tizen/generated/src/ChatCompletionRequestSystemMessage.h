/*
 * ChatCompletionRequestSystemMessage.h
 *
 * 
 */

#ifndef _ChatCompletionRequestSystemMessage_H_
#define _ChatCompletionRequestSystemMessage_H_


#include <string>
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

class ChatCompletionRequestSystemMessage : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestSystemMessage();
	ChatCompletionRequestSystemMessage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestSystemMessage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The contents of the system message.
	 */
	std::string getContent();

	/*! \brief Set The contents of the system message.
	 */
	void setContent(std::string  content);
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
	std::string content;
	std::string role;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestSystemMessage_H_ */
