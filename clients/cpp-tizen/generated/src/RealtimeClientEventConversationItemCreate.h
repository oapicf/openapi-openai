/*
 * RealtimeClientEventConversationItemCreate.h
 *
 * Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
 */

#ifndef _RealtimeClientEventConversationItemCreate_H_
#define _RealtimeClientEventConversationItemCreate_H_


#include <string>
#include "RealtimeConversationItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventConversationItemCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventConversationItemCreate();
	RealtimeClientEventConversationItemCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventConversationItemCreate();

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
	/*! \brief Get The event type, must be `conversation.item.create`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.create`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
	 */
	std::string getPreviousItemId();

	/*! \brief Set The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
	 */
	void setPreviousItemId(std::string  previous_item_id);
	/*! \brief Get 
	 */
	RealtimeConversationItem getItem();

	/*! \brief Set 
	 */
	void setItem(RealtimeConversationItem  item);

private:
	std::string event_id;
	std::string type;
	std::string previous_item_id;
	RealtimeConversationItem item;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventConversationItemCreate_H_ */
