
/*
 * RealtimeClientEventInputAudioBufferClear.h
 *
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferClear_H_
#define TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferClear_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventInputAudioBufferClear{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventInputAudioBufferClear();
    RealtimeClientEventInputAudioBufferClear(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventInputAudioBufferClear();


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
	/*! \brief Get The event type, must be `input_audio_buffer.clear`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.clear`.
	 */
	void setType(std::string  type);


    private:
    std::string event_id{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventInputAudioBufferClear_H_ */
