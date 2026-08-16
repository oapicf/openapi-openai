
/*
 * RealtimeServerEventResponseOutputItemAdded.h
 *
 * Returned when a new Item is created during Response generation.
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseOutputItemAdded_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseOutputItemAdded_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeConversationItem.h"

namespace Tiny {


/*! \brief Returned when a new Item is created during Response generation.
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseOutputItemAdded{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseOutputItemAdded();
    RealtimeServerEventResponseOutputItemAdded(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseOutputItemAdded();


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
    std::string event_id{};
    std::string type{};
    std::string response_id{};
    int output_index{};
    RealtimeConversationItem item;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseOutputItemAdded_H_ */
