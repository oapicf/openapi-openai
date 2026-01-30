/*
 * RealtimeClientEventInputAudioBufferClear.h
 *
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
 */

#ifndef _RealtimeClientEventInputAudioBufferClear_H_
#define _RealtimeClientEventInputAudioBufferClear_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferClear : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventInputAudioBufferClear();
	RealtimeClientEventInputAudioBufferClear(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventInputAudioBufferClear();

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
	/*! \brief Get The event type, must be `input_audio_buffer.clear`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.clear`.
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

#endif /* _RealtimeClientEventInputAudioBufferClear_H_ */
