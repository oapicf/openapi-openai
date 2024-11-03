/*
 * MessageStreamEvent_oneOf_2.h
 *
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */

#ifndef _MessageStreamEvent_oneOf_2_H_
#define _MessageStreamEvent_oneOf_2_H_


#include <string>
#include "MessageDeltaObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_2 : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageStreamEvent_oneOf_2();
	MessageStreamEvent_oneOf_2(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageStreamEvent_oneOf_2();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	MessageDeltaObject getData();

	/*! \brief Set 
	 */
	void setData(MessageDeltaObject  data);

private:
	std::string event;
	MessageDeltaObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageStreamEvent_oneOf_2_H_ */
