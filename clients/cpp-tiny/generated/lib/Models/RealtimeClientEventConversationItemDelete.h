
/*
 * RealtimeClientEventConversationItemDelete.h
 *
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventConversationItemDelete_H_
#define TINY_CPP_CLIENT_RealtimeClientEventConversationItemDelete_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventConversationItemDelete{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventConversationItemDelete();
    RealtimeClientEventConversationItemDelete(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventConversationItemDelete();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string event_id{};
    std::string type{};
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventConversationItemDelete_H_ */
