/*
 * MessageFileObject.h
 *
 * A list of files attached to a &#x60;message&#x60;.
 */

#ifndef _MessageFileObject_H_
#define _MessageFileObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A list of files attached to a `message`.
 *
 *  \ingroup Models
 *
 */

class MessageFileObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageFileObject();
	MessageFileObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageFileObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.message.file`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.message.file`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the message file was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the message file was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
	 */
	std::string getMessageId();

	/*! \brief Set The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
	 */
	void setMessageId(std::string  message_id);

private:
	std::string id;
	std::string object;
	int created_at;
	std::string message_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageFileObject_H_ */
