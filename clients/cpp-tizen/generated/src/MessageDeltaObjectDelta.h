/*
 * MessageDeltaObject_delta.h
 *
 * The delta containing the fields that have changed on the Message.
 */

#ifndef _MessageDeltaObject_delta_H_
#define _MessageDeltaObject_delta_H_


#include <string>
#include "MessageDeltaObject_delta_content_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The delta containing the fields that have changed on the Message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaObject_delta : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaObject_delta();
	MessageDeltaObject_delta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaObject_delta();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The entity that produced the message. One of `user` or `assistant`.
	 */
	std::string getRole();

	/*! \brief Set The entity that produced the message. One of `user` or `assistant`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The content of the message in array of text and/or images.
	 */
	std::list<MessageDeltaObject_delta_content_inner> getContent();

	/*! \brief Set The content of the message in array of text and/or images.
	 */
	void setContent(std::list <MessageDeltaObject_delta_content_inner> content);
	/*! \brief Get A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
	 */
	void setFileIds(std::list <std::string> file_ids);

private:
	std::string role;
	std::list <MessageDeltaObject_delta_content_inner>content;
	std::list <std::string>file_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaObject_delta_H_ */
