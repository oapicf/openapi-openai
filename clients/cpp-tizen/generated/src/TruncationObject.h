/*
 * TruncationObject.h
 *
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 */

#ifndef _TruncationObject_H_
#define _TruncationObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 *
 *  \ingroup Models
 *
 */

class TruncationObject : public Object {
public:
	/*! \brief Constructor.
	 */
	TruncationObject();
	TruncationObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TruncationObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
	 */
	std::string getType();

	/*! \brief Set The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
	 */
	void setType(std::string  type);
	/*! \brief Get The number of most recent messages from the thread when constructing the context for the run.
	 */
	int getLastMessages();

	/*! \brief Set The number of most recent messages from the thread when constructing the context for the run.
	 */
	void setLastMessages(int  last_messages);

private:
	std::string type;
	int last_messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TruncationObject_H_ */
