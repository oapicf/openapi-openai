
/*
 * RealtimeServerEventInputAudioBufferSpeechStopped.h
 *
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferSpeechStopped_H_
#define TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferSpeechStopped_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferSpeechStopped{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventInputAudioBufferSpeechStopped();
    RealtimeServerEventInputAudioBufferSpeechStopped(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventInputAudioBufferSpeechStopped();


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
    std::string event_id{};
    std::string type{};
    int audio_end_ms{};
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferSpeechStopped_H_ */
