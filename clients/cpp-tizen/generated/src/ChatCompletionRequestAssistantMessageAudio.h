/*
 * ChatCompletionRequestAssistantMessage_audio.h
 *
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */

#ifndef _ChatCompletionRequestAssistantMessage_audio_H_
#define _ChatCompletionRequestAssistantMessage_audio_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestAssistantMessage_audio : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestAssistantMessage_audio();
	ChatCompletionRequestAssistantMessage_audio(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestAssistantMessage_audio();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier for a previous audio response from the model. 
	 */
	std::string getId();

	/*! \brief Set Unique identifier for a previous audio response from the model. 
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestAssistantMessage_audio_H_ */
