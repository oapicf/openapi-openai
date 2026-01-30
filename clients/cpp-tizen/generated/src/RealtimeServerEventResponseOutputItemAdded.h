/*
 * RealtimeServerEventResponseOutputItemAdded.h
 *
 * Returned when a new Item is created during Response generation.
 */

#ifndef _RealtimeServerEventResponseOutputItemAdded_H_
#define _RealtimeServerEventResponseOutputItemAdded_H_


#include <string>
#include "RealtimeConversationItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a new Item is created during Response generation.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseOutputItemAdded : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseOutputItemAdded();
	RealtimeServerEventResponseOutputItemAdded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseOutputItemAdded();

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
	/*! \brief Get The event type, must be `response.output_item.added`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.output_item.added`.
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

#endif /* _RealtimeServerEventResponseOutputItemAdded_H_ */
