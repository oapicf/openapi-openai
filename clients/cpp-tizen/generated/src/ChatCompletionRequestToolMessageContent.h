/*
 * ChatCompletionRequestToolMessage_content.h
 *
 * The contents of the tool message.
 */

#ifndef _ChatCompletionRequestToolMessage_content_H_
#define _ChatCompletionRequestToolMessage_content_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartText.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The contents of the tool message.
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestToolMessage_content : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestToolMessage_content();
	ChatCompletionRequestToolMessage_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestToolMessage_content();

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

#endif /* _ChatCompletionRequestToolMessage_content_H_ */
