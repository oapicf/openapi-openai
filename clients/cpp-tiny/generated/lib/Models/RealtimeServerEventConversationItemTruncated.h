
/*
 * RealtimeServerEventConversationItemTruncated.h
 *
 * Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationItemTruncated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationItemTruncated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemTruncated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationItemTruncated();
    RealtimeServerEventConversationItemTruncated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationItemTruncated();


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
	/*! \brief Get The event type, must be `conversation.item.truncated`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.truncated`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the assistant message item that was truncated.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the assistant message item that was truncated.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the content part that was truncated.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part that was truncated.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get The duration up to which the audio was truncated, in milliseconds. 
	 */
	int getAudioEndMs();

	/*! \brief Set The duration up to which the audio was truncated, in milliseconds. 
	 */
	void setAudioEndMs(int  audio_end_ms);


    private:
    std::string event_id{};
    std::string type{};
    std::string item_id{};
    int content_index{};
    int audio_end_ms{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationItemTruncated_H_ */
