
/*
 * RealtimeServerEventInputAudioBufferCommitted.h
 *
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCommitted_H_
#define TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCommitted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferCommitted{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventInputAudioBufferCommitted();
    RealtimeServerEventInputAudioBufferCommitted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventInputAudioBufferCommitted();


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
	/*! \brief Get The event type, must be `input_audio_buffer.committed`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.committed`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the preceding item after which the new item will be inserted. 
	 */
	std::string getPreviousItemId();

	/*! \brief Set The ID of the preceding item after which the new item will be inserted. 
	 */
	void setPreviousItemId(std::string  previous_item_id);
	/*! \brief Get The ID of the user message item that will be created.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the user message item that will be created.
	 */
	void setItemId(std::string  item_id);


    private:
    std::string event_id{};
    std::string type{};
    std::string previous_item_id{};
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCommitted_H_ */
