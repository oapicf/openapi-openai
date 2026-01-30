/*
 * RealtimeServerEventConversationCreated.h
 *
 * Returned when a conversation is created. Emitted right after session creation. 
 */

#ifndef _RealtimeServerEventConversationCreated_H_
#define _RealtimeServerEventConversationCreated_H_


#include <string>
#include "RealtimeServerEventConversationCreated_conversation.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a conversation is created. Emitted right after session creation. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationCreated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationCreated();
	RealtimeServerEventConversationCreated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationCreated();

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
	/*! \brief Get The event type, must be `conversation.created`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.created`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeServerEventConversationCreated_conversation getConversation();

	/*! \brief Set 
	 */
	void setConversation(RealtimeServerEventConversationCreated_conversation  conversation);

private:
	std::string event_id;
	std::string type;
	RealtimeServerEventConversationCreated_conversation conversation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventConversationCreated_H_ */
