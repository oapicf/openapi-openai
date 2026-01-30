/*
 * RealtimeServerEventResponseOutputItemDone.h
 *
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 */

#ifndef _RealtimeServerEventResponseOutputItemDone_H_
#define _RealtimeServerEventResponseOutputItemDone_H_


#include <string>
#include "RealtimeConversationItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseOutputItemDone : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseOutputItemDone();
	RealtimeServerEventResponseOutputItemDone(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseOutputItemDone();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID of the server event.
	 */
	std::string getEventId();

	/*! \brief Set The unique ID of the server event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.output_item.done`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.output_item.done`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the Response to which the item belongs.
	 */
	std::string getResponseId();

	/*! \brief Set The ID of the Response to which the item belongs.
	 */
	void setResponseId(std::string  response_id);
	/*! \brief Get The index of the output item in the Response.
	 */
	int getOutputIndex();

	/*! \brief Set The index of the output item in the Response.
	 */
	void setOutputIndex(int  output_index);
	/*! \brief Get 
	 */
	RealtimeConversationItem getItem();

	/*! \brief Set 
	 */
	void setItem(RealtimeConversationItem  item);

private:
	std::string event_id;
	std::string type;
	std::string response_id;
	int output_index;
	RealtimeConversationItem item;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventResponseOutputItemDone_H_ */
