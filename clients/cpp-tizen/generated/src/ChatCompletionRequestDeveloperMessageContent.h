/*
 * ChatCompletionRequestDeveloperMessage_content.h
 *
 * The contents of the developer message.
 */

#ifndef _ChatCompletionRequestDeveloperMessage_content_H_
#define _ChatCompletionRequestDeveloperMessage_content_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartText.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The contents of the developer message.
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestDeveloperMessage_content : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionRequestDeveloperMessage_content();
	ChatCompletionRequestDeveloperMessage_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionRequestDeveloperMessage_content();

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

#endif /* _ChatCompletionRequestDeveloperMessage_content_H_ */
