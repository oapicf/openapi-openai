/*
 * RealtimeServerEventInputAudioBufferSpeechStarted.h
 *
 * Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
 */

#ifndef _RealtimeServerEventInputAudioBufferSpeechStarted_H_
#define _RealtimeServerEventInputAudioBufferSpeechStarted_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferSpeechStarted : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventInputAudioBufferSpeechStarted();
	RealtimeServerEventInputAudioBufferSpeechStarted(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventInputAudioBufferSpeechStarted();

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
	/*! \brief Get The event type, must be `input_audio_buffer.speech_started`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.speech_started`.
	 */
	void setType(std::string  type);
	/*! \brief Get Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
	 */
	int getAudioStartMs();

	/*! \brief Set Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
	 */
	void setAudioStartMs(int  audio_start_ms);
	/*! \brief Get The ID of the user message item that will be created when speech stops. 
	 */
	std::string getItemId();

	/*! \brief Set The ID of the user message item that will be created when speech stops. 
	 */
	void setItemId(std::string  item_id);

private:
	std::string event_id;
	std::string type;
	int audio_start_ms;
	std::string item_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventInputAudioBufferSpeechStarted_H_ */
