
/*
 * RealtimeServerEventConversationCreated.h
 *
 * Returned when a conversation is created. Emitted right after session creation. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeServerEventConversationCreated_conversation.h"

namespace Tiny {


/*! \brief Returned when a conversation is created. Emitted right after session creation. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationCreated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationCreated();
    RealtimeServerEventConversationCreated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationCreated();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string event_id{};
    std::string type{};
    RealtimeServerEventConversationCreated_conversation conversation;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationCreated_H_ */
