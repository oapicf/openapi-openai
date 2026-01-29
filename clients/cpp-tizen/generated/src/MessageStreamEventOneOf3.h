/*
 * MessageStreamEvent_oneOf_3.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */

#ifndef _MessageStreamEvent_oneOf_3_H_
#define _MessageStreamEvent_oneOf_3_H_


#include <string>
#include "MessageObject.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Occurs when a [message](/docs/api-reference/messages/object) is completed.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_3 : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageStreamEvent_oneOf_3();
	MessageStreamEvent_oneOf_3(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageStreamEvent_oneOf_3();

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
	MessageObject getData();

	/*! \brief Set 
	 */
	void setData(MessageObject  data);

private:
	std::string event;
	MessageObject data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageStreamEvent_oneOf_3_H_ */
