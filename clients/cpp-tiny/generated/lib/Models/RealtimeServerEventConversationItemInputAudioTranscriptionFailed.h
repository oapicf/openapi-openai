
/*
 * RealtimeServerEventConversationItemInputAudioTranscriptionFailed.h
 *
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_
#define TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.h"

namespace Tiny {


/*! \brief Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemInputAudioTranscriptionFailed{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed();
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventConversationItemInputAudioTranscriptionFailed();


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
	/*! \brief Get The event type, must be `conversation.item.input_audio_transcription.failed`. 
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.input_audio_transcription.failed`. 
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the user message item.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the user message item.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the content part containing the audio.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part containing the audio.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get 
	 */
	RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error getError();

	/*! \brief Set 
	 */
	void setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error  error);


    private:
    std::string event_id{};
    std::string type{};
    std::string item_id{};
    int content_index{};
    RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error error;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_ */
