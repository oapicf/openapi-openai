/*
 * RealtimeClientEventInputAudioBufferCommit.h
 *
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an &#x60;input_audio_buffer.committed&#x60;  event. 
 */

#ifndef _RealtimeClientEventInputAudioBufferCommit_H_
#define _RealtimeClientEventInputAudioBufferCommit_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferCommit : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventInputAudioBufferCommit();
	RealtimeClientEventInputAudioBufferCommit(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventInputAudioBufferCommit();

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
	/*! \brief Get The event type, must be `input_audio_buffer.commit`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.commit`.
	 */
	void setType(std::string  type);

private:
	std::string event_id;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventInputAudioBufferCommit_H_ */
