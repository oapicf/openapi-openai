
/*
 * RealtimeClientEventInputAudioBufferCommit.h
 *
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an &#x60;input_audio_buffer.committed&#x60;  event. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferCommit_H_
#define TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferCommit_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferCommit{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventInputAudioBufferCommit();
    RealtimeClientEventInputAudioBufferCommit(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventInputAudioBufferCommit();


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
	/*! \brief Get The event type, must be `input_audio_buffer.commit`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.commit`.
	 */
	void setType(std::string  type);


    private:
    std::string event_id{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferCommit_H_ */
