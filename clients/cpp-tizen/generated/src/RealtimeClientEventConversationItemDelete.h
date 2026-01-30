/*
 * RealtimeClientEventConversationItemDelete.h
 *
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 */

#ifndef _RealtimeClientEventConversationItemDelete_H_
#define _RealtimeClientEventConversationItemDelete_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventConversationItemDelete : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventConversationItemDelete();
	RealtimeClientEventConversationItemDelete(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventConversationItemDelete();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Optional client-generated ID used to identify this event.
	 */
	std::string getEventId();

	/*! \brief Set Optional client-generated ID used to identify this event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `conversation.item.delete`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.delete`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the item to delete.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the item to delete.
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

#endif /* _RealtimeClientEventConversationItemDelete_H_ */
