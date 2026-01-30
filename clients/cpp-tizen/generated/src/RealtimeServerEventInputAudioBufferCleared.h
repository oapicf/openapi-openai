/*
 * RealtimeServerEventInputAudioBufferCleared.h
 *
 * Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
 */

#ifndef _RealtimeServerEventInputAudioBufferCleared_H_
#define _RealtimeServerEventInputAudioBufferCleared_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferCleared : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventInputAudioBufferCleared();
	RealtimeServerEventInputAudioBufferCleared(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventInputAudioBufferCleared();

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
	/*! \brief Get The event type, must be `input_audio_buffer.cleared`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.cleared`.
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

#endif /* _RealtimeServerEventInputAudioBufferCleared_H_ */
