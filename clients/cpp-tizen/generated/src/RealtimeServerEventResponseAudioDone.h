/*
 * RealtimeServerEventResponseAudioDone.h
 *
 * Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

#ifndef _RealtimeServerEventResponseAudioDone_H_
#define _RealtimeServerEventResponseAudioDone_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseAudioDone : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseAudioDone();
	RealtimeServerEventResponseAudioDone(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseAudioDone();

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
	/*! \brief Get The event type, must be `response.audio.done`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.audio.done`.
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

private:
	std::string event_id;
	std::string type;
	std::string response_id;
	std::string item_id;
	int output_index;
	int content_index;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventResponseAudioDone_H_ */
