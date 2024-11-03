/*
 * MessageStreamEvent.h
 *
 * 
 */

#ifndef _MessageStreamEvent_H_
#define _MessageStreamEvent_H_


#include <string>
#include "MessageObject.h"
#include "MessageStreamEvent_oneOf.h"
#include "MessageStreamEvent_oneOf_1.h"
#include "MessageStreamEvent_oneOf_2.h"
#include "MessageStreamEvent_oneOf_3.h"
#include "MessageStreamEvent_oneOf_4.h"
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

class MessageStreamEvent : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageStreamEvent();
	MessageStreamEvent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageStreamEvent();

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

#endif /* _MessageStreamEvent_H_ */
