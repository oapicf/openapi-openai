
/*
 * RealtimeServerEventConversationItemDeleted.h
 *
 * Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationItemDeleted_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationItemDeleted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemDeleted{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationItemDeleted();
    RealtimeServerEventConversationItemDeleted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationItemDeleted();


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
    std::string event_id{};
    std::string type{};
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationItemDeleted_H_ */
