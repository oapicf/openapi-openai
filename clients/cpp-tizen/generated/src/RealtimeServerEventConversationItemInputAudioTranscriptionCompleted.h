/*
 * RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.h
 *
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in &#x60;server_vad&#x60; mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always &#x60;whisper-1&#x60;. Thus the transcript may diverge somewhat from  the model&#39;s interpretation, and should be treated as a rough guide. 
 */

#ifndef _RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_H_
#define _RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventConversationItemInputAudioTranscriptionCompleted();
	RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventConversationItemInputAudioTranscriptionCompleted();

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
	/*! \brief Get The event type, must be `conversation.item.input_audio_transcription.completed`. 
	 */
	std::string getType();

	/*! \brief Set The event type, must be `conversation.item.input_audio_transcription.completed`. 
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the user message item containing the audio.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the user message item containing the audio.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the content part containing the audio.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part containing the audio.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get The transcribed text.
	 */
	std::string getTranscript();

	/*! \brief Set The transcribed text.
	 */
	void setTranscript(std::string  transcript);

private:
	std::string event_id;
	std::string type;
	std::string item_id;
	int content_index;
	std::string transcript;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventConversationItemInputAudioTranscriptionCompleted_H_ */
