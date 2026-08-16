
/*
 * RealtimeClientEventConversationItemTruncate.h
 *
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventConversationItemTruncate_H_
#define TINY_CPP_CLIENT_RealtimeClientEventConversationItemTruncate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventConversationItemTruncate{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventConversationItemTruncate();
    RealtimeClientEventConversationItemTruncate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventConversationItemTruncate();


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
	/*! \brief Get The event type, must be `conversation.item.truncate`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.truncate`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
	 */
	std::string getItemId();

	/*! \brief Set The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the content part to truncate. Set this to 0.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part to truncate. Set this to 0.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
	 */
	int getAudioEndMs();

	/*! \brief Set Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
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

#endif /* TINY_CPP_CLIENT_RealtimeClientEventConversationItemTruncate_H_ */
