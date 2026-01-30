/*
 * RealtimeServerEventInputAudioBufferSpeechStopped.h
 *
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
 */

#ifndef _RealtimeServerEventInputAudioBufferSpeechStopped_H_
#define _RealtimeServerEventInputAudioBufferSpeechStopped_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferSpeechStopped : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventInputAudioBufferSpeechStopped();
	RealtimeServerEventInputAudioBufferSpeechStopped(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventInputAudioBufferSpeechStopped();

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
	/*! \brief Get The event type, must be `input_audio_buffer.speech_stopped`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.speech_stopped`.
	 */
	void setType(std::string  type);
	/*! \brief Get Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
	 */
	int getAudioEndMs();

	/*! \brief Set Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
	 */
	void setAudioEndMs(int  audio_end_ms);
	/*! \brief Get The ID of the user message item that will be created.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the user message item that will be created.
	 */
	void setItemId(std::string  item_id);

private:
	std::string event_id;
	std::string type;
	int audio_end_ms;
	std::string item_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventInputAudioBufferSpeechStopped_H_ */
