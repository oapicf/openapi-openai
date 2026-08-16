
/*
 * RealtimeServerEventResponseAudioTranscriptDelta.h
 *
 * Returned when the model-generated transcription of audio output is updated. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseAudioTranscriptDelta_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseAudioTranscriptDelta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when the model-generated transcription of audio output is updated. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseAudioTranscriptDelta{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseAudioTranscriptDelta();
    RealtimeServerEventResponseAudioTranscriptDelta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseAudioTranscriptDelta();


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
	/*! \brief Get The event type, must be `response.audio_transcript.delta`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.audio_transcript.delta`.
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the response.
	 */
	std::string getResponseId();

	/*! \brief Set The ID of the response.
	 */
	void setResponseId(std::string  response_id);
	/*! \brief Get The ID of the item.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the item.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the output item in the response.
	 */
	int getOutputIndex();

	/*! \brief Set The index of the output item in the response.
	 */
	void setOutputIndex(int  output_index);
	/*! \brief Get The index of the content part in the item's content array.
	 */
	int getContentIndex();

	/*! \brief Set The index of the content part in the item's content array.
	 */
	void setContentIndex(int  content_index);
	/*! \brief Get The transcript delta.
	 */
	std::string getDelta();

	/*! \brief Set The transcript delta.
	 */
	void setDelta(std::string  delta);


    private:
    std::string event_id{};
    std::string type{};
    std::string response_id{};
    std::string item_id{};
    int output_index{};
    int content_index{};
    std::string delta{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseAudioTranscriptDelta_H_ */
