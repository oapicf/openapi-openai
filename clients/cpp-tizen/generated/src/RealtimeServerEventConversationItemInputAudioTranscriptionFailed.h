/*
 * RealtimeServerEventConversationItemInputAudioTranscriptionFailed.h
 *
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
 */

#ifndef _RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_
#define _RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_


#include <string>
#include "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemInputAudioTranscriptionFailed : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationItemInputAudioTranscriptionFailed();
	RealtimeServerEventConversationItemInputAudioTranscriptionFailed(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationItemInputAudioTranscriptionFailed();

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
	std::string event_id;
	std::string type;
	std::string item_id;
	int content_index;
	RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventConversationItemInputAudioTranscriptionFailed_H_ */
