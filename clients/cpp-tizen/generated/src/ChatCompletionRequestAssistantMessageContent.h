/*
 * ChatCompletionRequestAssistantMessage_content.h
 *
 * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
 */

#ifndef _ChatCompletionRequestAssistantMessage_content_H_
#define _ChatCompletionRequestAssistantMessage_content_H_


#include <string>
#include "ChatCompletionRequestAssistantMessageContentPart.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestAssistantMessage_content : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestAssistantMessage_content();
	ChatCompletionRequestAssistantMessage_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestAssistantMessage_content();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionRequestAssistantMessage_content_H_ */
