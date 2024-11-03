/*
 * ChatCompletionRequestUserMessage_content.h
 *
 * The contents of the user message. 
 */

#ifndef _ChatCompletionRequestUserMessage_content_H_
#define _ChatCompletionRequestUserMessage_content_H_


#include <string>
#include "ChatCompletionRequestMessageContentPart.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The contents of the user message. 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestUserMessage_content : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestUserMessage_content();
	ChatCompletionRequestUserMessage_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestUserMessage_content();

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

#endif /* _ChatCompletionRequestUserMessage_content_H_ */
