/*
 * RealtimeServerEventConversationItemDeleted.h
 *
 * Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
 */

#ifndef _RealtimeServerEventConversationItemDeleted_H_
#define _RealtimeServerEventConversationItemDeleted_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemDeleted : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationItemDeleted();
	RealtimeServerEventConversationItemDeleted(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationItemDeleted();

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
	/*! \brief Get The event type, must be `conversation.item.deleted`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.deleted`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the item that was deleted.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the item that was deleted.
	 */
	void setItemId(std::string  item_id);

private:
	std::string event_id;
	std::string type;
	std::string item_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventConversationItemDeleted_H_ */
