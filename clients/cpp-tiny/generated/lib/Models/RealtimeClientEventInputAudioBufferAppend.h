
/*
 * RealtimeClientEventInputAudioBufferAppend.h
 *
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferAppend_H_
#define TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferAppend_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferAppend{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventInputAudioBufferAppend();
    RealtimeClientEventInputAudioBufferAppend(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventInputAudioBufferAppend();


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
    std::string event_id{};
    std::string type{};
    std::string audio{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferAppend_H_ */
