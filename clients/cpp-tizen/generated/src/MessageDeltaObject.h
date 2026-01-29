/*
 * MessageDeltaObject.h
 *
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */

#ifndef _MessageDeltaObject_H_
#define _MessageDeltaObject_H_


#include <string>
#include "MessageDeltaObject_delta.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a message delta i.e. any changed fields on a message during streaming. 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaObject();
	MessageDeltaObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier of the message, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier of the message, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.message.delta`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.message.delta`.
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	MessageDeltaObject_delta getDelta();

	/*! \brief Set 
	 */
	void setDelta(MessageDeltaObject_delta  delta);

private:
	std::string id;
	std::string object;
	MessageDeltaObject_delta delta;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaObject_H_ */
