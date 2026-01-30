/*
 * RealtimeClientEventInputAudioBufferAppend.h
 *
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */

#ifndef _RealtimeClientEventInputAudioBufferAppend_H_
#define _RealtimeClientEventInputAudioBufferAppend_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferAppend : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventInputAudioBufferAppend();
	RealtimeClientEventInputAudioBufferAppend(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventInputAudioBufferAppend();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Optional client-generated ID used to identify this event.
	 */
	std::string getEventId();

	/*! \brief Set Optional client-generated ID used to identify this event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `input_audio_buffer.append`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.append`.
	 */
	void setType(std::string  type);
	/*! \brief Get Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
	 */
	std::string getAudio();

	/*! \brief Set Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
	 */
	void setAudio(std::string  audio);

private:
	std::string event_id;
	std::string type;
	std::string audio;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventInputAudioBufferAppend_H_ */
