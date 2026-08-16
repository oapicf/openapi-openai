
/*
 * RealtimeServerEventInputAudioBufferCleared.h
 *
 * Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCleared_H_
#define TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCleared_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventInputAudioBufferCleared{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventInputAudioBufferCleared();
    RealtimeServerEventInputAudioBufferCleared(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventInputAudioBufferCleared();


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
	/*! \brief Get The event type, must be `input_audio_buffer.cleared`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `input_audio_buffer.cleared`.
	 */
	void setType(std::string  type);


    private:
    std::string event_id{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventInputAudioBufferCleared_H_ */
