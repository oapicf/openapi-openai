/*
 * RealtimeServerEventConversationItemCreated.h
 *
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
 */

#ifndef _RealtimeServerEventConversationItemCreated_H_
#define _RealtimeServerEventConversationItemCreated_H_


#include <string>
#include "RealtimeConversationItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemCreated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationItemCreated();
	RealtimeServerEventConversationItemCreated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationItemCreated();

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
	/*! \brief Get The event type, must be `conversation.item.created`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.created`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
	 */
	std::string getPreviousItemId();

	/*! \brief Set The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
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

#endif /* _RealtimeServerEventConversationItemCreated_H_ */
